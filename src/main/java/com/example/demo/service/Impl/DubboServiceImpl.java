package com.example.demo.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.entity.TTeam;
import com.example.demo.entity.TTeamExample;
import com.example.demo.mapper.TTeamMapper;
import com.example.demo.service.IDubboService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by SCPC03 on 2018/8/8.
 */
@Service(version = "1.0.0")
public class DubboServiceImpl implements IDubboService {

    @Autowired
    private TTeamMapper tTeamMapper;

    @Override
    public List<TTeam> initIndex() {
        PageHelper.startPage(2,5);
        TTeamExample tTeamExample = new TTeamExample();
        tTeamExample.createCriteria();
        List<TTeam> tTeams = tTeamMapper.selectByExample(tTeamExample);
        PageInfo<TTeam> tTeamPageInfo = new PageInfo<>(tTeams);
        return tTeamPageInfo.getList();
    }

}