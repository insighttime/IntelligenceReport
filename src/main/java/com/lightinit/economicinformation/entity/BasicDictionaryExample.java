package com.lightinit.economicinformation.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasicDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasicDictionaryExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVoteTypeIsNull() {
            addCriterion("vote_type is null");
            return (Criteria) this;
        }

        public Criteria andVoteTypeIsNotNull() {
            addCriterion("vote_type is not null");
            return (Criteria) this;
        }

        public Criteria andVoteTypeEqualTo(Integer value) {
            addCriterion("vote_type =", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeNotEqualTo(Integer value) {
            addCriterion("vote_type <>", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeGreaterThan(Integer value) {
            addCriterion("vote_type >", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_type >=", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeLessThan(Integer value) {
            addCriterion("vote_type <", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeLessThanOrEqualTo(Integer value) {
            addCriterion("vote_type <=", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeIn(List<Integer> values) {
            addCriterion("vote_type in", values, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeNotIn(List<Integer> values) {
            addCriterion("vote_type not in", values, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeBetween(Integer value1, Integer value2) {
            addCriterion("vote_type between", value1, value2, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_type not between", value1, value2, "voteType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIsNull() {
            addCriterion("target_type is null");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIsNotNull() {
            addCriterion("target_type is not null");
            return (Criteria) this;
        }

        public Criteria andTargetTypeEqualTo(Integer value) {
            addCriterion("target_type =", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotEqualTo(Integer value) {
            addCriterion("target_type <>", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeGreaterThan(Integer value) {
            addCriterion("target_type >", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_type >=", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLessThan(Integer value) {
            addCriterion("target_type <", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("target_type <=", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIn(List<Integer> values) {
            addCriterion("target_type in", values, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotIn(List<Integer> values) {
            addCriterion("target_type not in", values, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeBetween(Integer value1, Integer value2) {
            addCriterion("target_type between", value1, value2, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("target_type not between", value1, value2, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNull() {
            addCriterion("target_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNotNull() {
            addCriterion("target_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIdEqualTo(Integer value) {
            addCriterion("target_id =", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotEqualTo(Integer value) {
            addCriterion("target_id <>", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThan(Integer value) {
            addCriterion("target_id >", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_id >=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThan(Integer value) {
            addCriterion("target_id <", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThanOrEqualTo(Integer value) {
            addCriterion("target_id <=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdIn(List<Integer> values) {
            addCriterion("target_id in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotIn(List<Integer> values) {
            addCriterion("target_id not in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdBetween(Integer value1, Integer value2) {
            addCriterion("target_id between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("target_id not between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsIsNull() {
            addCriterion("opinions_and_suggestions is null");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsIsNotNull() {
            addCriterion("opinions_and_suggestions is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsEqualTo(String value) {
            addCriterion("opinions_and_suggestions =", value, "opinionsAndSuggestions");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsNotEqualTo(String value) {
            addCriterion("opinions_and_suggestions <>", value, "opinionsAndSuggestions");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsGreaterThan(String value) {
            addCriterion("opinions_and_suggestions >", value, "opinionsAndSuggestions");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsGreaterThanOrEqualTo(String value) {
            addCriterion("opinions_and_suggestions >=", value, "opinionsAndSuggestions");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsLessThan(String value) {
            addCriterion("opinions_and_suggestions <", value, "opinionsAndSuggestions");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsLessThanOrEqualTo(String value) {
            addCriterion("opinions_and_suggestions <=", value, "opinionsAndSuggestions");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsLike(String value) {
            addCriterion("opinions_and_suggestions like", value, "opinionsAndSuggestions");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsNotLike(String value) {
            addCriterion("opinions_and_suggestions not like", value, "opinionsAndSuggestions");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsIn(List<String> values) {
            addCriterion("opinions_and_suggestions in", values, "opinionsAndSuggestions");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsNotIn(List<String> values) {
            addCriterion("opinions_and_suggestions not in", values, "opinionsAndSuggestions");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsBetween(String value1, String value2) {
            addCriterion("opinions_and_suggestions between", value1, value2, "opinionsAndSuggestions");
            return (Criteria) this;
        }

        public Criteria andOpinionsAndSuggestionsNotBetween(String value1, String value2) {
            addCriterion("opinions_and_suggestions not between", value1, value2, "opinionsAndSuggestions");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIsNull() {
            addCriterion("deleted_at is null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIsNotNull() {
            addCriterion("deleted_at is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtEqualTo(Date value) {
            addCriterion("deleted_at =", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotEqualTo(Date value) {
            addCriterion("deleted_at <>", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThan(Date value) {
            addCriterion("deleted_at >", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("deleted_at >=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThan(Date value) {
            addCriterion("deleted_at <", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThanOrEqualTo(Date value) {
            addCriterion("deleted_at <=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIn(List<Date> values) {
            addCriterion("deleted_at in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotIn(List<Date> values) {
            addCriterion("deleted_at not in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtBetween(Date value1, Date value2) {
            addCriterion("deleted_at between", value1, value2, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotBetween(Date value1, Date value2) {
            addCriterion("deleted_at not between", value1, value2, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedByIsNull() {
            addCriterion("deleted_by is null");
            return (Criteria) this;
        }

        public Criteria andDeletedByIsNotNull() {
            addCriterion("deleted_by is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedByEqualTo(String value) {
            addCriterion("deleted_by =", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByNotEqualTo(String value) {
            addCriterion("deleted_by <>", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByGreaterThan(String value) {
            addCriterion("deleted_by >", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByGreaterThanOrEqualTo(String value) {
            addCriterion("deleted_by >=", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByLessThan(String value) {
            addCriterion("deleted_by <", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByLessThanOrEqualTo(String value) {
            addCriterion("deleted_by <=", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByLike(String value) {
            addCriterion("deleted_by like", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByNotLike(String value) {
            addCriterion("deleted_by not like", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByIn(List<String> values) {
            addCriterion("deleted_by in", values, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByNotIn(List<String> values) {
            addCriterion("deleted_by not in", values, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByBetween(String value1, String value2) {
            addCriterion("deleted_by between", value1, value2, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByNotBetween(String value1, String value2) {
            addCriterion("deleted_by not between", value1, value2, "deletedBy");
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