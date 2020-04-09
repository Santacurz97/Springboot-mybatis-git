package com.chinasofti.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNull() {
            addCriterion("staff_sex is null");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNotNull() {
            addCriterion("staff_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSexEqualTo(String value) {
            addCriterion("staff_sex =", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotEqualTo(String value) {
            addCriterion("staff_sex <>", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThan(String value) {
            addCriterion("staff_sex >", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThanOrEqualTo(String value) {
            addCriterion("staff_sex >=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThan(String value) {
            addCriterion("staff_sex <", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThanOrEqualTo(String value) {
            addCriterion("staff_sex <=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLike(String value) {
            addCriterion("staff_sex like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotLike(String value) {
            addCriterion("staff_sex not like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexIn(List<String> values) {
            addCriterion("staff_sex in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotIn(List<String> values) {
            addCriterion("staff_sex not in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexBetween(String value1, String value2) {
            addCriterion("staff_sex between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotBetween(String value1, String value2) {
            addCriterion("staff_sex not between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffBirthIsNull() {
            addCriterion("staff_birth is null");
            return (Criteria) this;
        }

        public Criteria andStaffBirthIsNotNull() {
            addCriterion("staff_birth is not null");
            return (Criteria) this;
        }

        public Criteria andStaffBirthEqualTo(Date value) {
            addCriterion("staff_birth =", value, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthNotEqualTo(Date value) {
            addCriterion("staff_birth <>", value, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthGreaterThan(Date value) {
            addCriterion("staff_birth >", value, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("staff_birth >=", value, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthLessThan(Date value) {
            addCriterion("staff_birth <", value, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthLessThanOrEqualTo(Date value) {
            addCriterion("staff_birth <=", value, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthIn(List<Date> values) {
            addCriterion("staff_birth in", values, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthNotIn(List<Date> values) {
            addCriterion("staff_birth not in", values, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthBetween(Date value1, Date value2) {
            addCriterion("staff_birth between", value1, value2, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthNotBetween(Date value1, Date value2) {
            addCriterion("staff_birth not between", value1, value2, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffNumIsNull() {
            addCriterion("staff_num is null");
            return (Criteria) this;
        }

        public Criteria andStaffNumIsNotNull() {
            addCriterion("staff_num is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNumEqualTo(String value) {
            addCriterion("staff_num =", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotEqualTo(String value) {
            addCriterion("staff_num <>", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumGreaterThan(String value) {
            addCriterion("staff_num >", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumGreaterThanOrEqualTo(String value) {
            addCriterion("staff_num >=", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLessThan(String value) {
            addCriterion("staff_num <", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLessThanOrEqualTo(String value) {
            addCriterion("staff_num <=", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLike(String value) {
            addCriterion("staff_num like", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotLike(String value) {
            addCriterion("staff_num not like", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumIn(List<String> values) {
            addCriterion("staff_num in", values, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotIn(List<String> values) {
            addCriterion("staff_num not in", values, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumBetween(String value1, String value2) {
            addCriterion("staff_num between", value1, value2, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotBetween(String value1, String value2) {
            addCriterion("staff_num not between", value1, value2, "staffNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Integer value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Integer value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Integer value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Integer value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Integer> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Integer> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_id not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andProbationIsNull() {
            addCriterion("probation is null");
            return (Criteria) this;
        }

        public Criteria andProbationIsNotNull() {
            addCriterion("probation is not null");
            return (Criteria) this;
        }

        public Criteria andProbationEqualTo(Integer value) {
            addCriterion("probation =", value, "probation");
            return (Criteria) this;
        }

        public Criteria andProbationNotEqualTo(Integer value) {
            addCriterion("probation <>", value, "probation");
            return (Criteria) this;
        }

        public Criteria andProbationGreaterThan(Integer value) {
            addCriterion("probation >", value, "probation");
            return (Criteria) this;
        }

        public Criteria andProbationGreaterThanOrEqualTo(Integer value) {
            addCriterion("probation >=", value, "probation");
            return (Criteria) this;
        }

        public Criteria andProbationLessThan(Integer value) {
            addCriterion("probation <", value, "probation");
            return (Criteria) this;
        }

        public Criteria andProbationLessThanOrEqualTo(Integer value) {
            addCriterion("probation <=", value, "probation");
            return (Criteria) this;
        }

        public Criteria andProbationIn(List<Integer> values) {
            addCriterion("probation in", values, "probation");
            return (Criteria) this;
        }

        public Criteria andProbationNotIn(List<Integer> values) {
            addCriterion("probation not in", values, "probation");
            return (Criteria) this;
        }

        public Criteria andProbationBetween(Integer value1, Integer value2) {
            addCriterion("probation between", value1, value2, "probation");
            return (Criteria) this;
        }

        public Criteria andProbationNotBetween(Integer value1, Integer value2) {
            addCriterion("probation not between", value1, value2, "probation");
            return (Criteria) this;
        }

        public Criteria andQuitIsNull() {
            addCriterion("quit is null");
            return (Criteria) this;
        }

        public Criteria andQuitIsNotNull() {
            addCriterion("quit is not null");
            return (Criteria) this;
        }

        public Criteria andQuitEqualTo(Integer value) {
            addCriterion("quit =", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitNotEqualTo(Integer value) {
            addCriterion("quit <>", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitGreaterThan(Integer value) {
            addCriterion("quit >", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitGreaterThanOrEqualTo(Integer value) {
            addCriterion("quit >=", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitLessThan(Integer value) {
            addCriterion("quit <", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitLessThanOrEqualTo(Integer value) {
            addCriterion("quit <=", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitIn(List<Integer> values) {
            addCriterion("quit in", values, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitNotIn(List<Integer> values) {
            addCriterion("quit not in", values, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitBetween(Integer value1, Integer value2) {
            addCriterion("quit between", value1, value2, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitNotBetween(Integer value1, Integer value2) {
            addCriterion("quit not between", value1, value2, "quit");
            return (Criteria) this;
        }

        public Criteria andStaffAdddateIsNull() {
            addCriterion("staff_addDate is null");
            return (Criteria) this;
        }

        public Criteria andStaffAdddateIsNotNull() {
            addCriterion("staff_addDate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAdddateEqualTo(Date value) {
            addCriterion("staff_addDate =", value, "staffAdddate");
            return (Criteria) this;
        }

        public Criteria andStaffAdddateNotEqualTo(Date value) {
            addCriterion("staff_addDate <>", value, "staffAdddate");
            return (Criteria) this;
        }

        public Criteria andStaffAdddateGreaterThan(Date value) {
            addCriterion("staff_addDate >", value, "staffAdddate");
            return (Criteria) this;
        }

        public Criteria andStaffAdddateGreaterThanOrEqualTo(Date value) {
            addCriterion("staff_addDate >=", value, "staffAdddate");
            return (Criteria) this;
        }

        public Criteria andStaffAdddateLessThan(Date value) {
            addCriterion("staff_addDate <", value, "staffAdddate");
            return (Criteria) this;
        }

        public Criteria andStaffAdddateLessThanOrEqualTo(Date value) {
            addCriterion("staff_addDate <=", value, "staffAdddate");
            return (Criteria) this;
        }

        public Criteria andStaffAdddateIn(List<Date> values) {
            addCriterion("staff_addDate in", values, "staffAdddate");
            return (Criteria) this;
        }

        public Criteria andStaffAdddateNotIn(List<Date> values) {
            addCriterion("staff_addDate not in", values, "staffAdddate");
            return (Criteria) this;
        }

        public Criteria andStaffAdddateBetween(Date value1, Date value2) {
            addCriterion("staff_addDate between", value1, value2, "staffAdddate");
            return (Criteria) this;
        }

        public Criteria andStaffAdddateNotBetween(Date value1, Date value2) {
            addCriterion("staff_addDate not between", value1, value2, "staffAdddate");
            return (Criteria) this;
        }

        public Criteria andStaffMdateIsNull() {
            addCriterion("staff_mDate is null");
            return (Criteria) this;
        }

        public Criteria andStaffMdateIsNotNull() {
            addCriterion("staff_mDate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffMdateEqualTo(Date value) {
            addCriterion("staff_mDate =", value, "staffMdate");
            return (Criteria) this;
        }

        public Criteria andStaffMdateNotEqualTo(Date value) {
            addCriterion("staff_mDate <>", value, "staffMdate");
            return (Criteria) this;
        }

        public Criteria andStaffMdateGreaterThan(Date value) {
            addCriterion("staff_mDate >", value, "staffMdate");
            return (Criteria) this;
        }

        public Criteria andStaffMdateGreaterThanOrEqualTo(Date value) {
            addCriterion("staff_mDate >=", value, "staffMdate");
            return (Criteria) this;
        }

        public Criteria andStaffMdateLessThan(Date value) {
            addCriterion("staff_mDate <", value, "staffMdate");
            return (Criteria) this;
        }

        public Criteria andStaffMdateLessThanOrEqualTo(Date value) {
            addCriterion("staff_mDate <=", value, "staffMdate");
            return (Criteria) this;
        }

        public Criteria andStaffMdateIn(List<Date> values) {
            addCriterion("staff_mDate in", values, "staffMdate");
            return (Criteria) this;
        }

        public Criteria andStaffMdateNotIn(List<Date> values) {
            addCriterion("staff_mDate not in", values, "staffMdate");
            return (Criteria) this;
        }

        public Criteria andStaffMdateBetween(Date value1, Date value2) {
            addCriterion("staff_mDate between", value1, value2, "staffMdate");
            return (Criteria) this;
        }

        public Criteria andStaffMdateNotBetween(Date value1, Date value2) {
            addCriterion("staff_mDate not between", value1, value2, "staffMdate");
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