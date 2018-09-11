package com.example.demo.service.Impl;

import com.example.demo.controller.mongodb.Users;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    MongoOperations mongoTemplate;

    public void saveUser(Users users) {
        mongoTemplate.save(users);
    }

    public Users findUserByNameAndAge(String name, int age) {
        Criteria criatira = new Criteria();
        criatira.andOperator(Criteria.where("name").is(name), Criteria.where("age").is(age));
        return mongoTemplate.findOne(new Query(criatira), Users.class);
    }

    public void removeUser(String name) {
        mongoTemplate.remove(new Query(Criteria.where("name").is(name)),
                Users.class);
    }

    public void updateUser(String name, String key, String value) {
        mongoTemplate.updateFirst(new Query(Criteria.where("name").is(name)),
                Update.update(key, value), Users.class);

    }

    public List<Users> listUser() {
        return mongoTemplate.findAll(Users.class);
    }
}