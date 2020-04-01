package com.lightinit.economicinformation.entity;

import java.util.ArrayList;
import java.util.List;

public class TbOtherDatabaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOtherDatabaseInfoExample() {
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

        public Criteria andSourceDatabaseChNameIsNull() {
            addCriterion("source_database_ch_name is null");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameIsNotNull() {
            addCriterion("source_database_ch_name is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameEqualTo(String value) {
            addCriterion("source_database_ch_name =", value, "sourceDatabaseChName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameNotEqualTo(String value) {
            addCriterion("source_database_ch_name <>", value, "sourceDatabaseChName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameGreaterThan(String value) {
            addCriterion("source_database_ch_name >", value, "sourceDatabaseChName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameGreaterThanOrEqualTo(String value) {
            addCriterion("source_database_ch_name >=", value, "sourceDatabaseChName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameLessThan(String value) {
            addCriterion("source_database_ch_name <", value, "sourceDatabaseChName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameLessThanOrEqualTo(String value) {
            addCriterion("source_database_ch_name <=", value, "sourceDatabaseChName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameLike(String value) {
            addCriterion("source_database_ch_name like", value, "sourceDatabaseChName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameNotLike(String value) {
            addCriterion("source_database_ch_name not like", value, "sourceDatabaseChName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameIn(List<String> values) {
            addCriterion("source_database_ch_name in", values, "sourceDatabaseChName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameNotIn(List<String> values) {
            addCriterion("source_database_ch_name not in", values, "sourceDatabaseChName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameBetween(String value1, String value2) {
            addCriterion("source_database_ch_name between", value1, value2, "sourceDatabaseChName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseChNameNotBetween(String value1, String value2) {
            addCriterion("source_database_ch_name not between", value1, value2, "sourceDatabaseChName");
            return (Criteria) this;
        }

        public Criteria andSuffixIsNull() {
            addCriterion("suffix is null");
            return (Criteria) this;
        }

        public Criteria andSuffixIsNotNull() {
            addCriterion("suffix is not null");
            return (Criteria) this;
        }

        public Criteria andSuffixEqualTo(String value) {
            addCriterion("suffix =", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotEqualTo(String value) {
            addCriterion("suffix <>", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixGreaterThan(String value) {
            addCriterion("suffix >", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("suffix >=", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLessThan(String value) {
            addCriterion("suffix <", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLessThanOrEqualTo(String value) {
            addCriterion("suffix <=", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLike(String value) {
            addCriterion("suffix like", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotLike(String value) {
            addCriterion("suffix not like", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixIn(List<String> values) {
            addCriterion("suffix in", values, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotIn(List<String> values) {
            addCriterion("suffix not in", values, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixBetween(String value1, String value2) {
            addCriterion("suffix between", value1, value2, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotBetween(String value1, String value2) {
            addCriterion("suffix not between", value1, value2, "suffix");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameIsNull() {
            addCriterion("source_database_real_name is null");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameIsNotNull() {
            addCriterion("source_database_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameEqualTo(String value) {
            addCriterion("source_database_real_name =", value, "sourceDatabaseRealName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameNotEqualTo(String value) {
            addCriterion("source_database_real_name <>", value, "sourceDatabaseRealName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameGreaterThan(String value) {
            addCriterion("source_database_real_name >", value, "sourceDatabaseRealName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("source_database_real_name >=", value, "sourceDatabaseRealName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameLessThan(String value) {
            addCriterion("source_database_real_name <", value, "sourceDatabaseRealName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameLessThanOrEqualTo(String value) {
            addCriterion("source_database_real_name <=", value, "sourceDatabaseRealName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameLike(String value) {
            addCriterion("source_database_real_name like", value, "sourceDatabaseRealName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameNotLike(String value) {
            addCriterion("source_database_real_name not like", value, "sourceDatabaseRealName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameIn(List<String> values) {
            addCriterion("source_database_real_name in", values, "sourceDatabaseRealName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameNotIn(List<String> values) {
            addCriterion("source_database_real_name not in", values, "sourceDatabaseRealName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameBetween(String value1, String value2) {
            addCriterion("source_database_real_name between", value1, value2, "sourceDatabaseRealName");
            return (Criteria) this;
        }

        public Criteria andSourceDatabaseRealNameNotBetween(String value1, String value2) {
            addCriterion("source_database_real_name not between", value1, value2, "sourceDatabaseRealName");
            return (Criteria) this;
        }

        public Criteria andServerHostIsNull() {
            addCriterion("server_host is null");
            return (Criteria) this;
        }

        public Criteria andServerHostIsNotNull() {
            addCriterion("server_host is not null");
            return (Criteria) this;
        }

        public Criteria andServerHostEqualTo(String value) {
            addCriterion("server_host =", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostNotEqualTo(String value) {
            addCriterion("server_host <>", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostGreaterThan(String value) {
            addCriterion("server_host >", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostGreaterThanOrEqualTo(String value) {
            addCriterion("server_host >=", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostLessThan(String value) {
            addCriterion("server_host <", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostLessThanOrEqualTo(String value) {
            addCriterion("server_host <=", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostLike(String value) {
            addCriterion("server_host like", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostNotLike(String value) {
            addCriterion("server_host not like", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostIn(List<String> values) {
            addCriterion("server_host in", values, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostNotIn(List<String> values) {
            addCriterion("server_host not in", values, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostBetween(String value1, String value2) {
            addCriterion("server_host between", value1, value2, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostNotBetween(String value1, String value2) {
            addCriterion("server_host not between", value1, value2, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerUserIsNull() {
            addCriterion("server_user is null");
            return (Criteria) this;
        }

        public Criteria andServerUserIsNotNull() {
            addCriterion("server_user is not null");
            return (Criteria) this;
        }

        public Criteria andServerUserEqualTo(String value) {
            addCriterion("server_user =", value, "serverUser");
            return (Criteria) this;
        }

        public Criteria andServerUserNotEqualTo(String value) {
            addCriterion("server_user <>", value, "serverUser");
            return (Criteria) this;
        }

        public Criteria andServerUserGreaterThan(String value) {
            addCriterion("server_user >", value, "serverUser");
            return (Criteria) this;
        }

        public Criteria andServerUserGreaterThanOrEqualTo(String value) {
            addCriterion("server_user >=", value, "serverUser");
            return (Criteria) this;
        }

        public Criteria andServerUserLessThan(String value) {
            addCriterion("server_user <", value, "serverUser");
            return (Criteria) this;
        }

        public Criteria andServerUserLessThanOrEqualTo(String value) {
            addCriterion("server_user <=", value, "serverUser");
            return (Criteria) this;
        }

        public Criteria andServerUserLike(String value) {
            addCriterion("server_user like", value, "serverUser");
            return (Criteria) this;
        }

        public Criteria andServerUserNotLike(String value) {
            addCriterion("server_user not like", value, "serverUser");
            return (Criteria) this;
        }

        public Criteria andServerUserIn(List<String> values) {
            addCriterion("server_user in", values, "serverUser");
            return (Criteria) this;
        }

        public Criteria andServerUserNotIn(List<String> values) {
            addCriterion("server_user not in", values, "serverUser");
            return (Criteria) this;
        }

        public Criteria andServerUserBetween(String value1, String value2) {
            addCriterion("server_user between", value1, value2, "serverUser");
            return (Criteria) this;
        }

        public Criteria andServerUserNotBetween(String value1, String value2) {
            addCriterion("server_user not between", value1, value2, "serverUser");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordIsNull() {
            addCriterion("server_user_password is null");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordIsNotNull() {
            addCriterion("server_user_password is not null");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordEqualTo(String value) {
            addCriterion("server_user_password =", value, "serverUserPassword");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordNotEqualTo(String value) {
            addCriterion("server_user_password <>", value, "serverUserPassword");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordGreaterThan(String value) {
            addCriterion("server_user_password >", value, "serverUserPassword");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("server_user_password >=", value, "serverUserPassword");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordLessThan(String value) {
            addCriterion("server_user_password <", value, "serverUserPassword");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("server_user_password <=", value, "serverUserPassword");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordLike(String value) {
            addCriterion("server_user_password like", value, "serverUserPassword");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordNotLike(String value) {
            addCriterion("server_user_password not like", value, "serverUserPassword");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordIn(List<String> values) {
            addCriterion("server_user_password in", values, "serverUserPassword");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordNotIn(List<String> values) {
            addCriterion("server_user_password not in", values, "serverUserPassword");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordBetween(String value1, String value2) {
            addCriterion("server_user_password between", value1, value2, "serverUserPassword");
            return (Criteria) this;
        }

        public Criteria andServerUserPasswordNotBetween(String value1, String value2) {
            addCriterion("server_user_password not between", value1, value2, "serverUserPassword");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortIsNull() {
            addCriterion("server_database_port is null");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortIsNotNull() {
            addCriterion("server_database_port is not null");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortEqualTo(String value) {
            addCriterion("server_database_port =", value, "serverDatabasePort");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortNotEqualTo(String value) {
            addCriterion("server_database_port <>", value, "serverDatabasePort");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortGreaterThan(String value) {
            addCriterion("server_database_port >", value, "serverDatabasePort");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortGreaterThanOrEqualTo(String value) {
            addCriterion("server_database_port >=", value, "serverDatabasePort");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortLessThan(String value) {
            addCriterion("server_database_port <", value, "serverDatabasePort");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortLessThanOrEqualTo(String value) {
            addCriterion("server_database_port <=", value, "serverDatabasePort");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortLike(String value) {
            addCriterion("server_database_port like", value, "serverDatabasePort");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortNotLike(String value) {
            addCriterion("server_database_port not like", value, "serverDatabasePort");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortIn(List<String> values) {
            addCriterion("server_database_port in", values, "serverDatabasePort");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortNotIn(List<String> values) {
            addCriterion("server_database_port not in", values, "serverDatabasePort");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortBetween(String value1, String value2) {
            addCriterion("server_database_port between", value1, value2, "serverDatabasePort");
            return (Criteria) this;
        }

        public Criteria andServerDatabasePortNotBetween(String value1, String value2) {
            addCriterion("server_database_port not between", value1, value2, "serverDatabasePort");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
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