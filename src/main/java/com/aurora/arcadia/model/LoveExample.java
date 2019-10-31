package com.aurora.arcadia.model;

import java.util.ArrayList;
import java.util.List;

public class LoveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoveExample() {
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

        public Criteria andLoveIdIsNull() {
            addCriterion("love_id is null");
            return (Criteria) this;
        }

        public Criteria andLoveIdIsNotNull() {
            addCriterion("love_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoveIdEqualTo(Integer value) {
            addCriterion("love_id =", value, "loveId");
            return (Criteria) this;
        }

        public Criteria andLoveIdNotEqualTo(Integer value) {
            addCriterion("love_id <>", value, "loveId");
            return (Criteria) this;
        }

        public Criteria andLoveIdGreaterThan(Integer value) {
            addCriterion("love_id >", value, "loveId");
            return (Criteria) this;
        }

        public Criteria andLoveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("love_id >=", value, "loveId");
            return (Criteria) this;
        }

        public Criteria andLoveIdLessThan(Integer value) {
            addCriterion("love_id <", value, "loveId");
            return (Criteria) this;
        }

        public Criteria andLoveIdLessThanOrEqualTo(Integer value) {
            addCriterion("love_id <=", value, "loveId");
            return (Criteria) this;
        }

        public Criteria andLoveIdIn(List<Integer> values) {
            addCriterion("love_id in", values, "loveId");
            return (Criteria) this;
        }

        public Criteria andLoveIdNotIn(List<Integer> values) {
            addCriterion("love_id not in", values, "loveId");
            return (Criteria) this;
        }

        public Criteria andLoveIdBetween(Integer value1, Integer value2) {
            addCriterion("love_id between", value1, value2, "loveId");
            return (Criteria) this;
        }

