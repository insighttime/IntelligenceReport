package com.lightinit.economicinformation.entity;

import java.util.ArrayList;
import java.util.List;

public class TbFirstScreenVariableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbFirstScreenVariableExample() {
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

        public Criteria andInputWayIsNull() {
            addCriterion("input_way is null");
            return (Criteria) this;
        }

        public Criteria andInputWayIsNotNull() {
            addCriterion("input_way is not null");
            return (Criteria) this;
        }

        public Criteria andInputWayEqualTo(String value) {
            addCriterion("input_way =", value, "inputWay");
            return (Criteria) this;
        }

        public Criteria andInputWayNotEqualTo(String value) {
            addCriterion("input_way <>", value, "inputWay");
            return (Criteria) this;
        }

        public Criteria andInputWayGreaterThan(String value) {
            addCriterion("input_way >", value, "inputWay");
            return (Criteria) this;
        }

        public Criteria andInputWayGreaterThanOrEqualTo(String value) {
            addCriterion("input_way >=", value, "inputWay");
            return (Criteria) this;
        }

        public Criteria andInputWayLessThan(String value) {
            addCriterion("input_way <", value, "inputWay");
            return (Criteria) this;
        }

        public Criteria andInputWayLessThanOrEqualTo(String value) {
            addCriterion("input_way <=", value, "inputWay");
            return (Criteria) this;
        }

        public Criteria andInputWayLike(String value) {
            addCriterion("input_way like", value, "inputWay");
            return (Criteria) this;
        }

        public Criteria andInputWayNotLike(String value) {
            addCriterion("input_way not like", value, "inputWay");
            return (Criteria) this;
        }

        public Criteria andInputWayIn(List<String> values) {
            addCriterion("input_way in", values, "inputWay");
            return (Criteria) this;
        }

        public Criteria andInputWayNotIn(List<String> values) {
            addCriterion("input_way not in", values, "inputWay");
            return (Criteria) this;
        }

        public Criteria andInputWayBetween(String value1, String value2) {
            addCriterion("input_way between", value1, value2, "inputWay");
            return (Criteria) this;
        }

