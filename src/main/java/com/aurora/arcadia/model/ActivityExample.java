package com.aurora.arcadia.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIsNull() {
            addCriterion("activity_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIsNotNull() {
            addCriterion("activity_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTimeEqualTo(Date value) {
            addCriterionForJDBCDate("activity_time =", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("activity_time <>", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("activity_time >", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("activity_time >=", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeLessThan(Date value) {
            addCriterionForJDBCDate("activity_time <", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("activity_time <=", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIn(List<Date> values) {
            addCriterionForJDBCDate("activity_time in", values, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("activity_time not in", values, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("activity_time between", value1, value2, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("activity_time not between", value1, value2, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityClubIdIsNull() {
            addCriterion("activity_club_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityClubIdIsNotNull() {
            addCriterion("activity_club_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityClubIdEqualTo(Integer value) {
            addCriterion("activity_club_id =", value, "activityClubId");
            return (Criteria) this;
        }

        public Criteria andActivityClubIdNotEqualTo(Integer value) {
            addCriterion("activity_club_id <>", value, "activityClubId");
            return (Criteria) this;
        }

        public Criteria andActivityClubIdGreaterThan(Integer value) {
            addCriterion("activity_club_id >", value, "activityClubId");
            return (Criteria) this;
        }

        public Criteria andActivityClubIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_club_id >=", value, "activityClubId");
            return (Criteria) this;
        }

        public Criteria andActivityClubIdLessThan(Integer value) {
            addCriterion("activity_club_id <", value, "activityClubId");
            return (Criteria) this;
        }

        public Criteria andActivityClubIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_club_id <=", value, "activityClubId");
            return (Criteria) this;
        }

        public Criteria andActivityClubIdIn(List<Integer> values) {
            addCriterion("activity_club_id in", values, "activityClubId");
            return (Criteria) this;
        }

        public Criteria andActivityClubIdNotIn(List<Integer> values) {
            addCriterion("activity_club_id not in", values, "activityClubId");
            return (Criteria) this;
        }

        public Criteria andActivityClubIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_club_id between", value1, value2, "activityClubId");
            return (Criteria) this;
        }

        public Criteria andActivityClubIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_club_id not between", value1, value2, "activityClubId");
            return (Criteria) this;
        }

        public Criteria andActivityIntroIsNull() {
            addCriterion("activity_intro is null");
            return (Criteria) this;
        }

        public Criteria andActivityIntroIsNotNull() {
            addCriterion("activity_intro is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIntroEqualTo(String value) {
            addCriterion("activity_intro =", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroNotEqualTo(String value) {
            addCriterion("activity_intro <>", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroGreaterThan(String value) {
            addCriterion("activity_intro >", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroGreaterThanOrEqualTo(String value) {
            addCriterion("activity_intro >=", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroLessThan(String value) {
            addCriterion("activity_intro <", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroLessThanOrEqualTo(String value) {
            addCriterion("activity_intro <=", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroLike(String value) {
            addCriterion("activity_intro like", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroNotLike(String value) {
            addCriterion("activity_intro not like", value, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroIn(List<String> values) {
            addCriterion("activity_intro in", values, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroNotIn(List<String> values) {
            addCriterion("activity_intro not in", values, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroBetween(String value1, String value2) {
            addCriterion("activity_intro between", value1, value2, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivityIntroNotBetween(String value1, String value2) {
            addCriterion("activity_intro not between", value1, value2, "activityIntro");
            return (Criteria) this;
        }

        public Criteria andActivitySignIsNull() {
            addCriterion("activity_sign is null");
            return (Criteria) this;
        }

        public Criteria andActivitySignIsNotNull() {
            addCriterion("activity_sign is not null");
            return (Criteria) this;
        }

        public Criteria andActivitySignEqualTo(Integer value) {
            addCriterion("activity_sign =", value, "activitySign");
            return (Criteria) this;
        }

        public Criteria andActivitySignNotEqualTo(Integer value) {
            addCriterion("activity_sign <>", value, "activitySign");
            return (Criteria) this;
        }

        public Criteria andActivitySignGreaterThan(Integer value) {
            addCriterion("activity_sign >", value, "activitySign");
            return (Criteria) this;
        }

        public Criteria andActivitySignGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_sign >=", value, "activitySign");
            return (Criteria) this;
        }

        public Criteria andActivitySignLessThan(Integer value) {
            addCriterion("activity_sign <", value, "activitySign");
            return (Criteria) this;
        }

        public Criteria andActivitySignLessThanOrEqualTo(Integer value) {
            addCriterion("activity_sign <=", value, "activitySign");
            return (Criteria) this;
        }

        public Criteria andActivitySignIn(List<Integer> values) {
            addCriterion("activity_sign in", values, "activitySign");
            return (Criteria) this;
        }

        public Criteria andActivitySignNotIn(List<Integer> values) {
            addCriterion("activity_sign not in", values, "activitySign");
            return (Criteria) this;
        }

        public Criteria andActivitySignBetween(Integer value1, Integer value2) {
            addCriterion("activity_sign between", value1, value2, "activitySign");
            return (Criteria) this;
        }

        public Criteria andActivitySignNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_sign not between", value1, value2, "activitySign");
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