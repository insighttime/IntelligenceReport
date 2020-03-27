package com.lightinit.economicinformation.entity;

import java.util.ArrayList;
import java.util.List;

public class TbVariableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbVariableExample() {
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

        public Criteria andDatabaseNameIsNull() {
            addCriterion("database_name is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIsNotNull() {
            addCriterion("database_name is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameEqualTo(String value) {
            addCriterion("database_name =", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotEqualTo(String value) {
            addCriterion("database_name <>", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameGreaterThan(String value) {
            addCriterion("database_name >", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("database_name >=", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLessThan(String value) {
            addCriterion("database_name <", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLessThanOrEqualTo(String value) {
            addCriterion("database_name <=", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLike(String value) {
            addCriterion("database_name like", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotLike(String value) {
            addCriterion("database_name not like", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIn(List<String> values) {
            addCriterion("database_name in", values, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotIn(List<String> values) {
            addCriterion("database_name not in", values, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameBetween(String value1, String value2) {
            addCriterion("database_name between", value1, value2, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotBetween(String value1, String value2) {
            addCriterion("database_name not between", value1, value2, "databaseName");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameIsNull() {
            addCriterion("batabase_ch_name is null");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameIsNotNull() {
            addCriterion("batabase_ch_name is not null");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameEqualTo(String value) {
            addCriterion("batabase_ch_name =", value, "batabaseChName");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameNotEqualTo(String value) {
            addCriterion("batabase_ch_name <>", value, "batabaseChName");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameGreaterThan(String value) {
            addCriterion("batabase_ch_name >", value, "batabaseChName");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameGreaterThanOrEqualTo(String value) {
            addCriterion("batabase_ch_name >=", value, "batabaseChName");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameLessThan(String value) {
            addCriterion("batabase_ch_name <", value, "batabaseChName");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameLessThanOrEqualTo(String value) {
            addCriterion("batabase_ch_name <=", value, "batabaseChName");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameLike(String value) {
            addCriterion("batabase_ch_name like", value, "batabaseChName");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameNotLike(String value) {
            addCriterion("batabase_ch_name not like", value, "batabaseChName");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameIn(List<String> values) {
            addCriterion("batabase_ch_name in", values, "batabaseChName");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameNotIn(List<String> values) {
            addCriterion("batabase_ch_name not in", values, "batabaseChName");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameBetween(String value1, String value2) {
            addCriterion("batabase_ch_name between", value1, value2, "batabaseChName");
            return (Criteria) this;
        }

        public Criteria andBatabaseChNameNotBetween(String value1, String value2) {
            addCriterion("batabase_ch_name not between", value1, value2, "batabaseChName");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryIsNull() {
            addCriterion("variable_category is null");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryIsNotNull() {
            addCriterion("variable_category is not null");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryEqualTo(String value) {
            addCriterion("variable_category =", value, "variableCategory");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryNotEqualTo(String value) {
            addCriterion("variable_category <>", value, "variableCategory");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryGreaterThan(String value) {
            addCriterion("variable_category >", value, "variableCategory");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("variable_category >=", value, "variableCategory");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryLessThan(String value) {
            addCriterion("variable_category <", value, "variableCategory");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryLessThanOrEqualTo(String value) {
            addCriterion("variable_category <=", value, "variableCategory");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryLike(String value) {
            addCriterion("variable_category like", value, "variableCategory");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryNotLike(String value) {
            addCriterion("variable_category not like", value, "variableCategory");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryIn(List<String> values) {
            addCriterion("variable_category in", values, "variableCategory");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryNotIn(List<String> values) {
            addCriterion("variable_category not in", values, "variableCategory");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryBetween(String value1, String value2) {
            addCriterion("variable_category between", value1, value2, "variableCategory");
            return (Criteria) this;
        }

        public Criteria andVariableCategoryNotBetween(String value1, String value2) {
            addCriterion("variable_category not between", value1, value2, "variableCategory");
            return (Criteria) this;
        }

        public Criteria andTargetNameIsNull() {
            addCriterion("target_name is null");
            return (Criteria) this;
        }

        public Criteria andTargetNameIsNotNull() {
            addCriterion("target_name is not null");
            return (Criteria) this;
        }

        public Criteria andTargetNameEqualTo(String value) {
            addCriterion("target_name =", value, "targetName");
            return (Criteria) this;
        }

        public Criteria andTargetNameNotEqualTo(String value) {
            addCriterion("target_name <>", value, "targetName");
            return (Criteria) this;
        }

        public Criteria andTargetNameGreaterThan(String value) {
            addCriterion("target_name >", value, "targetName");
            return (Criteria) this;
        }

        public Criteria andTargetNameGreaterThanOrEqualTo(String value) {
            addCriterion("target_name >=", value, "targetName");
            return (Criteria) this;
        }

        public Criteria andTargetNameLessThan(String value) {
            addCriterion("target_name <", value, "targetName");
            return (Criteria) this;
        }

        public Criteria andTargetNameLessThanOrEqualTo(String value) {
            addCriterion("target_name <=", value, "targetName");
            return (Criteria) this;
        }

        public Criteria andTargetNameLike(String value) {
            addCriterion("target_name like", value, "targetName");
            return (Criteria) this;
        }

        public Criteria andTargetNameNotLike(String value) {
            addCriterion("target_name not like", value, "targetName");
            return (Criteria) this;
        }

        public Criteria andTargetNameIn(List<String> values) {
            addCriterion("target_name in", values, "targetName");
            return (Criteria) this;
        }

        public Criteria andTargetNameNotIn(List<String> values) {
            addCriterion("target_name not in", values, "targetName");
            return (Criteria) this;
        }

        public Criteria andTargetNameBetween(String value1, String value2) {
            addCriterion("target_name between", value1, value2, "targetName");
            return (Criteria) this;
        }

        public Criteria andTargetNameNotBetween(String value1, String value2) {
            addCriterion("target_name not between", value1, value2, "targetName");
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