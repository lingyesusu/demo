package com.example.demo.controller;

import com.example.demo.controller.mongodb.Users;
import com.example.demo.entity.TTeam;
import com.example.demo.service.IIndexService;
import com.example.demo.service.IUserService;
import com.example.demo.vo.IndexVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by SCPC03 on 2018/8/7.
 */
@Controller
public class MongodbController {
    private static Logger logger = LoggerFactory.getLogger(MongodbController.class);
    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/save")
    private String save(){
        Users users = new Users("1", "小明", 10);
        users.setAddress("青岛市");
        userService.saveUser(users);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/update")
    public String update(){
        userService.updateUser("小明", "name", "与他故意");
        return "success";
    }

    @ResponseBody
    @RequestMapping("/getList")
    public String getList(){
        List<Users> list = userService.listUser();
        System.out.println("一共这么多人:"+list.size());
        return "success";
    }

    @ResponseBody
    @RequestMapping("/del")
    public String del(){
        userService.removeUser("与他故意");
        return "success";
    }

}