        public Criteria andLoveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("love_id not between", value1, value2, "loveId");
            return (Criteria) this;
        }

        public Criteria andLoveUserIdIsNull() {
            addCriterion("love_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLoveUserIdIsNotNull() {
            addCriterion("love_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoveUserIdEqualTo(Integer value) {
            addCriterion("love_user_id =", value, "loveUserId");
            return (Criteria) this;
        }

        public Criteria andLoveUserIdNotEqualTo(Integer value) {
            addCriterion("love_user_id <>", value, "loveUserId");
            return (Criteria) this;
        }

        public Criteria andLoveUserIdGreaterThan(Integer value) {
            addCriterion("love_user_id >", value, "loveUserId");
            return (Criteria) this;
        }

        public Criteria andLoveUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("love_user_id >=", value, "loveUserId");
            return (Criteria) this;
        }

        public Criteria andLoveUserIdLessThan(Integer value) {
            addCriterion("love_user_id <", value, "loveUserId");
            return (Criteria) this;
        }

        public Criteria andLoveUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("love_user_id <=", value, "loveUserId");
            return (Criteria) this;
        }

        public Criteria andLoveUserIdIn(List<Integer> values) {
            addCriterion("love_user_id in", values, "loveUserId");
            return (Criteria) this;
        }

        public Criteria andLoveUserIdNotIn(List<Integer> values) {
            addCriterion("love_user_id not in", values, "loveUserId");
            return (Criteria) this;
        }

        public Criteria andLoveUserIdBetween(Integer value1, Integer value2) {
            addCriterion("love_user_id between", value1, value2, "loveUserId");
            return (Criteria) this;
        }

        public Criteria andLoveUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("love_user_id not between", value1, value2, "loveUserId");
            return (Criteria) this;
        }

        public Criteria andLoveIntroIsNull() {
            addCriterion("love_intro is null");
            return (Criteria) this;
        }

        public Criteria andLoveIntroIsNotNull() {
            addCriterion("love_intro is not null");
            return (Criteria) this;
        }

        public Criteria andLoveIntroEqualTo(String value) {
            addCriterion("love_intro =", value, "loveIntro");
            return (Criteria) this;
        }

        public Criteria andLoveIntroNotEqualTo(String value) {
            addCriterion("love_intro <>", value, "loveIntro");
            return (Criteria) this;
        }

        public Criteria andLoveIntroGreaterThan(String value) {
            addCriterion("love_intro >", value, "loveIntro");
            return (Criteria) this;
        }

        public Criteria andLoveIntroGreaterThanOrEqualTo(String value) {
            addCriterion("love_intro >=", value, "loveIntro");
            return (Criteria) this;
        }

        public Criteria andLoveIntroLessThan(String value) {
            addCriterion("love_intro <", value, "loveIntro");
            return (Criteria) this;
        }

        public Criteria andLoveIntroLessThanOrEqualTo(String value) {
            addCriterion("love_intro <=", value, "loveIntro");
            return (Criteria) this;
        }

        public Criteria andLoveIntroLike(String value) {
            addCriterion("love_intro like", value, "loveIntro");
            return (Criteria) this;
        }

        public Criteria andLoveIntroNotLike(String value) {
            addCriterion("love_intro not like", value, "loveIntro");
            return (Criteria) this;
        }

        public Criteria andLoveIntroIn(List<String> values) {
            addCriterion("love_intro in", values, "loveIntro");
            return (Criteria) this;
        }

        public Criteria andLoveIntroNotIn(List<String> values) {
            addCriterion("love_intro not in", values, "loveIntro");
            return (Criteria) this;
        }

        public Criteria andLoveIntroBetween(String value1, String value2) {
            addCriterion("love_intro between", value1, value2, "loveIntro");
            return (Criteria) this;
        }

        public Criteria andLoveIntroNotBetween(String value1, String value2) {
            addCriterion("love_intro not between", value1, value2, "loveIntro");
            return (Criteria) this;
        }

        public Criteria andLoveSignIsNull() {
            addCriterion("love_sign is null");
            return (Criteria) this;
        }

        public Criteria andLoveSignIsNotNull() {
            addCriterion("love_sign is not null");
            return (Criteria) this;
        }

        public Criteria andLoveSignEqualTo(Integer value) {
            addCriterion("love_sign =", value, "loveSign");
            return (Criteria) this;
        }

        public Criteria andLoveSignNotEqualTo(Integer value) {
            addCriterion("love_sign <>", value, "loveSign");
            return (Criteria) this;
        }

        public Criteria andLoveSignGreaterThan(Integer value) {
            addCriterion("love_sign >", value, "loveSign");
            return (Criteria) this;
        }

        public Criteria andLoveSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("love_sign >=", value, "loveSign");
            return (Criteria) this;
        }

        public Criteria andLoveSignLessThan(Integer value) {
            addCriterion("love_sign <", value, "loveSign");
            return (Criteria) this;
        }

        public Criteria andLoveSignLessThanOrEqualTo(Integer value) {
            addCriterion("love_sign <=", value, "loveSign");
            return (Criteria) this;
        }

        public Criteria andLoveSignIn(List<Integer> values) {
            addCriterion("love_sign in", values, "loveSign");
            return (Criteria) this;
        }

        public Criteria andLoveSignNotIn(List<Integer> values) {
            addCriterion("love_sign not in", values, "loveSign");
            return (Criteria) this;
        }

        public Criteria andLoveSignBetween(Integer value1, Integer value2) {
            addCriterion("love_sign between", value1, value2, "loveSign");
            return (Criteria) this;
        }

        public Criteria andLoveSignNotBetween(Integer value1, Integer value2) {
            addCriterion("love_sign not between", value1, value2, "loveSign");
            return (Criteria) this;
        }

        public Criteria andLoveUserStatusIsNull() {
            addCriterion("love_user_status is null");
            return (Criteria) this;
        }

        public Criteria andLoveUserStatusIsNotNull() {
            addCriterion("love_user_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoveUserStatusEqualTo(Boolean value) {
            addCriterion("love_user_status =", value, "loveUserStatus");
            return (Criteria) this;
        }

        public Criteria andLoveUserStatusNotEqualTo(Boolean value) {
            addCriterion("love_user_status <>", value, "loveUserStatus");
            return (Criteria) this;
        }

        public Criteria andLoveUserStatusGreaterThan(Boolean value) {
            addCriterion("love_user_status >", value, "loveUserStatus");
            return (Criteria) this;
        }

        public Criteria andLoveUserStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("love_user_status >=", value, "loveUserStatus");
            return (Criteria) this;
        }

        public Criteria andLoveUserStatusLessThan(Boolean value) {
            addCriterion("love_user_status <", value, "loveUserStatus");
            return (Criteria) this;
        }

        public Criteria andLoveUserStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("love_user_status <=", value, "loveUserStatus");
            return (Criteria) this;
        }

        public Criteria andLoveUserStatusIn(List<Boolean> values) {
            addCriterion("love_user_status in", values, "loveUserStatus");
            return (Criteria) this;
        }

        public Criteria andLoveUserStatusNotIn(List<Boolean> values) {
            addCriterion("love_user_status not in", values, "loveUserStatus");
            return (Criteria) this;
        }

        public Criteria andLoveUserStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("love_user_status between", value1, value2, "loveUserStatus");
            return (Criteria) this;
        }

        public Criteria andLoveUserStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("love_user_status not between", value1, value2, "loveUserStatus");
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