        public Criteria andInputWayNotBetween(String value1, String value2) {
            addCriterion("input_way not between", value1, value2, "inputWay");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameIsNull() {
            addCriterion("screen_from_table_name is null");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameIsNotNull() {
            addCriterion("screen_from_table_name is not null");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameEqualTo(String value) {
            addCriterion("screen_from_table_name =", value, "screenFromTableName");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameNotEqualTo(String value) {
            addCriterion("screen_from_table_name <>", value, "screenFromTableName");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameGreaterThan(String value) {
            addCriterion("screen_from_table_name >", value, "screenFromTableName");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("screen_from_table_name >=", value, "screenFromTableName");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameLessThan(String value) {
            addCriterion("screen_from_table_name <", value, "screenFromTableName");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameLessThanOrEqualTo(String value) {
            addCriterion("screen_from_table_name <=", value, "screenFromTableName");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameLike(String value) {
            addCriterion("screen_from_table_name like", value, "screenFromTableName");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameNotLike(String value) {
            addCriterion("screen_from_table_name not like", value, "screenFromTableName");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameIn(List<String> values) {
            addCriterion("screen_from_table_name in", values, "screenFromTableName");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameNotIn(List<String> values) {
            addCriterion("screen_from_table_name not in", values, "screenFromTableName");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameBetween(String value1, String value2) {
            addCriterion("screen_from_table_name between", value1, value2, "screenFromTableName");
            return (Criteria) this;
        }

        public Criteria andScreenFromTableNameNotBetween(String value1, String value2) {
            addCriterion("screen_from_table_name not between", value1, value2, "screenFromTableName");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameIsNull() {
            addCriterion("screen_index_field_name is null");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameIsNotNull() {
            addCriterion("screen_index_field_name is not null");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameEqualTo(String value) {
            addCriterion("screen_index_field_name =", value, "screenIndexFieldName");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameNotEqualTo(String value) {
            addCriterion("screen_index_field_name <>", value, "screenIndexFieldName");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameGreaterThan(String value) {
            addCriterion("screen_index_field_name >", value, "screenIndexFieldName");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("screen_index_field_name >=", value, "screenIndexFieldName");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameLessThan(String value) {
            addCriterion("screen_index_field_name <", value, "screenIndexFieldName");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameLessThanOrEqualTo(String value) {
            addCriterion("screen_index_field_name <=", value, "screenIndexFieldName");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameLike(String value) {
            addCriterion("screen_index_field_name like", value, "screenIndexFieldName");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameNotLike(String value) {
            addCriterion("screen_index_field_name not like", value, "screenIndexFieldName");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameIn(List<String> values) {
            addCriterion("screen_index_field_name in", values, "screenIndexFieldName");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameNotIn(List<String> values) {
            addCriterion("screen_index_field_name not in", values, "screenIndexFieldName");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameBetween(String value1, String value2) {
            addCriterion("screen_index_field_name between", value1, value2, "screenIndexFieldName");
            return (Criteria) this;
        }

        public Criteria andScreenIndexFieldNameNotBetween(String value1, String value2) {
            addCriterion("screen_index_field_name not between", value1, value2, "screenIndexFieldName");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1IsNull() {
            addCriterion("screen_condition_model_1 is null");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1IsNotNull() {
            addCriterion("screen_condition_model_1 is not null");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1EqualTo(String value) {
            addCriterion("screen_condition_model_1 =", value, "screenConditionModel1");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1NotEqualTo(String value) {
            addCriterion("screen_condition_model_1 <>", value, "screenConditionModel1");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1GreaterThan(String value) {
            addCriterion("screen_condition_model_1 >", value, "screenConditionModel1");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1GreaterThanOrEqualTo(String value) {
            addCriterion("screen_condition_model_1 >=", value, "screenConditionModel1");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1LessThan(String value) {
            addCriterion("screen_condition_model_1 <", value, "screenConditionModel1");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1LessThanOrEqualTo(String value) {
            addCriterion("screen_condition_model_1 <=", value, "screenConditionModel1");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1Like(String value) {
            addCriterion("screen_condition_model_1 like", value, "screenConditionModel1");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1NotLike(String value) {
            addCriterion("screen_condition_model_1 not like", value, "screenConditionModel1");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1In(List<String> values) {
            addCriterion("screen_condition_model_1 in", values, "screenConditionModel1");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1NotIn(List<String> values) {
            addCriterion("screen_condition_model_1 not in", values, "screenConditionModel1");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1Between(String value1, String value2) {
            addCriterion("screen_condition_model_1 between", value1, value2, "screenConditionModel1");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel1NotBetween(String value1, String value2) {
            addCriterion("screen_condition_model_1 not between", value1, value2, "screenConditionModel1");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2IsNull() {
            addCriterion("screen_condition_model_2 is null");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2IsNotNull() {
            addCriterion("screen_condition_model_2 is not null");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2EqualTo(String value) {
            addCriterion("screen_condition_model_2 =", value, "screenConditionModel2");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2NotEqualTo(String value) {
            addCriterion("screen_condition_model_2 <>", value, "screenConditionModel2");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2GreaterThan(String value) {
            addCriterion("screen_condition_model_2 >", value, "screenConditionModel2");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2GreaterThanOrEqualTo(String value) {
            addCriterion("screen_condition_model_2 >=", value, "screenConditionModel2");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2LessThan(String value) {
            addCriterion("screen_condition_model_2 <", value, "screenConditionModel2");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2LessThanOrEqualTo(String value) {
            addCriterion("screen_condition_model_2 <=", value, "screenConditionModel2");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2Like(String value) {
            addCriterion("screen_condition_model_2 like", value, "screenConditionModel2");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2NotLike(String value) {
            addCriterion("screen_condition_model_2 not like", value, "screenConditionModel2");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2In(List<String> values) {
            addCriterion("screen_condition_model_2 in", values, "screenConditionModel2");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2NotIn(List<String> values) {
            addCriterion("screen_condition_model_2 not in", values, "screenConditionModel2");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2Between(String value1, String value2) {
            addCriterion("screen_condition_model_2 between", value1, value2, "screenConditionModel2");
            return (Criteria) this;
        }

        public Criteria andScreenConditionModel2NotBetween(String value1, String value2) {
            addCriterion("screen_condition_model_2 not between", value1, value2, "screenConditionModel2");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeIsNull() {
            addCriterion("condition_options_type is null");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeIsNotNull() {
            addCriterion("condition_options_type is not null");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeEqualTo(String value) {
            addCriterion("condition_options_type =", value, "conditionOptionsType");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeNotEqualTo(String value) {
            addCriterion("condition_options_type <>", value, "conditionOptionsType");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeGreaterThan(String value) {
            addCriterion("condition_options_type >", value, "conditionOptionsType");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("condition_options_type >=", value, "conditionOptionsType");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeLessThan(String value) {
            addCriterion("condition_options_type <", value, "conditionOptionsType");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeLessThanOrEqualTo(String value) {
            addCriterion("condition_options_type <=", value, "conditionOptionsType");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeLike(String value) {
            addCriterion("condition_options_type like", value, "conditionOptionsType");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeNotLike(String value) {
            addCriterion("condition_options_type not like", value, "conditionOptionsType");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeIn(List<String> values) {
            addCriterion("condition_options_type in", values, "conditionOptionsType");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeNotIn(List<String> values) {
            addCriterion("condition_options_type not in", values, "conditionOptionsType");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeBetween(String value1, String value2) {
            addCriterion("condition_options_type between", value1, value2, "conditionOptionsType");
            return (Criteria) this;
        }

        public Criteria andConditionOptionsTypeNotBetween(String value1, String value2) {
            addCriterion("condition_options_type not between", value1, value2, "conditionOptionsType");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueIsNull() {
            addCriterion("min_options_value is null");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueIsNotNull() {
            addCriterion("min_options_value is not null");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueEqualTo(String value) {
            addCriterion("min_options_value =", value, "minOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueNotEqualTo(String value) {
            addCriterion("min_options_value <>", value, "minOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueGreaterThan(String value) {
            addCriterion("min_options_value >", value, "minOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueGreaterThanOrEqualTo(String value) {
            addCriterion("min_options_value >=", value, "minOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueLessThan(String value) {
            addCriterion("min_options_value <", value, "minOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueLessThanOrEqualTo(String value) {
            addCriterion("min_options_value <=", value, "minOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueLike(String value) {
            addCriterion("min_options_value like", value, "minOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueNotLike(String value) {
            addCriterion("min_options_value not like", value, "minOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueIn(List<String> values) {
            addCriterion("min_options_value in", values, "minOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueNotIn(List<String> values) {
            addCriterion("min_options_value not in", values, "minOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueBetween(String value1, String value2) {
            addCriterion("min_options_value between", value1, value2, "minOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMinOptionsValueNotBetween(String value1, String value2) {
            addCriterion("min_options_value not between", value1, value2, "minOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueIsNull() {
            addCriterion("max_options_value is null");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueIsNotNull() {
            addCriterion("max_options_value is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueEqualTo(String value) {
            addCriterion("max_options_value =", value, "maxOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueNotEqualTo(String value) {
            addCriterion("max_options_value <>", value, "maxOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueGreaterThan(String value) {
            addCriterion("max_options_value >", value, "maxOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueGreaterThanOrEqualTo(String value) {
            addCriterion("max_options_value >=", value, "maxOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueLessThan(String value) {
            addCriterion("max_options_value <", value, "maxOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueLessThanOrEqualTo(String value) {
            addCriterion("max_options_value <=", value, "maxOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueLike(String value) {
            addCriterion("max_options_value like", value, "maxOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueNotLike(String value) {
            addCriterion("max_options_value not like", value, "maxOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueIn(List<String> values) {
            addCriterion("max_options_value in", values, "maxOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueNotIn(List<String> values) {
            addCriterion("max_options_value not in", values, "maxOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueBetween(String value1, String value2) {
            addCriterion("max_options_value between", value1, value2, "maxOptionsValue");
            return (Criteria) this;
        }

        public Criteria andMaxOptionsValueNotBetween(String value1, String value2) {
            addCriterion("max_options_value not between", value1, value2, "maxOptionsValue");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeIsNull() {
            addCriterion("screen_variable_type is null");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeIsNotNull() {
            addCriterion("screen_variable_type is not null");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeEqualTo(String value) {
            addCriterion("screen_variable_type =", value, "screenVariableType");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeNotEqualTo(String value) {
            addCriterion("screen_variable_type <>", value, "screenVariableType");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeGreaterThan(String value) {
            addCriterion("screen_variable_type >", value, "screenVariableType");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeGreaterThanOrEqualTo(String value) {
            addCriterion("screen_variable_type >=", value, "screenVariableType");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeLessThan(String value) {
            addCriterion("screen_variable_type <", value, "screenVariableType");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeLessThanOrEqualTo(String value) {
            addCriterion("screen_variable_type <=", value, "screenVariableType");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeLike(String value) {
            addCriterion("screen_variable_type like", value, "screenVariableType");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeNotLike(String value) {
            addCriterion("screen_variable_type not like", value, "screenVariableType");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeIn(List<String> values) {
            addCriterion("screen_variable_type in", values, "screenVariableType");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeNotIn(List<String> values) {
            addCriterion("screen_variable_type not in", values, "screenVariableType");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeBetween(String value1, String value2) {
            addCriterion("screen_variable_type between", value1, value2, "screenVariableType");
            return (Criteria) this;
        }

        public Criteria andScreenVariableTypeNotBetween(String value1, String value2) {
            addCriterion("screen_variable_type not between", value1, value2, "screenVariableType");
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