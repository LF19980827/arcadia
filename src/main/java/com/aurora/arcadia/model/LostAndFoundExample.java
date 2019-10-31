package com.aurora.arcadia.model;

import java.util.ArrayList;
import java.util.List;

public class LostAndFoundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LostAndFoundExample() {
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

        public Criteria andLostIdIsNull() {
            addCriterion("lost_id is null");
            return (Criteria) this;
        }

        public Criteria andLostIdIsNotNull() {
            addCriterion("lost_id is not null");
            return (Criteria) this;
        }

        public Criteria andLostIdEqualTo(Integer value) {
            addCriterion("lost_id =", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdNotEqualTo(Integer value) {
            addCriterion("lost_id <>", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdGreaterThan(Integer value) {
            addCriterion("lost_id >", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lost_id >=", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdLessThan(Integer value) {
            addCriterion("lost_id <", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdLessThanOrEqualTo(Integer value) {
            addCriterion("lost_id <=", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdIn(List<Integer> values) {
            addCriterion("lost_id in", values, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdNotIn(List<Integer> values) {
            addCriterion("lost_id not in", values, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdBetween(Integer value1, Integer value2) {
            addCriterion("lost_id between", value1, value2, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lost_id not between", value1, value2, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostTitleIsNull() {
            addCriterion("lost_title is null");
            return (Criteria) this;
        }

        public Criteria andLostTitleIsNotNull() {
            addCriterion("lost_title is not null");
            return (Criteria) this;
        }

        public Criteria andLostTitleEqualTo(String value) {
            addCriterion("lost_title =", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleNotEqualTo(String value) {
            addCriterion("lost_title <>", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleGreaterThan(String value) {
            addCriterion("lost_title >", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleGreaterThanOrEqualTo(String value) {
            addCriterion("lost_title >=", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleLessThan(String value) {
            addCriterion("lost_title <", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleLessThanOrEqualTo(String value) {
            addCriterion("lost_title <=", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleLike(String value) {
            addCriterion("lost_title like", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleNotLike(String value) {
            addCriterion("lost_title not like", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleIn(List<String> values) {
            addCriterion("lost_title in", values, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleNotIn(List<String> values) {
            addCriterion("lost_title not in", values, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleBetween(String value1, String value2) {
            addCriterion("lost_title between", value1, value2, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleNotBetween(String value1, String value2) {
            addCriterion("lost_title not between", value1, value2, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostIntroIsNull() {
            addCriterion("lost_intro is null");
            return (Criteria) this;
        }

        public Criteria andLostIntroIsNotNull() {
            addCriterion("lost_intro is not null");
            return (Criteria) this;
        }

        public Criteria andLostIntroEqualTo(String value) {
            addCriterion("lost_intro =", value, "lostIntro");
            return (Criteria) this;
        }

        public Criteria andLostIntroNotEqualTo(String value) {
            addCriterion("lost_intro <>", value, "lostIntro");
            return (Criteria) this;
        }

        public Criteria andLostIntroGreaterThan(String value) {
            addCriterion("lost_intro >", value, "lostIntro");
            return (Criteria) this;
        }

        public Criteria andLostIntroGreaterThanOrEqualTo(String value) {
            addCriterion("lost_intro >=", value, "lostIntro");
            return (Criteria) this;
        }

        public Criteria andLostIntroLessThan(String value) {
            addCriterion("lost_intro <", value, "lostIntro");
            return (Criteria) this;
        }

        public Criteria andLostIntroLessThanOrEqualTo(String value) {
            addCriterion("lost_intro <=", value, "lostIntro");
            return (Criteria) this;
        }

        public Criteria andLostIntroLike(String value) {
            addCriterion("lost_intro like", value, "lostIntro");
            return (Criteria) this;
        }

        public Criteria andLostIntroNotLike(String value) {
            addCriterion("lost_intro not like", value, "lostIntro");
            return (Criteria) this;
        }

        public Criteria andLostIntroIn(List<String> values) {
            addCriterion("lost_intro in", values, "lostIntro");
            return (Criteria) this;
        }

        public Criteria andLostIntroNotIn(List<String> values) {
            addCriterion("lost_intro not in", values, "lostIntro");
            return (Criteria) this;
        }

        public Criteria andLostIntroBetween(String value1, String value2) {
            addCriterion("lost_intro between", value1, value2, "lostIntro");
            return (Criteria) this;
        }

        public Criteria andLostIntroNotBetween(String value1, String value2) {
            addCriterion("lost_intro not between", value1, value2, "lostIntro");
            return (Criteria) this;
        }

        public Criteria andLostSignIsNull() {
            addCriterion("lost_sign is null");
            return (Criteria) this;
        }

        public Criteria andLostSignIsNotNull() {
            addCriterion("lost_sign is not null");
            return (Criteria) this;
        }

        public Criteria andLostSignEqualTo(Integer value) {
            addCriterion("lost_sign =", value, "lostSign");
            return (Criteria) this;
        }

        public Criteria andLostSignNotEqualTo(Integer value) {
            addCriterion("lost_sign <>", value, "lostSign");
            return (Criteria) this;
        }

        public Criteria andLostSignGreaterThan(Integer value) {
            addCriterion("lost_sign >", value, "lostSign");
            return (Criteria) this;
        }

        public Criteria andLostSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("lost_sign >=", value, "lostSign");
            return (Criteria) this;
        }

        public Criteria andLostSignLessThan(Integer value) {
            addCriterion("lost_sign <", value, "lostSign");
            return (Criteria) this;
        }

        public Criteria andLostSignLessThanOrEqualTo(Integer value) {
            addCriterion("lost_sign <=", value, "lostSign");
            return (Criteria) this;
        }

        public Criteria andLostSignIn(List<Integer> values) {
            addCriterion("lost_sign in", values, "lostSign");
            return (Criteria) this;
        }

        public Criteria andLostSignNotIn(List<Integer> values) {
            addCriterion("lost_sign not in", values, "lostSign");
            return (Criteria) this;
        }

        public Criteria andLostSignBetween(Integer value1, Integer value2) {
            addCriterion("lost_sign between", value1, value2, "lostSign");
            return (Criteria) this;
        }

        public Criteria andLostSignNotBetween(Integer value1, Integer value2) {
            addCriterion("lost_sign not between", value1, value2, "lostSign");
            return (Criteria) this;
        }

        public Criteria andLostUserIdIsNull() {
            addCriterion("lost_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLostUserIdIsNotNull() {
            addCriterion("lost_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLostUserIdEqualTo(Integer value) {
            addCriterion("lost_user_id =", value, "lostUserId");
            return (Criteria) this;
        }

        public Criteria andLostUserIdNotEqualTo(Integer value) {
            addCriterion("lost_user_id <>", value, "lostUserId");
            return (Criteria) this;
        }

        public Criteria andLostUserIdGreaterThan(Integer value) {
            addCriterion("lost_user_id >", value, "lostUserId");
            return (Criteria) this;
        }

        public Criteria andLostUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lost_user_id >=", value, "lostUserId");
            return (Criteria) this;
        }

        public Criteria andLostUserIdLessThan(Integer value) {
            addCriterion("lost_user_id <", value, "lostUserId");
            return (Criteria) this;
        }

        public Criteria andLostUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("lost_user_id <=", value, "lostUserId");
            return (Criteria) this;
        }

        public Criteria andLostUserIdIn(List<Integer> values) {
            addCriterion("lost_user_id in", values, "lostUserId");
            return (Criteria) this;
        }

        public Criteria andLostUserIdNotIn(List<Integer> values) {
            addCriterion("lost_user_id not in", values, "lostUserId");
            return (Criteria) this;
        }

        public Criteria andLostUserIdBetween(Integer value1, Integer value2) {
            addCriterion("lost_user_id between", value1, value2, "lostUserId");
            return (Criteria) this;
        }

        public Criteria andLostUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lost_user_id not between", value1, value2, "lostUserId");
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