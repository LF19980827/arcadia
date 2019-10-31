package com.aurora.arcadia.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMessageExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUGenderIsNull() {
            addCriterion("u_gender is null");
            return (Criteria) this;
        }

        public Criteria andUGenderIsNotNull() {
            addCriterion("u_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUGenderEqualTo(String value) {
            addCriterion("u_gender =", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotEqualTo(String value) {
            addCriterion("u_gender <>", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderGreaterThan(String value) {
            addCriterion("u_gender >", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderGreaterThanOrEqualTo(String value) {
            addCriterion("u_gender >=", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderLessThan(String value) {
            addCriterion("u_gender <", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderLessThanOrEqualTo(String value) {
            addCriterion("u_gender <=", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderLike(String value) {
            addCriterion("u_gender like", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotLike(String value) {
            addCriterion("u_gender not like", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderIn(List<String> values) {
            addCriterion("u_gender in", values, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotIn(List<String> values) {
            addCriterion("u_gender not in", values, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderBetween(String value1, String value2) {
            addCriterion("u_gender between", value1, value2, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotBetween(String value1, String value2) {
            addCriterion("u_gender not between", value1, value2, "uGender");
            return (Criteria) this;
        }

        public Criteria andUBirthIsNull() {
            addCriterion("u_birth is null");
            return (Criteria) this;
        }

        public Criteria andUBirthIsNotNull() {
            addCriterion("u_birth is not null");
            return (Criteria) this;
        }

        public Criteria andUBirthEqualTo(Date value) {
            addCriterionForJDBCDate("u_birth =", value, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_birth <>", value, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("u_birth >", value, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_birth >=", value, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthLessThan(Date value) {
            addCriterionForJDBCDate("u_birth <", value, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_birth <=", value, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthIn(List<Date> values) {
            addCriterionForJDBCDate("u_birth in", values, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_birth not in", values, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_birth between", value1, value2, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_birth not between", value1, value2, "uBirth");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNull() {
            addCriterion("u_address is null");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNotNull() {
            addCriterion("u_address is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressEqualTo(String value) {
            addCriterion("u_address =", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotEqualTo(String value) {
            addCriterion("u_address <>", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThan(String value) {
            addCriterion("u_address >", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThanOrEqualTo(String value) {
            addCriterion("u_address >=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThan(String value) {
            addCriterion("u_address <", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThanOrEqualTo(String value) {
            addCriterion("u_address <=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLike(String value) {
            addCriterion("u_address like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotLike(String value) {
            addCriterion("u_address not like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressIn(List<String> values) {
            addCriterion("u_address in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotIn(List<String> values) {
            addCriterion("u_address not in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressBetween(String value1, String value2) {
            addCriterion("u_address between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotBetween(String value1, String value2) {
            addCriterion("u_address not between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUCareerIsNull() {
            addCriterion("u_career is null");
            return (Criteria) this;
        }

        public Criteria andUCareerIsNotNull() {
            addCriterion("u_career is not null");
            return (Criteria) this;
        }

        public Criteria andUCareerEqualTo(String value) {
            addCriterion("u_career =", value, "uCareer");
            return (Criteria) this;
        }

        public Criteria andUCareerNotEqualTo(String value) {
            addCriterion("u_career <>", value, "uCareer");
            return (Criteria) this;
        }

        public Criteria andUCareerGreaterThan(String value) {
            addCriterion("u_career >", value, "uCareer");
            return (Criteria) this;
        }

        public Criteria andUCareerGreaterThanOrEqualTo(String value) {
            addCriterion("u_career >=", value, "uCareer");
            return (Criteria) this;
        }

        public Criteria andUCareerLessThan(String value) {
            addCriterion("u_career <", value, "uCareer");
            return (Criteria) this;
        }

        public Criteria andUCareerLessThanOrEqualTo(String value) {
            addCriterion("u_career <=", value, "uCareer");
            return (Criteria) this;
        }

        public Criteria andUCareerLike(String value) {
            addCriterion("u_career like", value, "uCareer");
            return (Criteria) this;
        }

        public Criteria andUCareerNotLike(String value) {
            addCriterion("u_career not like", value, "uCareer");
            return (Criteria) this;
        }

        public Criteria andUCareerIn(List<String> values) {
            addCriterion("u_career in", values, "uCareer");
            return (Criteria) this;
        }

        public Criteria andUCareerNotIn(List<String> values) {
            addCriterion("u_career not in", values, "uCareer");
            return (Criteria) this;
        }

        public Criteria andUCareerBetween(String value1, String value2) {
            addCriterion("u_career between", value1, value2, "uCareer");
            return (Criteria) this;
        }

        public Criteria andUCareerNotBetween(String value1, String value2) {
            addCriterion("u_career not between", value1, value2, "uCareer");
            return (Criteria) this;
        }

        public Criteria andUIntroIsNull() {
            addCriterion("u_intro is null");
            return (Criteria) this;
        }

        public Criteria andUIntroIsNotNull() {
            addCriterion("u_intro is not null");
            return (Criteria) this;
        }

        public Criteria andUIntroEqualTo(String value) {
            addCriterion("u_intro =", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroNotEqualTo(String value) {
            addCriterion("u_intro <>", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroGreaterThan(String value) {
            addCriterion("u_intro >", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroGreaterThanOrEqualTo(String value) {
            addCriterion("u_intro >=", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroLessThan(String value) {
            addCriterion("u_intro <", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroLessThanOrEqualTo(String value) {
            addCriterion("u_intro <=", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroLike(String value) {
            addCriterion("u_intro like", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroNotLike(String value) {
            addCriterion("u_intro not like", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroIn(List<String> values) {
            addCriterion("u_intro in", values, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroNotIn(List<String> values) {
            addCriterion("u_intro not in", values, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroBetween(String value1, String value2) {
            addCriterion("u_intro between", value1, value2, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroNotBetween(String value1, String value2) {
            addCriterion("u_intro not between", value1, value2, "uIntro");
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