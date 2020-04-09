package com.chinasofti.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIdIsNull() {
            addCriterion("Sdepartment_id is null");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIdIsNotNull() {
            addCriterion("Sdepartment_id is not null");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIdEqualTo(Integer value) {
            addCriterion("Sdepartment_id =", value, "sdepartmentId");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIdNotEqualTo(Integer value) {
            addCriterion("Sdepartment_id <>", value, "sdepartmentId");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIdGreaterThan(Integer value) {
            addCriterion("Sdepartment_id >", value, "sdepartmentId");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sdepartment_id >=", value, "sdepartmentId");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIdLessThan(Integer value) {
            addCriterion("Sdepartment_id <", value, "sdepartmentId");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("Sdepartment_id <=", value, "sdepartmentId");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIdIn(List<Integer> values) {
            addCriterion("Sdepartment_id in", values, "sdepartmentId");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIdNotIn(List<Integer> values) {
            addCriterion("Sdepartment_id not in", values, "sdepartmentId");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("Sdepartment_id between", value1, value2, "sdepartmentId");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Sdepartment_id not between", value1, value2, "sdepartmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentAdddateIsNull() {
            addCriterion("department_addDate is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentAdddateIsNotNull() {
            addCriterion("department_addDate is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentAdddateEqualTo(Date value) {
            addCriterion("department_addDate =", value, "departmentAdddate");
            return (Criteria) this;
        }

        public Criteria andDepartmentAdddateNotEqualTo(Date value) {
            addCriterion("department_addDate <>", value, "departmentAdddate");
            return (Criteria) this;
        }

        public Criteria andDepartmentAdddateGreaterThan(Date value) {
            addCriterion("department_addDate >", value, "departmentAdddate");
            return (Criteria) this;
        }

        public Criteria andDepartmentAdddateGreaterThanOrEqualTo(Date value) {
            addCriterion("department_addDate >=", value, "departmentAdddate");
            return (Criteria) this;
        }

        public Criteria andDepartmentAdddateLessThan(Date value) {
            addCriterion("department_addDate <", value, "departmentAdddate");
            return (Criteria) this;
        }

        public Criteria andDepartmentAdddateLessThanOrEqualTo(Date value) {
            addCriterion("department_addDate <=", value, "departmentAdddate");
            return (Criteria) this;
        }

        public Criteria andDepartmentAdddateIn(List<Date> values) {
            addCriterion("department_addDate in", values, "departmentAdddate");
            return (Criteria) this;
        }

        public Criteria andDepartmentAdddateNotIn(List<Date> values) {
            addCriterion("department_addDate not in", values, "departmentAdddate");
            return (Criteria) this;
        }

        public Criteria andDepartmentAdddateBetween(Date value1, Date value2) {
            addCriterion("department_addDate between", value1, value2, "departmentAdddate");
            return (Criteria) this;
        }

        public Criteria andDepartmentAdddateNotBetween(Date value1, Date value2) {
            addCriterion("department_addDate not between", value1, value2, "departmentAdddate");
            return (Criteria) this;
        }

        public Criteria andDepartmentMdateIsNull() {
            addCriterion("department_mDate is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentMdateIsNotNull() {
            addCriterion("department_mDate is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentMdateEqualTo(Date value) {
            addCriterion("department_mDate =", value, "departmentMdate");
            return (Criteria) this;
        }

        public Criteria andDepartmentMdateNotEqualTo(Date value) {
            addCriterion("department_mDate <>", value, "departmentMdate");
            return (Criteria) this;
        }

        public Criteria andDepartmentMdateGreaterThan(Date value) {
            addCriterion("department_mDate >", value, "departmentMdate");
            return (Criteria) this;
        }

        public Criteria andDepartmentMdateGreaterThanOrEqualTo(Date value) {
            addCriterion("department_mDate >=", value, "departmentMdate");
            return (Criteria) this;
        }

        public Criteria andDepartmentMdateLessThan(Date value) {
            addCriterion("department_mDate <", value, "departmentMdate");
            return (Criteria) this;
        }

        public Criteria andDepartmentMdateLessThanOrEqualTo(Date value) {
            addCriterion("department_mDate <=", value, "departmentMdate");
            return (Criteria) this;
        }

        public Criteria andDepartmentMdateIn(List<Date> values) {
            addCriterion("department_mDate in", values, "departmentMdate");
            return (Criteria) this;
        }

        public Criteria andDepartmentMdateNotIn(List<Date> values) {
            addCriterion("department_mDate not in", values, "departmentMdate");
            return (Criteria) this;
        }

        public Criteria andDepartmentMdateBetween(Date value1, Date value2) {
            addCriterion("department_mDate between", value1, value2, "departmentMdate");
            return (Criteria) this;
        }

        public Criteria andDepartmentMdateNotBetween(Date value1, Date value2) {
            addCriterion("department_mDate not between", value1, value2, "departmentMdate");
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