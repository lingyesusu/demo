package com.example.demo.controller;

import com.example.demo.entity.TTeam;
import com.example.demo.service.IIndexService;
import com.example.demo.vo.IndexVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by SCPC03 on 2018/8/7.
 */
@Controller
public class IndexController {
    private static Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Resource
    private IIndexService iIndexService;

    @ResponseBody
    @RequestMapping("/index")
    private String index(){
        logger.error("1");
        List<TTeam> list = iIndexService.initIndex();
        for (TTeam tTeam : list){
            System.out.println(tTeam.getcLeadername());
        }
        return "index";
    }

    @ResponseBody
    @RequestMapping("/indexVo")
    public String indexVo(IndexVo indexVo){
        System.out.println(indexVo.getAge()+indexVo.getName());
        return "index";
    }

}