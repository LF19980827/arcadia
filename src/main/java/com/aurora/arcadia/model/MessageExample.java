package com.aurora.arcadia.model;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMsgIdIsNull() {
            addCriterion("msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(Integer value) {
            addCriterion("msg_id =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(Integer value) {
            addCriterion("msg_id <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(Integer value) {
            addCriterion("msg_id >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_id >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(Integer value) {
            addCriterion("msg_id <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(Integer value) {
            addCriterion("msg_id <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<Integer> values) {
            addCriterion("msg_id in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<Integer> values) {
            addCriterion("msg_id not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(Integer value1, Integer value2) {
            addCriterion("msg_id between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_id not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgUserIsNull() {
            addCriterion("msg_user is null");
            return (Criteria) this;
        }

        public Criteria andMsgUserIsNotNull() {
            addCriterion("msg_user is not null");
            return (Criteria) this;
        }

        public Criteria andMsgUserEqualTo(Integer value) {
            addCriterion("msg_user =", value, "msgUser");
            return (Criteria) this;
        }

        public Criteria andMsgUserNotEqualTo(Integer value) {
            addCriterion("msg_user <>", value, "msgUser");
            return (Criteria) this;
        }

        public Criteria andMsgUserGreaterThan(Integer value) {
            addCriterion("msg_user >", value, "msgUser");
            return (Criteria) this;
        }

        public Criteria andMsgUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_user >=", value, "msgUser");
            return (Criteria) this;
        }

        public Criteria andMsgUserLessThan(Integer value) {
            addCriterion("msg_user <", value, "msgUser");
            return (Criteria) this;
        }

        public Criteria andMsgUserLessThanOrEqualTo(Integer value) {
            addCriterion("msg_user <=", value, "msgUser");
            return (Criteria) this;
        }

        public Criteria andMsgUserIn(List<Integer> values) {
            addCriterion("msg_user in", values, "msgUser");
            return (Criteria) this;
        }

        public Criteria andMsgUserNotIn(List<Integer> values) {
            addCriterion("msg_user not in", values, "msgUser");
            return (Criteria) this;
        }

        public Criteria andMsgUserBetween(Integer value1, Integer value2) {
            addCriterion("msg_user between", value1, value2, "msgUser");
            return (Criteria) this;
        }

        public Criteria andMsgUserNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_user not between", value1, value2, "msgUser");
            return (Criteria) this;
        }

        public Criteria andMsgBodyIsNull() {
            addCriterion("msg_body is null");
            return (Criteria) this;
        }

        public Criteria andMsgBodyIsNotNull() {
            addCriterion("msg_body is not null");
            return (Criteria) this;
        }

        public Criteria andMsgBodyEqualTo(String value) {
            addCriterion("msg_body =", value, "msgBody");
            return (Criteria) this;
        }

        public Criteria andMsgBodyNotEqualTo(String value) {
            addCriterion("msg_body <>", value, "msgBody");
            return (Criteria) this;
        }

        public Criteria andMsgBodyGreaterThan(String value) {
            addCriterion("msg_body >", value, "msgBody");
            return (Criteria) this;
        }

        public Criteria andMsgBodyGreaterThanOrEqualTo(String value) {
            addCriterion("msg_body >=", value, "msgBody");
            return (Criteria) this;
        }

        public Criteria andMsgBodyLessThan(String value) {
            addCriterion("msg_body <", value, "msgBody");
            return (Criteria) this;
        }

        public Criteria andMsgBodyLessThanOrEqualTo(String value) {
            addCriterion("msg_body <=", value, "msgBody");
            return (Criteria) this;
        }

        public Criteria andMsgBodyLike(String value) {
            addCriterion("msg_body like", value, "msgBody");
            return (Criteria) this;
        }

        public Criteria andMsgBodyNotLike(String value) {
            addCriterion("msg_body not like", value, "msgBody");
            return (Criteria) this;
        }

        public Criteria andMsgBodyIn(List<String> values) {
            addCriterion("msg_body in", values, "msgBody");
            return (Criteria) this;
        }

        public Criteria andMsgBodyNotIn(List<String> values) {
            addCriterion("msg_body not in", values, "msgBody");
            return (Criteria) this;
        }

        public Criteria andMsgBodyBetween(String value1, String value2) {
            addCriterion("msg_body between", value1, value2, "msgBody");
            return (Criteria) this;
        }

        public Criteria andMsgBodyNotBetween(String value1, String value2) {
            addCriterion("msg_body not between", value1, value2, "msgBody");
            return (Criteria) this;
        }

        public Criteria andMsgSignIsNull() {
            addCriterion("msg_sign is null");
            return (Criteria) this;
        }

        public Criteria andMsgSignIsNotNull() {
            addCriterion("msg_sign is not null");
            return (Criteria) this;
        }

        public Criteria andMsgSignEqualTo(Integer value) {
            addCriterion("msg_sign =", value, "msgSign");
            return (Criteria) this;
        }

        public Criteria andMsgSignNotEqualTo(Integer value) {
            addCriterion("msg_sign <>", value, "msgSign");
            return (Criteria) this;
        }

        public Criteria andMsgSignGreaterThan(Integer value) {
            addCriterion("msg_sign >", value, "msgSign");
            return (Criteria) this;
        }

        public Criteria andMsgSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_sign >=", value, "msgSign");
            return (Criteria) this;
        }

        public Criteria andMsgSignLessThan(Integer value) {
            addCriterion("msg_sign <", value, "msgSign");
            return (Criteria) this;
        }

        public Criteria andMsgSignLessThanOrEqualTo(Integer value) {
            addCriterion("msg_sign <=", value, "msgSign");
            return (Criteria) this;
        }

        public Criteria andMsgSignIn(List<Integer> values) {
            addCriterion("msg_sign in", values, "msgSign");
            return (Criteria) this;
        }

        public Criteria andMsgSignNotIn(List<Integer> values) {
            addCriterion("msg_sign not in", values, "msgSign");
            return (Criteria) this;
        }

        public Criteria andMsgSignBetween(Integer value1, Integer value2) {
            addCriterion("msg_sign between", value1, value2, "msgSign");
            return (Criteria) this;
        }

        public Criteria andMsgSignNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_sign not between", value1, value2, "msgSign");
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