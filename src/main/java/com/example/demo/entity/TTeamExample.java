package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class TTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTeamExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCIdIsNull() {
            addCriterion("C_ID is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("C_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(String value) {
            addCriterion("C_ID =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(String value) {
            addCriterion("C_ID <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(String value) {
            addCriterion("C_ID >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_ID >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(String value) {
            addCriterion("C_ID <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(String value) {
            addCriterion("C_ID <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(String value) {
            addCriterion("C_ID like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(String value) {
            addCriterion("C_ID not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<String> values) {
            addCriterion("C_ID in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<String> values) {
            addCriterion("C_ID not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(String value1, String value2) {
            addCriterion("C_ID between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("C_ID not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andNTeamidIsNull() {
            addCriterion("N_TEAMID is null");
            return (Criteria) this;
        }

        public Criteria andNTeamidIsNotNull() {
            addCriterion("N_TEAMID is not null");
            return (Criteria) this;
        }

        public Criteria andNTeamidEqualTo(Integer value) {
            addCriterion("N_TEAMID =", value, "nTeamid");
            return (Criteria) this;
        }

        public Criteria andNTeamidNotEqualTo(Integer value) {
            addCriterion("N_TEAMID <>", value, "nTeamid");
            return (Criteria) this;
        }

        public Criteria andNTeamidGreaterThan(Integer value) {
            addCriterion("N_TEAMID >", value, "nTeamid");
            return (Criteria) this;
        }

        public Criteria andNTeamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("N_TEAMID >=", value, "nTeamid");
            return (Criteria) this;
        }

        public Criteria andNTeamidLessThan(Integer value) {
            addCriterion("N_TEAMID <", value, "nTeamid");
            return (Criteria) this;
        }

        public Criteria andNTeamidLessThanOrEqualTo(Integer value) {
            addCriterion("N_TEAMID <=", value, "nTeamid");
            return (Criteria) this;
        }

        public Criteria andNTeamidIn(List<Integer> values) {
            addCriterion("N_TEAMID in", values, "nTeamid");
            return (Criteria) this;
        }

        public Criteria andNTeamidNotIn(List<Integer> values) {
            addCriterion("N_TEAMID not in", values, "nTeamid");
            return (Criteria) this;
        }

        public Criteria andNTeamidBetween(Integer value1, Integer value2) {
            addCriterion("N_TEAMID between", value1, value2, "nTeamid");
            return (Criteria) this;
        }

        public Criteria andNTeamidNotBetween(Integer value1, Integer value2) {
            addCriterion("N_TEAMID not between", value1, value2, "nTeamid");
            return (Criteria) this;
        }

        public Criteria andNMemberscountIsNull() {
            addCriterion("N_MEMBERSCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNMemberscountIsNotNull() {
            addCriterion("N_MEMBERSCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNMemberscountEqualTo(Integer value) {
            addCriterion("N_MEMBERSCOUNT =", value, "nMemberscount");
            return (Criteria) this;
        }

        public Criteria andNMemberscountNotEqualTo(Integer value) {
            addCriterion("N_MEMBERSCOUNT <>", value, "nMemberscount");
            return (Criteria) this;
        }

        public Criteria andNMemberscountGreaterThan(Integer value) {
            addCriterion("N_MEMBERSCOUNT >", value, "nMemberscount");
            return (Criteria) this;
        }

        public Criteria andNMemberscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("N_MEMBERSCOUNT >=", value, "nMemberscount");
            return (Criteria) this;
        }

        public Criteria andNMemberscountLessThan(Integer value) {
            addCriterion("N_MEMBERSCOUNT <", value, "nMemberscount");
            return (Criteria) this;
        }

        public Criteria andNMemberscountLessThanOrEqualTo(Integer value) {
            addCriterion("N_MEMBERSCOUNT <=", value, "nMemberscount");
            return (Criteria) this;
        }

        public Criteria andNMemberscountIn(List<Integer> values) {
            addCriterion("N_MEMBERSCOUNT in", values, "nMemberscount");
            return (Criteria) this;
        }

        public Criteria andNMemberscountNotIn(List<Integer> values) {
            addCriterion("N_MEMBERSCOUNT not in", values, "nMemberscount");
            return (Criteria) this;
        }

        public Criteria andNMemberscountBetween(Integer value1, Integer value2) {
            addCriterion("N_MEMBERSCOUNT between", value1, value2, "nMemberscount");
            return (Criteria) this;
        }

        public Criteria andNMemberscountNotBetween(Integer value1, Integer value2) {
            addCriterion("N_MEMBERSCOUNT not between", value1, value2, "nMemberscount");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameIsNull() {
            addCriterion("C_DEPARTMENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameIsNotNull() {
            addCriterion("C_DEPARTMENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameEqualTo(String value) {
            addCriterion("C_DEPARTMENTNAME =", value, "cDepartmentname");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameNotEqualTo(String value) {
            addCriterion("C_DEPARTMENTNAME <>", value, "cDepartmentname");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameGreaterThan(String value) {
            addCriterion("C_DEPARTMENTNAME >", value, "cDepartmentname");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("C_DEPARTMENTNAME >=", value, "cDepartmentname");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameLessThan(String value) {
            addCriterion("C_DEPARTMENTNAME <", value, "cDepartmentname");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("C_DEPARTMENTNAME <=", value, "cDepartmentname");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameLike(String value) {
            addCriterion("C_DEPARTMENTNAME like", value, "cDepartmentname");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameNotLike(String value) {
            addCriterion("C_DEPARTMENTNAME not like", value, "cDepartmentname");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameIn(List<String> values) {
            addCriterion("C_DEPARTMENTNAME in", values, "cDepartmentname");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameNotIn(List<String> values) {
            addCriterion("C_DEPARTMENTNAME not in", values, "cDepartmentname");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameBetween(String value1, String value2) {
            addCriterion("C_DEPARTMENTNAME between", value1, value2, "cDepartmentname");
            return (Criteria) this;
        }

        public Criteria andCDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("C_DEPARTMENTNAME not between", value1, value2, "cDepartmentname");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_NAME =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_NAME >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("C_NAME <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("C_NAME like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("C_NAME not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_NAME in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("C_NAME between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("C_NAME not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andNProductionidIsNull() {
            addCriterion("N_PRODUCTIONID is null");
            return (Criteria) this;
        }

        public Criteria andNProductionidIsNotNull() {
            addCriterion("N_PRODUCTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andNProductionidEqualTo(Integer value) {
            addCriterion("N_PRODUCTIONID =", value, "nProductionid");
            return (Criteria) this;
        }

        public Criteria andNProductionidNotEqualTo(Integer value) {
            addCriterion("N_PRODUCTIONID <>", value, "nProductionid");
            return (Criteria) this;
        }

        public Criteria andNProductionidGreaterThan(Integer value) {
            addCriterion("N_PRODUCTIONID >", value, "nProductionid");
            return (Criteria) this;
        }

        public Criteria andNProductionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("N_PRODUCTIONID >=", value, "nProductionid");
            return (Criteria) this;
        }

        public Criteria andNProductionidLessThan(Integer value) {
            addCriterion("N_PRODUCTIONID <", value, "nProductionid");
            return (Criteria) this;
        }

        public Criteria andNProductionidLessThanOrEqualTo(Integer value) {
            addCriterion("N_PRODUCTIONID <=", value, "nProductionid");
            return (Criteria) this;
        }

        public Criteria andNProductionidIn(List<Integer> values) {
            addCriterion("N_PRODUCTIONID in", values, "nProductionid");
            return (Criteria) this;
        }

        public Criteria andNProductionidNotIn(List<Integer> values) {
            addCriterion("N_PRODUCTIONID not in", values, "nProductionid");
            return (Criteria) this;
        }

        public Criteria andNProductionidBetween(Integer value1, Integer value2) {
            addCriterion("N_PRODUCTIONID between", value1, value2, "nProductionid");
            return (Criteria) this;
        }

        public Criteria andNProductionidNotBetween(Integer value1, Integer value2) {
            addCriterion("N_PRODUCTIONID not between", value1, value2, "nProductionid");
            return (Criteria) this;
        }

        public Criteria andNLeaderuseridIsNull() {
            addCriterion("N_LEADERUSERID is null");
            return (Criteria) this;
        }

        public Criteria andNLeaderuseridIsNotNull() {
            addCriterion("N_LEADERUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andNLeaderuseridEqualTo(Integer value) {
            addCriterion("N_LEADERUSERID =", value, "nLeaderuserid");
            return (Criteria) this;
        }

        public Criteria andNLeaderuseridNotEqualTo(Integer value) {
            addCriterion("N_LEADERUSERID <>", value, "nLeaderuserid");
            return (Criteria) this;
        }

        public Criteria andNLeaderuseridGreaterThan(Integer value) {
            addCriterion("N_LEADERUSERID >", value, "nLeaderuserid");
            return (Criteria) this;
        }

        public Criteria andNLeaderuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("N_LEADERUSERID >=", value, "nLeaderuserid");
            return (Criteria) this;
        }

        public Criteria andNLeaderuseridLessThan(Integer value) {
            addCriterion("N_LEADERUSERID <", value, "nLeaderuserid");
            return (Criteria) this;
        }

        public Criteria andNLeaderuseridLessThanOrEqualTo(Integer value) {
            addCriterion("N_LEADERUSERID <=", value, "nLeaderuserid");
            return (Criteria) this;
        }

        public Criteria andNLeaderuseridIn(List<Integer> values) {
            addCriterion("N_LEADERUSERID in", values, "nLeaderuserid");
            return (Criteria) this;
        }

        public Criteria andNLeaderuseridNotIn(List<Integer> values) {
            addCriterion("N_LEADERUSERID not in", values, "nLeaderuserid");
            return (Criteria) this;
        }

        public Criteria andNLeaderuseridBetween(Integer value1, Integer value2) {
            addCriterion("N_LEADERUSERID between", value1, value2, "nLeaderuserid");
            return (Criteria) this;
        }

        public Criteria andNLeaderuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("N_LEADERUSERID not between", value1, value2, "nLeaderuserid");
            return (Criteria) this;
        }

        public Criteria andCLeadernameIsNull() {
            addCriterion("C_LEADERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCLeadernameIsNotNull() {
            addCriterion("C_LEADERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCLeadernameEqualTo(String value) {
            addCriterion("C_LEADERNAME =", value, "cLeadername");
            return (Criteria) this;
        }

        public Criteria andCLeadernameNotEqualTo(String value) {
            addCriterion("C_LEADERNAME <>", value, "cLeadername");
            return (Criteria) this;
        }

        public Criteria andCLeadernameGreaterThan(String value) {
            addCriterion("C_LEADERNAME >", value, "cLeadername");
            return (Criteria) this;
        }

        public Criteria andCLeadernameGreaterThanOrEqualTo(String value) {
            addCriterion("C_LEADERNAME >=", value, "cLeadername");
            return (Criteria) this;
        }

        public Criteria andCLeadernameLessThan(String value) {
            addCriterion("C_LEADERNAME <", value, "cLeadername");
            return (Criteria) this;
        }

        public Criteria andCLeadernameLessThanOrEqualTo(String value) {
            addCriterion("C_LEADERNAME <=", value, "cLeadername");
            return (Criteria) this;
        }

        public Criteria andCLeadernameLike(String value) {
            addCriterion("C_LEADERNAME like", value, "cLeadername");
            return (Criteria) this;
        }

        public Criteria andCLeadernameNotLike(String value) {
            addCriterion("C_LEADERNAME not like", value, "cLeadername");
            return (Criteria) this;
        }

        public Criteria andCLeadernameIn(List<String> values) {
            addCriterion("C_LEADERNAME in", values, "cLeadername");
            return (Criteria) this;
        }

        public Criteria andCLeadernameNotIn(List<String> values) {
            addCriterion("C_LEADERNAME not in", values, "cLeadername");
            return (Criteria) this;
        }

        public Criteria andCLeadernameBetween(String value1, String value2) {
            addCriterion("C_LEADERNAME between", value1, value2, "cLeadername");
            return (Criteria) this;
        }

        public Criteria andCLeadernameNotBetween(String value1, String value2) {
            addCriterion("C_LEADERNAME not between", value1, value2, "cLeadername");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}