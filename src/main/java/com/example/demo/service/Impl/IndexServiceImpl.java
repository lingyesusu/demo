package com.example.demo.service.Impl;

import com.example.demo.entity.TTeam;
import com.example.demo.entity.TTeamExample;
import com.example.demo.mapper.TTeamMapper;
import com.example.demo.service.IIndexService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SCPC03 on 2018/8/7.
 */
@Service
public class IndexServiceImpl implements IIndexService {
    @Autowired
    private TTeamMapper tTeamMapper;

    @Override
    public List<TTeam> initIndex() {
        PageHelper.startPage(1,5);
        TTeamExample tTeamExample = new TTeamExample();
        tTeamExample.createCriteria();
        List<TTeam> tTeams = tTeamMapper.selectByExample(tTeamExample);
        PageInfo<TTeam> tTeamPageInfo = new PageInfo<>(tTeams);
        return tTeamPageInfo.getList();
    }

}
