package com.example.demo.entity;

import java.io.Serializable;

public class TTeam implements Serializable{
    private String cId;

    private Integer nTeamid;

    private Integer nMemberscount;

    private String cDepartmentname;

    private String cName;

    private Integer nProductionid;

    private Integer nLeaderuserid;

    private String cLeadername;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public Integer getnTeamid() {
        return nTeamid;
    }

    public void setnTeamid(Integer nTeamid) {
        this.nTeamid = nTeamid;
    }

    public Integer getnMemberscount() {
        return nMemberscount;
    }

    public void setnMemberscount(Integer nMemberscount) {
        this.nMemberscount = nMemberscount;
    }

    public String getcDepartmentname() {
        return cDepartmentname;
    }

    public void setcDepartmentname(String cDepartmentname) {
        this.cDepartmentname = cDepartmentname;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getnProductionid() {
        return nProductionid;
    }

    public void setnProductionid(Integer nProductionid) {
        this.nProductionid = nProductionid;
    }

    public Integer getnLeaderuserid() {
        return nLeaderuserid;
    }

    public void setnLeaderuserid(Integer nLeaderuserid) {
        this.nLeaderuserid = nLeaderuserid;
    }

    public String getcLeadername() {
        return cLeadername;
    }

    public void setcLeadername(String cLeadername) {
        this.cLeadername = cLeadername;
    }
}