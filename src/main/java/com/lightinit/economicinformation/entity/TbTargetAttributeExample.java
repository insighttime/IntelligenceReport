package com.lightinit.economicinformation.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbTargetAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTargetAttributeExample() {
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

        public Criteria andVariableIdIsNull() {
            addCriterion("variable_id is null");
            return (Criteria) this;
        }

        public Criteria andVariableIdIsNotNull() {
            addCriterion("variable_id is not null");
            return (Criteria) this;
        }

        public Criteria andVariableIdEqualTo(Integer value) {
            addCriterion("variable_id =", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotEqualTo(Integer value) {
            addCriterion("variable_id <>", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdGreaterThan(Integer value) {
            addCriterion("variable_id >", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("variable_id >=", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdLessThan(Integer value) {
            addCriterion("variable_id <", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdLessThanOrEqualTo(Integer value) {
            addCriterion("variable_id <=", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdIn(List<Integer> values) {
            addCriterion("variable_id in", values, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotIn(List<Integer> values) {
            addCriterion("variable_id not in", values, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdBetween(Integer value1, Integer value2) {
            addCriterion("variable_id between", value1, value2, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("variable_id not between", value1, value2, "variableId");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameIsNull() {
            addCriterion("target_from_table_name is null");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameIsNotNull() {
            addCriterion("target_from_table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameEqualTo(String value) {
            addCriterion("target_from_table_name =", value, "targetFromTableName");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameNotEqualTo(String value) {
            addCriterion("target_from_table_name <>", value, "targetFromTableName");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameGreaterThan(String value) {
            addCriterion("target_from_table_name >", value, "targetFromTableName");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("target_from_table_name >=", value, "targetFromTableName");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameLessThan(String value) {
            addCriterion("target_from_table_name <", value, "targetFromTableName");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameLessThanOrEqualTo(String value) {
            addCriterion("target_from_table_name <=", value, "targetFromTableName");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameLike(String value) {
            addCriterion("target_from_table_name like", value, "targetFromTableName");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameNotLike(String value) {
            addCriterion("target_from_table_name not like", value, "targetFromTableName");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameIn(List<String> values) {
            addCriterion("target_from_table_name in", values, "targetFromTableName");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameNotIn(List<String> values) {
            addCriterion("target_from_table_name not in", values, "targetFromTableName");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameBetween(String value1, String value2) {
            addCriterion("target_from_table_name between", value1, value2, "targetFromTableName");
            return (Criteria) this;
        }

        public Criteria andTargetFromTableNameNotBetween(String value1, String value2) {
            addCriterion("target_from_table_name not between", value1, value2, "targetFromTableName");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldIsNull() {
            addCriterion("target_index_field is null");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldIsNotNull() {
            addCriterion("target_index_field is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldEqualTo(String value) {
            addCriterion("target_index_field =", value, "targetIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldNotEqualTo(String value) {
            addCriterion("target_index_field <>", value, "targetIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldGreaterThan(String value) {
            addCriterion("target_index_field >", value, "targetIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldGreaterThanOrEqualTo(String value) {
            addCriterion("target_index_field >=", value, "targetIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldLessThan(String value) {
            addCriterion("target_index_field <", value, "targetIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldLessThanOrEqualTo(String value) {
            addCriterion("target_index_field <=", value, "targetIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldLike(String value) {
            addCriterion("target_index_field like", value, "targetIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldNotLike(String value) {
            addCriterion("target_index_field not like", value, "targetIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldIn(List<String> values) {
            addCriterion("target_index_field in", values, "targetIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldNotIn(List<String> values) {
            addCriterion("target_index_field not in", values, "targetIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldBetween(String value1, String value2) {
            addCriterion("target_index_field between", value1, value2, "targetIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetIndexFieldNotBetween(String value1, String value2) {
            addCriterion("target_index_field not between", value1, value2, "targetIndexField");
            return (Criteria) this;
        }

        public Criteria andDefaultDescribeIdIsNull() {
            addCriterion("default_describe_id is null");
            return (Criteria) this;
        }

        public Criteria andDefaultDescribeIdIsNotNull() {
            addCriterion("default_describe_id is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultDescribeIdEqualTo(Integer value) {
            addCriterion("default_describe_id =", value, "defaultDescribeId");
            return (Criteria) this;
        }

        public Criteria andDefaultDescribeIdNotEqualTo(Integer value) {
            addCriterion("default_describe_id <>", value, "defaultDescribeId");
            return (Criteria) this;
        }

        public Criteria andDefaultDescribeIdGreaterThan(Integer value) {
            addCriterion("default_describe_id >", value, "defaultDescribeId");
            return (Criteria) this;
        }

        public Criteria andDefaultDescribeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_describe_id >=", value, "defaultDescribeId");
            return (Criteria) this;
        }

        public Criteria andDefaultDescribeIdLessThan(Integer value) {
            addCriterion("default_describe_id <", value, "defaultDescribeId");
            return (Criteria) this;
        }

        public Criteria andDefaultDescribeIdLessThanOrEqualTo(Integer value) {
            addCriterion("default_describe_id <=", value, "defaultDescribeId");
            return (Criteria) this;
        }

        public Criteria andDefaultDescribeIdIn(List<Integer> values) {
            addCriterion("default_describe_id in", values, "defaultDescribeId");
            return (Criteria) this;
        }

        public Criteria andDefaultDescribeIdNotIn(List<Integer> values) {
            addCriterion("default_describe_id not in", values, "defaultDescribeId");
            return (Criteria) this;
        }

        public Criteria andDefaultDescribeIdBetween(Integer value1, Integer value2) {
            addCriterion("default_describe_id between", value1, value2, "defaultDescribeId");
            return (Criteria) this;
        }

        public Criteria andDefaultDescribeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("default_describe_id not between", value1, value2, "defaultDescribeId");
            return (Criteria) this;
        }

        public Criteria andBaseTimeIsNull() {
            addCriterion("base_time is null");
            return (Criteria) this;
        }

        public Criteria andBaseTimeIsNotNull() {
            addCriterion("base_time is not null");
            return (Criteria) this;
        }

        public Criteria andBaseTimeEqualTo(Date value) {
            addCriterion("base_time =", value, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeNotEqualTo(Date value) {
            addCriterion("base_time <>", value, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeGreaterThan(Date value) {
            addCriterion("base_time >", value, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("base_time >=", value, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeLessThan(Date value) {
            addCriterion("base_time <", value, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("base_time <=", value, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeIn(List<Date> values) {
            addCriterion("base_time in", values, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeNotIn(List<Date> values) {
            addCriterion("base_time not in", values, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeBetween(Date value1, Date value2) {
            addCriterion("base_time between", value1, value2, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("base_time not between", value1, value2, "baseTime");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameIsNull() {
            addCriterion("target_attribute_name is null");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameIsNotNull() {
            addCriterion("target_attribute_name is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameEqualTo(String value) {
            addCriterion("target_attribute_name =", value, "targetAttributeName");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameNotEqualTo(String value) {
            addCriterion("target_attribute_name <>", value, "targetAttributeName");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameGreaterThan(String value) {
            addCriterion("target_attribute_name >", value, "targetAttributeName");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameGreaterThanOrEqualTo(String value) {
            addCriterion("target_attribute_name >=", value, "targetAttributeName");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameLessThan(String value) {
            addCriterion("target_attribute_name <", value, "targetAttributeName");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameLessThanOrEqualTo(String value) {
            addCriterion("target_attribute_name <=", value, "targetAttributeName");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameLike(String value) {
            addCriterion("target_attribute_name like", value, "targetAttributeName");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameNotLike(String value) {
            addCriterion("target_attribute_name not like", value, "targetAttributeName");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameIn(List<String> values) {
            addCriterion("target_attribute_name in", values, "targetAttributeName");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameNotIn(List<String> values) {
            addCriterion("target_attribute_name not in", values, "targetAttributeName");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameBetween(String value1, String value2) {
            addCriterion("target_attribute_name between", value1, value2, "targetAttributeName");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeNameNotBetween(String value1, String value2) {
            addCriterion("target_attribute_name not between", value1, value2, "targetAttributeName");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeIsNull() {
            addCriterion("target_attribute_type is null");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeIsNotNull() {
            addCriterion("target_attribute_type is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeEqualTo(String value) {
            addCriterion("target_attribute_type =", value, "targetAttributeType");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeNotEqualTo(String value) {
            addCriterion("target_attribute_type <>", value, "targetAttributeType");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeGreaterThan(String value) {
            addCriterion("target_attribute_type >", value, "targetAttributeType");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("target_attribute_type >=", value, "targetAttributeType");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeLessThan(String value) {
            addCriterion("target_attribute_type <", value, "targetAttributeType");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeLessThanOrEqualTo(String value) {
            addCriterion("target_attribute_type <=", value, "targetAttributeType");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeLike(String value) {
            addCriterion("target_attribute_type like", value, "targetAttributeType");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeNotLike(String value) {
            addCriterion("target_attribute_type not like", value, "targetAttributeType");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeIn(List<String> values) {
            addCriterion("target_attribute_type in", values, "targetAttributeType");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeNotIn(List<String> values) {
            addCriterion("target_attribute_type not in", values, "targetAttributeType");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeBetween(String value1, String value2) {
            addCriterion("target_attribute_type between", value1, value2, "targetAttributeType");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeTypeNotBetween(String value1, String value2) {
            addCriterion("target_attribute_type not between", value1, value2, "targetAttributeType");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldIsNull() {
            addCriterion("target_attribute_index_field is null");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldIsNotNull() {
            addCriterion("target_attribute_index_field is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldEqualTo(String value) {
            addCriterion("target_attribute_index_field =", value, "targetAttributeIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldNotEqualTo(String value) {
            addCriterion("target_attribute_index_field <>", value, "targetAttributeIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldGreaterThan(String value) {
            addCriterion("target_attribute_index_field >", value, "targetAttributeIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldGreaterThanOrEqualTo(String value) {
            addCriterion("target_attribute_index_field >=", value, "targetAttributeIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldLessThan(String value) {
            addCriterion("target_attribute_index_field <", value, "targetAttributeIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldLessThanOrEqualTo(String value) {
            addCriterion("target_attribute_index_field <=", value, "targetAttributeIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldLike(String value) {
            addCriterion("target_attribute_index_field like", value, "targetAttributeIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldNotLike(String value) {
            addCriterion("target_attribute_index_field not like", value, "targetAttributeIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldIn(List<String> values) {
            addCriterion("target_attribute_index_field in", values, "targetAttributeIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldNotIn(List<String> values) {
            addCriterion("target_attribute_index_field not in", values, "targetAttributeIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldBetween(String value1, String value2) {
            addCriterion("target_attribute_index_field between", value1, value2, "targetAttributeIndexField");
            return (Criteria) this;
        }

        public Criteria andTargetAttributeIndexFieldNotBetween(String value1, String value2) {
            addCriterion("target_attribute_index_field not between", value1, value2, "targetAttributeIndexField");
            return (Criteria) this;
        }

        public Criteria andComputingMethodIdIsNull() {
            addCriterion("computing_method_id is null");
            return (Criteria) this;
        }

        public Criteria andComputingMethodIdIsNotNull() {
            addCriterion("computing_method_id is not null");
            return (Criteria) this;
        }

        public Criteria andComputingMethodIdEqualTo(Integer value) {
            addCriterion("computing_method_id =", value, "computingMethodId");
            return (Criteria) this;
        }

        public Criteria andComputingMethodIdNotEqualTo(Integer value) {
            addCriterion("computing_method_id <>", value, "computingMethodId");
            return (Criteria) this;
        }

        public Criteria andComputingMethodIdGreaterThan(Integer value) {
            addCriterion("computing_method_id >", value, "computingMethodId");
            return (Criteria) this;
        }

        public Criteria andComputingMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("computing_method_id >=", value, "computingMethodId");
            return (Criteria) this;
        }

        public Criteria andComputingMethodIdLessThan(Integer value) {
            addCriterion("computing_method_id <", value, "computingMethodId");
            return (Criteria) this;
        }

        public Criteria andComputingMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("computing_method_id <=", value, "computingMethodId");
            return (Criteria) this;
        }

        public Criteria andComputingMethodIdIn(List<Integer> values) {
            addCriterion("computing_method_id in", values, "computingMethodId");
            return (Criteria) this;
        }

        public Criteria andComputingMethodIdNotIn(List<Integer> values) {
            addCriterion("computing_method_id not in", values, "computingMethodId");
            return (Criteria) this;
        }

        public Criteria andComputingMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("computing_method_id between", value1, value2, "computingMethodId");
            return (Criteria) this;
        }

        public Criteria andComputingMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("computing_method_id not between", value1, value2, "computingMethodId");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedIsNull() {
            addCriterion("filter_supported is null");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedIsNotNull() {
            addCriterion("filter_supported is not null");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedEqualTo(String value) {
            addCriterion("filter_supported =", value, "filterSupported");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedNotEqualTo(String value) {
            addCriterion("filter_supported <>", value, "filterSupported");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedGreaterThan(String value) {
            addCriterion("filter_supported >", value, "filterSupported");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedGreaterThanOrEqualTo(String value) {
            addCriterion("filter_supported >=", value, "filterSupported");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedLessThan(String value) {
            addCriterion("filter_supported <", value, "filterSupported");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedLessThanOrEqualTo(String value) {
            addCriterion("filter_supported <=", value, "filterSupported");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedLike(String value) {
            addCriterion("filter_supported like", value, "filterSupported");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedNotLike(String value) {
            addCriterion("filter_supported not like", value, "filterSupported");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedIn(List<String> values) {
            addCriterion("filter_supported in", values, "filterSupported");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedNotIn(List<String> values) {
            addCriterion("filter_supported not in", values, "filterSupported");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedBetween(String value1, String value2) {
            addCriterion("filter_supported between", value1, value2, "filterSupported");
            return (Criteria) this;
        }

        public Criteria andFilterSupportedNotBetween(String value1, String value2) {
            addCriterion("filter_supported not between", value1, value2, "filterSupported");
            return (Criteria) this;
        }

        public Criteria andFilterCondition2IdIsNull() {
            addCriterion("filter_condition_2_id is null");
            return (Criteria) this;
        }

        public Criteria andFilterCondition2IdIsNotNull() {
            addCriterion("filter_condition_2_id is not null");
            return (Criteria) this;
        }

        public Criteria andFilterCondition2IdEqualTo(Integer value) {
            addCriterion("filter_condition_2_id =", value, "filterCondition2Id");
            return (Criteria) this;
        }

        public Criteria andFilterCondition2IdNotEqualTo(Integer value) {
            addCriterion("filter_condition_2_id <>", value, "filterCondition2Id");
            return (Criteria) this;
        }

        public Criteria andFilterCondition2IdGreaterThan(Integer value) {
            addCriterion("filter_condition_2_id >", value, "filterCondition2Id");
            return (Criteria) this;
        }

        public Criteria andFilterCondition2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("filter_condition_2_id >=", value, "filterCondition2Id");
            return (Criteria) this;
        }

        public Criteria andFilterCondition2IdLessThan(Integer value) {
            addCriterion("filter_condition_2_id <", value, "filterCondition2Id");
            return (Criteria) this;
        }

        public Criteria andFilterCondition2IdLessThanOrEqualTo(Integer value) {
            addCriterion("filter_condition_2_id <=", value, "filterCondition2Id");
            return (Criteria) this;
        }

        public Criteria andFilterCondition2IdIn(List<Integer> values) {
            addCriterion("filter_condition_2_id in", values, "filterCondition2Id");
            return (Criteria) this;
        }

        public Criteria andFilterCondition2IdNotIn(List<Integer> values) {
            addCriterion("filter_condition_2_id not in", values, "filterCondition2Id");
            return (Criteria) this;
        }

        public Criteria andFilterCondition2IdBetween(Integer value1, Integer value2) {
            addCriterion("filter_condition_2_id between", value1, value2, "filterCondition2Id");
            return (Criteria) this;
        }

        public Criteria andFilterCondition2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("filter_condition_2_id not between", value1, value2, "filterCondition2Id");
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