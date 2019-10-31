package com.aurora.arcadia.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Integer value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Integer value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Integer value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Integer value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Integer> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Integer> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Integer value1, Integer value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdIsNull() {
            addCriterion("reply_post_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdIsNotNull() {
            addCriterion("reply_post_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdEqualTo(Integer value) {
            addCriterion("reply_post_id =", value, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdNotEqualTo(Integer value) {
            addCriterion("reply_post_id <>", value, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdGreaterThan(Integer value) {
            addCriterion("reply_post_id >", value, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_post_id >=", value, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdLessThan(Integer value) {
            addCriterion("reply_post_id <", value, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("reply_post_id <=", value, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdIn(List<Integer> values) {
            addCriterion("reply_post_id in", values, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdNotIn(List<Integer> values) {
            addCriterion("reply_post_id not in", values, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdBetween(Integer value1, Integer value2) {
            addCriterion("reply_post_id between", value1, value2, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_post_id not between", value1, value2, "replyPostId");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Date value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Date value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Date value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Date value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Date> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Date> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Date value1, Date value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyIntroIsNull() {
            addCriterion("reply_intro is null");
            return (Criteria) this;
        }

        public Criteria andReplyIntroIsNotNull() {
            addCriterion("reply_intro is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIntroEqualTo(String value) {
            addCriterion("reply_intro =", value, "replyIntro");
            return (Criteria) this;
        }

        public Criteria andReplyIntroNotEqualTo(String value) {
            addCriterion("reply_intro <>", value, "replyIntro");
            return (Criteria) this;
        }

        public Criteria andReplyIntroGreaterThan(String value) {
            addCriterion("reply_intro >", value, "replyIntro");
            return (Criteria) this;
        }

        public Criteria andReplyIntroGreaterThanOrEqualTo(String value) {
            addCriterion("reply_intro >=", value, "replyIntro");
            return (Criteria) this;
        }

        public Criteria andReplyIntroLessThan(String value) {
            addCriterion("reply_intro <", value, "replyIntro");
            return (Criteria) this;
        }

        public Criteria andReplyIntroLessThanOrEqualTo(String value) {
            addCriterion("reply_intro <=", value, "replyIntro");
            return (Criteria) this;
        }

        public Criteria andReplyIntroLike(String value) {
            addCriterion("reply_intro like", value, "replyIntro");
            return (Criteria) this;
        }

        public Criteria andReplyIntroNotLike(String value) {
            addCriterion("reply_intro not like", value, "replyIntro");
            return (Criteria) this;
        }

        public Criteria andReplyIntroIn(List<String> values) {
            addCriterion("reply_intro in", values, "replyIntro");
            return (Criteria) this;
        }

        public Criteria andReplyIntroNotIn(List<String> values) {
            addCriterion("reply_intro not in", values, "replyIntro");
            return (Criteria) this;
        }

        public Criteria andReplyIntroBetween(String value1, String value2) {
            addCriterion("reply_intro between", value1, value2, "replyIntro");
            return (Criteria) this;
        }

        public Criteria andReplyIntroNotBetween(String value1, String value2) {
            addCriterion("reply_intro not between", value1, value2, "replyIntro");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdIsNull() {
            addCriterion("reply_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdIsNotNull() {
            addCriterion("reply_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdEqualTo(Integer value) {
            addCriterion("reply_user_id =", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdNotEqualTo(Integer value) {
            addCriterion("reply_user_id <>", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdGreaterThan(Integer value) {
            addCriterion("reply_user_id >", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_user_id >=", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdLessThan(Integer value) {
            addCriterion("reply_user_id <", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("reply_user_id <=", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdIn(List<Integer> values) {
            addCriterion("reply_user_id in", values, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdNotIn(List<Integer> values) {
            addCriterion("reply_user_id not in", values, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdBetween(Integer value1, Integer value2) {
            addCriterion("reply_user_id between", value1, value2, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_user_id not between", value1, value2, "replyUserId");
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