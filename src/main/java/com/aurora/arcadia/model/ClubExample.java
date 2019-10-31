package com.aurora.arcadia.model;

import java.util.ArrayList;
import java.util.List;

public class ClubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClubExample() {
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

        public Criteria andClubIdIsNull() {
            addCriterion("club_id is null");
            return (Criteria) this;
        }

        public Criteria andClubIdIsNotNull() {
            addCriterion("club_id is not null");
            return (Criteria) this;
        }

        public Criteria andClubIdEqualTo(Integer value) {
            addCriterion("club_id =", value, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdNotEqualTo(Integer value) {
            addCriterion("club_id <>", value, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdGreaterThan(Integer value) {
            addCriterion("club_id >", value, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("club_id >=", value, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdLessThan(Integer value) {
            addCriterion("club_id <", value, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdLessThanOrEqualTo(Integer value) {
            addCriterion("club_id <=", value, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdIn(List<Integer> values) {
            addCriterion("club_id in", values, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdNotIn(List<Integer> values) {
            addCriterion("club_id not in", values, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdBetween(Integer value1, Integer value2) {
            addCriterion("club_id between", value1, value2, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdNotBetween(Integer value1, Integer value2) {
            addCriterion("club_id not between", value1, value2, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubNameIsNull() {
            addCriterion("club_name is null");
            return (Criteria) this;
        }

        public Criteria andClubNameIsNotNull() {
            addCriterion("club_name is not null");
            return (Criteria) this;
        }

        public Criteria andClubNameEqualTo(String value) {
            addCriterion("club_name =", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameNotEqualTo(String value) {
            addCriterion("club_name <>", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameGreaterThan(String value) {
            addCriterion("club_name >", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameGreaterThanOrEqualTo(String value) {
            addCriterion("club_name >=", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameLessThan(String value) {
            addCriterion("club_name <", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameLessThanOrEqualTo(String value) {
            addCriterion("club_name <=", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameLike(String value) {
            addCriterion("club_name like", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameNotLike(String value) {
            addCriterion("club_name not like", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameIn(List<String> values) {
            addCriterion("club_name in", values, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameNotIn(List<String> values) {
            addCriterion("club_name not in", values, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameBetween(String value1, String value2) {
            addCriterion("club_name between", value1, value2, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameNotBetween(String value1, String value2) {
            addCriterion("club_name not between", value1, value2, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubKindIsNull() {
            addCriterion("club_kind is null");
            return (Criteria) this;
        }

        public Criteria andClubKindIsNotNull() {
            addCriterion("club_kind is not null");
            return (Criteria) this;
        }

        public Criteria andClubKindEqualTo(String value) {
            addCriterion("club_kind =", value, "clubKind");
            return (Criteria) this;
        }

        public Criteria andClubKindNotEqualTo(String value) {
            addCriterion("club_kind <>", value, "clubKind");
            return (Criteria) this;
        }

        public Criteria andClubKindGreaterThan(String value) {
            addCriterion("club_kind >", value, "clubKind");
            return (Criteria) this;
        }

        public Criteria andClubKindGreaterThanOrEqualTo(String value) {
            addCriterion("club_kind >=", value, "clubKind");
            return (Criteria) this;
        }

        public Criteria andClubKindLessThan(String value) {
            addCriterion("club_kind <", value, "clubKind");
            return (Criteria) this;
        }

        public Criteria andClubKindLessThanOrEqualTo(String value) {
            addCriterion("club_kind <=", value, "clubKind");
            return (Criteria) this;
        }

        public Criteria andClubKindLike(String value) {
            addCriterion("club_kind like", value, "clubKind");
            return (Criteria) this;
        }

        public Criteria andClubKindNotLike(String value) {
            addCriterion("club_kind not like", value, "clubKind");
            return (Criteria) this;
        }

        public Criteria andClubKindIn(List<String> values) {
            addCriterion("club_kind in", values, "clubKind");
            return (Criteria) this;
        }

        public Criteria andClubKindNotIn(List<String> values) {
            addCriterion("club_kind not in", values, "clubKind");
            return (Criteria) this;
        }

        public Criteria andClubKindBetween(String value1, String value2) {
            addCriterion("club_kind between", value1, value2, "clubKind");
            return (Criteria) this;
        }

        public Criteria andClubKindNotBetween(String value1, String value2) {
            addCriterion("club_kind not between", value1, value2, "clubKind");
            return (Criteria) this;
        }

        public Criteria andClubIntroIsNull() {
            addCriterion("club_intro is null");
            return (Criteria) this;
        }

        public Criteria andClubIntroIsNotNull() {
            addCriterion("club_intro is not null");
            return (Criteria) this;
        }

        public Criteria andClubIntroEqualTo(String value) {
            addCriterion("club_intro =", value, "clubIntro");
            return (Criteria) this;
        }

        public Criteria andClubIntroNotEqualTo(String value) {
            addCriterion("club_intro <>", value, "clubIntro");
            return (Criteria) this;
        }

        public Criteria andClubIntroGreaterThan(String value) {
            addCriterion("club_intro >", value, "clubIntro");
            return (Criteria) this;
        }

        public Criteria andClubIntroGreaterThanOrEqualTo(String value) {
            addCriterion("club_intro >=", value, "clubIntro");
            return (Criteria) this;
        }

        public Criteria andClubIntroLessThan(String value) {
            addCriterion("club_intro <", value, "clubIntro");
            return (Criteria) this;
        }

        public Criteria andClubIntroLessThanOrEqualTo(String value) {
            addCriterion("club_intro <=", value, "clubIntro");
            return (Criteria) this;
        }

        public Criteria andClubIntroLike(String value) {
            addCriterion("club_intro like", value, "clubIntro");
            return (Criteria) this;
        }

        public Criteria andClubIntroNotLike(String value) {
            addCriterion("club_intro not like", value, "clubIntro");
            return (Criteria) this;
        }

        public Criteria andClubIntroIn(List<String> values) {
            addCriterion("club_intro in", values, "clubIntro");
            return (Criteria) this;
        }

        public Criteria andClubIntroNotIn(List<String> values) {
            addCriterion("club_intro not in", values, "clubIntro");
            return (Criteria) this;
        }

        public Criteria andClubIntroBetween(String value1, String value2) {
            addCriterion("club_intro between", value1, value2, "clubIntro");
            return (Criteria) this;
        }

        public Criteria andClubIntroNotBetween(String value1, String value2) {
            addCriterion("club_intro not between", value1, value2, "clubIntro");
            return (Criteria) this;
        }

        public Criteria andClubManagerIsNull() {
            addCriterion("club_manager is null");
            return (Criteria) this;
        }

        public Criteria andClubManagerIsNotNull() {
            addCriterion("club_manager is not null");
            return (Criteria) this;
        }

        public Criteria andClubManagerEqualTo(Integer value) {
            addCriterion("club_manager =", value, "clubManager");
            return (Criteria) this;
        }

        public Criteria andClubManagerNotEqualTo(Integer value) {
            addCriterion("club_manager <>", value, "clubManager");
            return (Criteria) this;
        }

        public Criteria andClubManagerGreaterThan(Integer value) {
            addCriterion("club_manager >", value, "clubManager");
            return (Criteria) this;
        }

        public Criteria andClubManagerGreaterThanOrEqualTo(Integer value) {
            addCriterion("club_manager >=", value, "clubManager");
            return (Criteria) this;
        }

        public Criteria andClubManagerLessThan(Integer value) {
            addCriterion("club_manager <", value, "clubManager");
            return (Criteria) this;
        }

        public Criteria andClubManagerLessThanOrEqualTo(Integer value) {
            addCriterion("club_manager <=", value, "clubManager");
            return (Criteria) this;
        }

        public Criteria andClubManagerIn(List<Integer> values) {
            addCriterion("club_manager in", values, "clubManager");
            return (Criteria) this;
        }

        public Criteria andClubManagerNotIn(List<Integer> values) {
            addCriterion("club_manager not in", values, "clubManager");
            return (Criteria) this;
        }

        public Criteria andClubManagerBetween(Integer value1, Integer value2) {
            addCriterion("club_manager between", value1, value2, "clubManager");
            return (Criteria) this;
        }

        public Criteria andClubManagerNotBetween(Integer value1, Integer value2) {
            addCriterion("club_manager not between", value1, value2, "clubManager");
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