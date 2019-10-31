package com.aurora.arcadia.model;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionExample() {
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

        public Criteria andColIdIsNull() {
            addCriterion("col_id is null");
            return (Criteria) this;
        }

        public Criteria andColIdIsNotNull() {
            addCriterion("col_id is not null");
            return (Criteria) this;
        }

        public Criteria andColIdEqualTo(Integer value) {
            addCriterion("col_id =", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotEqualTo(Integer value) {
            addCriterion("col_id <>", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdGreaterThan(Integer value) {
            addCriterion("col_id >", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_id >=", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLessThan(Integer value) {
            addCriterion("col_id <", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLessThanOrEqualTo(Integer value) {
            addCriterion("col_id <=", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdIn(List<Integer> values) {
            addCriterion("col_id in", values, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotIn(List<Integer> values) {
            addCriterion("col_id not in", values, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdBetween(Integer value1, Integer value2) {
            addCriterion("col_id between", value1, value2, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotBetween(Integer value1, Integer value2) {
            addCriterion("col_id not between", value1, value2, "colId");
            return (Criteria) this;
        }

        public Criteria andColSignIsNull() {
            addCriterion("col_sign is null");
            return (Criteria) this;
        }

        public Criteria andColSignIsNotNull() {
            addCriterion("col_sign is not null");
            return (Criteria) this;
        }

        public Criteria andColSignEqualTo(Integer value) {
            addCriterion("col_sign =", value, "colSign");
            return (Criteria) this;
        }

        public Criteria andColSignNotEqualTo(Integer value) {
            addCriterion("col_sign <>", value, "colSign");
            return (Criteria) this;
        }

        public Criteria andColSignGreaterThan(Integer value) {
            addCriterion("col_sign >", value, "colSign");
            return (Criteria) this;
        }

        public Criteria andColSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_sign >=", value, "colSign");
            return (Criteria) this;
        }

        public Criteria andColSignLessThan(Integer value) {
            addCriterion("col_sign <", value, "colSign");
            return (Criteria) this;
        }

        public Criteria andColSignLessThanOrEqualTo(Integer value) {
            addCriterion("col_sign <=", value, "colSign");
            return (Criteria) this;
        }

        public Criteria andColSignIn(List<Integer> values) {
            addCriterion("col_sign in", values, "colSign");
            return (Criteria) this;
        }

        public Criteria andColSignNotIn(List<Integer> values) {
            addCriterion("col_sign not in", values, "colSign");
            return (Criteria) this;
        }

        public Criteria andColSignBetween(Integer value1, Integer value2) {
            addCriterion("col_sign between", value1, value2, "colSign");
            return (Criteria) this;
        }

        public Criteria andColSignNotBetween(Integer value1, Integer value2) {
            addCriterion("col_sign not between", value1, value2, "colSign");
            return (Criteria) this;
        }

        public Criteria andColUserIdIsNull() {
            addCriterion("col_user_id is null");
            return (Criteria) this;
        }

        public Criteria andColUserIdIsNotNull() {
            addCriterion("col_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andColUserIdEqualTo(Integer value) {
            addCriterion("col_user_id =", value, "colUserId");
            return (Criteria) this;
        }

        public Criteria andColUserIdNotEqualTo(Integer value) {
            addCriterion("col_user_id <>", value, "colUserId");
            return (Criteria) this;
        }

        public Criteria andColUserIdGreaterThan(Integer value) {
            addCriterion("col_user_id >", value, "colUserId");
            return (Criteria) this;
        }

        public Criteria andColUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_user_id >=", value, "colUserId");
            return (Criteria) this;
        }

        public Criteria andColUserIdLessThan(Integer value) {
            addCriterion("col_user_id <", value, "colUserId");
            return (Criteria) this;
        }

        public Criteria andColUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("col_user_id <=", value, "colUserId");
            return (Criteria) this;
        }

        public Criteria andColUserIdIn(List<Integer> values) {
            addCriterion("col_user_id in", values, "colUserId");
            return (Criteria) this;
        }

        public Criteria andColUserIdNotIn(List<Integer> values) {
            addCriterion("col_user_id not in", values, "colUserId");
            return (Criteria) this;
        }

        public Criteria andColUserIdBetween(Integer value1, Integer value2) {
            addCriterion("col_user_id between", value1, value2, "colUserId");
            return (Criteria) this;
        }

        public Criteria andColUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("col_user_id not between", value1, value2, "colUserId");
            return (Criteria) this;
        }

        public Criteria andColRecordIsNull() {
            addCriterion("col_record is null");
            return (Criteria) this;
        }

        public Criteria andColRecordIsNotNull() {
            addCriterion("col_record is not null");
            return (Criteria) this;
        }

        public Criteria andColRecordEqualTo(Integer value) {
            addCriterion("col_record =", value, "colRecord");
            return (Criteria) this;
        }

        public Criteria andColRecordNotEqualTo(Integer value) {
            addCriterion("col_record <>", value, "colRecord");
            return (Criteria) this;
        }

        public Criteria andColRecordGreaterThan(Integer value) {
            addCriterion("col_record >", value, "colRecord");
            return (Criteria) this;
        }

        public Criteria andColRecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_record >=", value, "colRecord");
            return (Criteria) this;
        }

        public Criteria andColRecordLessThan(Integer value) {
            addCriterion("col_record <", value, "colRecord");
            return (Criteria) this;
        }

        public Criteria andColRecordLessThanOrEqualTo(Integer value) {
            addCriterion("col_record <=", value, "colRecord");
            return (Criteria) this;
        }

        public Criteria andColRecordIn(List<Integer> values) {
            addCriterion("col_record in", values, "colRecord");
            return (Criteria) this;
        }

        public Criteria andColRecordNotIn(List<Integer> values) {
            addCriterion("col_record not in", values, "colRecord");
            return (Criteria) this;
        }

        public Criteria andColRecordBetween(Integer value1, Integer value2) {
            addCriterion("col_record between", value1, value2, "colRecord");
            return (Criteria) this;
        }

        public Criteria andColRecordNotBetween(Integer value1, Integer value2) {
            addCriterion("col_record not between", value1, value2, "colRecord");
            return (Criteria) this;
        }

        public Criteria andColSignIdIsNull() {
            addCriterion("col_sign_id is null");
            return (Criteria) this;
        }

        public Criteria andColSignIdIsNotNull() {
            addCriterion("col_sign_id is not null");
            return (Criteria) this;
        }

        public Criteria andColSignIdEqualTo(Integer value) {
            addCriterion("col_sign_id =", value, "colSignId");
            return (Criteria) this;
        }

        public Criteria andColSignIdNotEqualTo(Integer value) {
            addCriterion("col_sign_id <>", value, "colSignId");
            return (Criteria) this;
        }

        public Criteria andColSignIdGreaterThan(Integer value) {
            addCriterion("col_sign_id >", value, "colSignId");
            return (Criteria) this;
        }

        public Criteria andColSignIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_sign_id >=", value, "colSignId");
            return (Criteria) this;
        }

        public Criteria andColSignIdLessThan(Integer value) {
            addCriterion("col_sign_id <", value, "colSignId");
            return (Criteria) this;
        }

        public Criteria andColSignIdLessThanOrEqualTo(Integer value) {
            addCriterion("col_sign_id <=", value, "colSignId");
            return (Criteria) this;
        }

        public Criteria andColSignIdIn(List<Integer> values) {
            addCriterion("col_sign_id in", values, "colSignId");
            return (Criteria) this;
        }

        public Criteria andColSignIdNotIn(List<Integer> values) {
            addCriterion("col_sign_id not in", values, "colSignId");
            return (Criteria) this;
        }

        public Criteria andColSignIdBetween(Integer value1, Integer value2) {
            addCriterion("col_sign_id between", value1, value2, "colSignId");
            return (Criteria) this;
        }

        public Criteria andColSignIdNotBetween(Integer value1, Integer value2) {
            addCriterion("col_sign_id not between", value1, value2, "colSignId");
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