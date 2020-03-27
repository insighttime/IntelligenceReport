package com.lightinit.economicinformation.entity;

import java.util.ArrayList;
import java.util.List;

public class DatabaseSuffixNameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatabaseSuffixNameExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameIsNull() {
            addCriterion("database_show_name is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameIsNotNull() {
            addCriterion("database_show_name is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameEqualTo(String value) {
            addCriterion("database_show_name =", value, "databaseShowName");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameNotEqualTo(String value) {
            addCriterion("database_show_name <>", value, "databaseShowName");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameGreaterThan(String value) {
            addCriterion("database_show_name >", value, "databaseShowName");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameGreaterThanOrEqualTo(String value) {
            addCriterion("database_show_name >=", value, "databaseShowName");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameLessThan(String value) {
            addCriterion("database_show_name <", value, "databaseShowName");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameLessThanOrEqualTo(String value) {
            addCriterion("database_show_name <=", value, "databaseShowName");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameLike(String value) {
            addCriterion("database_show_name like", value, "databaseShowName");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameNotLike(String value) {
            addCriterion("database_show_name not like", value, "databaseShowName");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameIn(List<String> values) {
            addCriterion("database_show_name in", values, "databaseShowName");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameNotIn(List<String> values) {
            addCriterion("database_show_name not in", values, "databaseShowName");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameBetween(String value1, String value2) {
            addCriterion("database_show_name between", value1, value2, "databaseShowName");
            return (Criteria) this;
        }

        public Criteria andDatabaseShowNameNotBetween(String value1, String value2) {
            addCriterion("database_show_name not between", value1, value2, "databaseShowName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameIsNull() {
            addCriterion("source_database_name is null");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameIsNotNull() {
            addCriterion("source_database_name is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameEqualTo(String value) {
            addCriterion("source_database_name =", value, "sourceDatabaseName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameNotEqualTo(String value) {
            addCriterion("source_database_name <>", value, "sourceDatabaseName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameGreaterThan(String value) {
            addCriterion("source_database_name >", value, "sourceDatabaseName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("source_database_name >=", value, "sourceDatabaseName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameLessThan(String value) {
            addCriterion("source_database_name <", value, "sourceDatabaseName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameLessThanOrEqualTo(String value) {
            addCriterion("source_database_name <=", value, "sourceDatabaseName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameLike(String value) {
            addCriterion("source_database_name like", value, "sourceDatabaseName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameNotLike(String value) {
            addCriterion("source_database_name not like", value, "sourceDatabaseName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameIn(List<String> values) {
            addCriterion("source_database_name in", values, "sourceDatabaseName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameNotIn(List<String> values) {
            addCriterion("source_database_name not in", values, "sourceDatabaseName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameBetween(String value1, String value2) {
            addCriterion("source_database_name between", value1, value2, "sourceDatabaseName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseNameNotBetween(String value1, String value2) {
            addCriterion("source_database_name not between", value1, value2, "sourceDatabaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixIsNull() {
            addCriterion("database_suffix is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixIsNotNull() {
            addCriterion("database_suffix is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixEqualTo(String value) {
            addCriterion("database_suffix =", value, "databaseSuffix");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixNotEqualTo(String value) {
            addCriterion("database_suffix <>", value, "databaseSuffix");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixGreaterThan(String value) {
            addCriterion("database_suffix >", value, "databaseSuffix");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("database_suffix >=", value, "databaseSuffix");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixLessThan(String value) {
            addCriterion("database_suffix <", value, "databaseSuffix");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixLessThanOrEqualTo(String value) {
            addCriterion("database_suffix <=", value, "databaseSuffix");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixLike(String value) {
            addCriterion("database_suffix like", value, "databaseSuffix");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixNotLike(String value) {
            addCriterion("database_suffix not like", value, "databaseSuffix");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixIn(List<String> values) {
            addCriterion("database_suffix in", values, "databaseSuffix");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixNotIn(List<String> values) {
            addCriterion("database_suffix not in", values, "databaseSuffix");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixBetween(String value1, String value2) {
            addCriterion("database_suffix between", value1, value2, "databaseSuffix");
            return (Criteria) this;
        }

        public Criteria andDatabaseSuffixNotBetween(String value1, String value2) {
            addCriterion("database_suffix not between", value1, value2, "databaseSuffix");
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