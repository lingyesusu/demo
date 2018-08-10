package com.example.demo.mapper;

import com.example.demo.entity.TTeam;
import com.example.demo.entity.TTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTeamMapper {
    long countByExample(TTeamExample example);

    int deleteByExample(TTeamExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TTeam record);

    int insertSelective(TTeam record);

    List<TTeam> selectByExample(TTeamExample example);

    TTeam selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TTeam record, @Param("example") TTeamExample example);

    int updateByExample(@Param("record") TTeam record, @Param("example") TTeamExample example);

    int updateByPrimaryKeySelective(TTeam record);

    int updateByPrimaryKey(TTeam record);
}