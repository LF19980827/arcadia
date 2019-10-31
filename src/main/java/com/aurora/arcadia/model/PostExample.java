package com.aurora.arcadia.model;

import java.util.ArrayList;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andPostKindIsNull() {
            addCriterion("post_kind is null");
            return (Criteria) this;
        }

        public Criteria andPostKindIsNotNull() {
            addCriterion("post_kind is not null");
            return (Criteria) this;
        }

        public Criteria andPostKindEqualTo(Integer value) {
            addCriterion("post_kind =", value, "postKind");
            return (Criteria) this;
        }

        public Criteria andPostKindNotEqualTo(Integer value) {
            addCriterion("post_kind <>", value, "postKind");
            return (Criteria) this;
        }

        public Criteria andPostKindGreaterThan(Integer value) {
            addCriterion("post_kind >", value, "postKind");
            return (Criteria) this;
        }

        public Criteria andPostKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_kind >=", value, "postKind");
            return (Criteria) this;
        }

        public Criteria andPostKindLessThan(Integer value) {
            addCriterion("post_kind <", value, "postKind");
            return (Criteria) this;
        }

        public Criteria andPostKindLessThanOrEqualTo(Integer value) {
            addCriterion("post_kind <=", value, "postKind");
            return (Criteria) this;
        }

        public Criteria andPostKindIn(List<Integer> values) {
            addCriterion("post_kind in", values, "postKind");
            return (Criteria) this;
        }

        public Criteria andPostKindNotIn(List<Integer> values) {
            addCriterion("post_kind not in", values, "postKind");
            return (Criteria) this;
        }

        public Criteria andPostKindBetween(Integer value1, Integer value2) {
            addCriterion("post_kind between", value1, value2, "postKind");
            return (Criteria) this;
        }

        public Criteria andPostKindNotBetween(Integer value1, Integer value2) {
            addCriterion("post_kind not between", value1, value2, "postKind");
            return (Criteria) this;
        }

        public Criteria andPostUserIdIsNull() {
            addCriterion("post_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPostUserIdIsNotNull() {
            addCriterion("post_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostUserIdEqualTo(Integer value) {
            addCriterion("post_user_id =", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdNotEqualTo(Integer value) {
            addCriterion("post_user_id <>", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdGreaterThan(Integer value) {
            addCriterion("post_user_id >", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_user_id >=", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdLessThan(Integer value) {
            addCriterion("post_user_id <", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_user_id <=", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdIn(List<Integer> values) {
            addCriterion("post_user_id in", values, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdNotIn(List<Integer> values) {
            addCriterion("post_user_id not in", values, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdBetween(Integer value1, Integer value2) {
            addCriterion("post_user_id between", value1, value2, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_user_id not between", value1, value2, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNull() {
            addCriterion("post_title is null");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNotNull() {
            addCriterion("post_title is not null");
            return (Criteria) this;
        }

        public Criteria andPostTitleEqualTo(String value) {
            addCriterion("post_title =", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotEqualTo(String value) {
            addCriterion("post_title <>", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThan(String value) {
            addCriterion("post_title >", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThanOrEqualTo(String value) {
            addCriterion("post_title >=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThan(String value) {
            addCriterion("post_title <", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThanOrEqualTo(String value) {
            addCriterion("post_title <=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLike(String value) {
            addCriterion("post_title like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotLike(String value) {
            addCriterion("post_title not like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleIn(List<String> values) {
            addCriterion("post_title in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotIn(List<String> values) {
            addCriterion("post_title not in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleBetween(String value1, String value2) {
            addCriterion("post_title between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotBetween(String value1, String value2) {
            addCriterion("post_title not between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostIntroIsNull() {
            addCriterion("post_intro is null");
            return (Criteria) this;
        }

        public Criteria andPostIntroIsNotNull() {
            addCriterion("post_intro is not null");
            return (Criteria) this;
        }

        public Criteria andPostIntroEqualTo(String value) {
            addCriterion("post_intro =", value, "postIntro");
            return (Criteria) this;
        }

        public Criteria andPostIntroNotEqualTo(String value) {
            addCriterion("post_intro <>", value, "postIntro");
            return (Criteria) this;
        }

        public Criteria andPostIntroGreaterThan(String value) {
            addCriterion("post_intro >", value, "postIntro");
            return (Criteria) this;
        }

        public Criteria andPostIntroGreaterThanOrEqualTo(String value) {
            addCriterion("post_intro >=", value, "postIntro");
            return (Criteria) this;
        }

        public Criteria andPostIntroLessThan(String value) {
            addCriterion("post_intro <", value, "postIntro");
            return (Criteria) this;
        }

        public Criteria andPostIntroLessThanOrEqualTo(String value) {
            addCriterion("post_intro <=", value, "postIntro");
            return (Criteria) this;
        }

        public Criteria andPostIntroLike(String value) {
            addCriterion("post_intro like", value, "postIntro");
            return (Criteria) this;
        }

        public Criteria andPostIntroNotLike(String value) {
            addCriterion("post_intro not like", value, "postIntro");
            return (Criteria) this;
        }

        public Criteria andPostIntroIn(List<String> values) {
            addCriterion("post_intro in", values, "postIntro");
            return (Criteria) this;
        }

        public Criteria andPostIntroNotIn(List<String> values) {
            addCriterion("post_intro not in", values, "postIntro");
            return (Criteria) this;
        }

        public Criteria andPostIntroBetween(String value1, String value2) {
            addCriterion("post_intro between", value1, value2, "postIntro");
            return (Criteria) this;
        }

        public Criteria andPostIntroNotBetween(String value1, String value2) {
            addCriterion("post_intro not between", value1, value2, "postIntro");
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