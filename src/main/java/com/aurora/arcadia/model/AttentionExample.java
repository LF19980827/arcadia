package com.aurora.arcadia.model;

import java.util.ArrayList;
import java.util.List;

public class AttentionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttentionExample() {
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

        public Criteria andAttIdIsNull() {
            addCriterion("att_id is null");
            return (Criteria) this;
        }

        public Criteria andAttIdIsNotNull() {
            addCriterion("att_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttIdEqualTo(Integer value) {
            addCriterion("att_id =", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdNotEqualTo(Integer value) {
            addCriterion("att_id <>", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdGreaterThan(Integer value) {
            addCriterion("att_id >", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("att_id >=", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdLessThan(Integer value) {
            addCriterion("att_id <", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdLessThanOrEqualTo(Integer value) {
            addCriterion("att_id <=", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdIn(List<Integer> values) {
            addCriterion("att_id in", values, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdNotIn(List<Integer> values) {
            addCriterion("att_id not in", values, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdBetween(Integer value1, Integer value2) {
            addCriterion("att_id between", value1, value2, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdNotBetween(Integer value1, Integer value2) {
            addCriterion("att_id not between", value1, value2, "attId");
            return (Criteria) this;
        }

        public Criteria andAttUserIdIsNull() {
            addCriterion("att_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAttUserIdIsNotNull() {
            addCriterion("att_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttUserIdEqualTo(Integer value) {
            addCriterion("att_user_id =", value, "attUserId");
            return (Criteria) this;
        }

        public Criteria andAttUserIdNotEqualTo(Integer value) {
            addCriterion("att_user_id <>", value, "attUserId");
            return (Criteria) this;
        }

        public Criteria andAttUserIdGreaterThan(Integer value) {
            addCriterion("att_user_id >", value, "attUserId");
            return (Criteria) this;
        }

        public Criteria andAttUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("att_user_id >=", value, "attUserId");
            return (Criteria) this;
        }

        public Criteria andAttUserIdLessThan(Integer value) {
            addCriterion("att_user_id <", value, "attUserId");
            return (Criteria) this;
        }

        public Criteria andAttUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("att_user_id <=", value, "attUserId");
            return (Criteria) this;
        }

        public Criteria andAttUserIdIn(List<Integer> values) {
            addCriterion("att_user_id in", values, "attUserId");
            return (Criteria) this;
        }

        public Criteria andAttUserIdNotIn(List<Integer> values) {
            addCriterion("att_user_id not in", values, "attUserId");
            return (Criteria) this;
        }

        public Criteria andAttUserIdBetween(Integer value1, Integer value2) {
            addCriterion("att_user_id between", value1, value2, "attUserId");
            return (Criteria) this;
        }

        public Criteria andAttUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("att_user_id not between", value1, value2, "attUserId");
            return (Criteria) this;
        }

        public Criteria andAttBeUserIdIsNull() {
            addCriterion("att_be_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAttBeUserIdIsNotNull() {
            addCriterion("att_be_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttBeUserIdEqualTo(Integer value) {
            addCriterion("att_be_user_id =", value, "attBeUserId");
            return (Criteria) this;
        }

        public Criteria andAttBeUserIdNotEqualTo(Integer value) {
            addCriterion("att_be_user_id <>", value, "attBeUserId");
            return (Criteria) this;
        }

        public Criteria andAttBeUserIdGreaterThan(Integer value) {
            addCriterion("att_be_user_id >", value, "attBeUserId");
            return (Criteria) this;
        }

        public Criteria andAttBeUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("att_be_user_id >=", value, "attBeUserId");
            return (Criteria) this;
        }

        public Criteria andAttBeUserIdLessThan(Integer value) {
            addCriterion("att_be_user_id <", value, "attBeUserId");
            return (Criteria) this;
        }

        public Criteria andAttBeUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("att_be_user_id <=", value, "attBeUserId");
            return (Criteria) this;
        }

        public Criteria andAttBeUserIdIn(List<Integer> values) {
            addCriterion("att_be_user_id in", values, "attBeUserId");
            return (Criteria) this;
        }

        public Criteria andAttBeUserIdNotIn(List<Integer> values) {
            addCriterion("att_be_user_id not in", values, "attBeUserId");
            return (Criteria) this;
        }

        public Criteria andAttBeUserIdBetween(Integer value1, Integer value2) {
            addCriterion("att_be_user_id between", value1, value2, "attBeUserId");
            return (Criteria) this;
        }

        public Criteria andAttBeUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("att_be_user_id not between", value1, value2, "attBeUserId");
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