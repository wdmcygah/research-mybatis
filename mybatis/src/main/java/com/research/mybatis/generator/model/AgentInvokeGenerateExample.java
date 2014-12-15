package com.research.mybatis.generator.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgentInvokeGenerateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgentInvokeGenerateExample() {
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(String value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(String value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(String value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(String value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLike(String value) {
            addCriterion("ID like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotLike(String value) {
            addCriterion("ID not like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<String> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<String> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andDbFlagIsNull() {
            addCriterion("DB_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDbFlagIsNotNull() {
            addCriterion("DB_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDbFlagEqualTo(String value) {
            addCriterion("DB_FLAG =", value, "dbFlag");
            return (Criteria) this;
        }

        public Criteria andDbFlagNotEqualTo(String value) {
            addCriterion("DB_FLAG <>", value, "dbFlag");
            return (Criteria) this;
        }

        public Criteria andDbFlagGreaterThan(String value) {
            addCriterion("DB_FLAG >", value, "dbFlag");
            return (Criteria) this;
        }

        public Criteria andDbFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DB_FLAG >=", value, "dbFlag");
            return (Criteria) this;
        }

        public Criteria andDbFlagLessThan(String value) {
            addCriterion("DB_FLAG <", value, "dbFlag");
            return (Criteria) this;
        }

        public Criteria andDbFlagLessThanOrEqualTo(String value) {
            addCriterion("DB_FLAG <=", value, "dbFlag");
            return (Criteria) this;
        }

        public Criteria andDbFlagLike(String value) {
            addCriterion("DB_FLAG like", value, "dbFlag");
            return (Criteria) this;
        }

        public Criteria andDbFlagNotLike(String value) {
            addCriterion("DB_FLAG not like", value, "dbFlag");
            return (Criteria) this;
        }

        public Criteria andDbFlagIn(List<String> values) {
            addCriterion("DB_FLAG in", values, "dbFlag");
            return (Criteria) this;
        }

        public Criteria andDbFlagNotIn(List<String> values) {
            addCriterion("DB_FLAG not in", values, "dbFlag");
            return (Criteria) this;
        }

        public Criteria andDbFlagBetween(String value1, String value2) {
            addCriterion("DB_FLAG between", value1, value2, "dbFlag");
            return (Criteria) this;
        }

        public Criteria andDbFlagNotBetween(String value1, String value2) {
            addCriterion("DB_FLAG not between", value1, value2, "dbFlag");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSTATUSEqualTo(String value) {
            addCriterion("STATUS =", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThan(String value) {
            addCriterion("STATUS >", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThan(String value) {
            addCriterion("STATUS <", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLike(String value) {
            addCriterion("STATUS like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotLike(String value) {
            addCriterion("STATUS not like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSIn(List<String> values) {
            addCriterion("STATUS in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andScopeLevelIsNull() {
            addCriterion("SCOPE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andScopeLevelIsNotNull() {
            addCriterion("SCOPE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andScopeLevelEqualTo(String value) {
            addCriterion("SCOPE_LEVEL =", value, "scopeLevel");
            return (Criteria) this;
        }

        public Criteria andScopeLevelNotEqualTo(String value) {
            addCriterion("SCOPE_LEVEL <>", value, "scopeLevel");
            return (Criteria) this;
        }

        public Criteria andScopeLevelGreaterThan(String value) {
            addCriterion("SCOPE_LEVEL >", value, "scopeLevel");
            return (Criteria) this;
        }

        public Criteria andScopeLevelGreaterThanOrEqualTo(String value) {
            addCriterion("SCOPE_LEVEL >=", value, "scopeLevel");
            return (Criteria) this;
        }

        public Criteria andScopeLevelLessThan(String value) {
            addCriterion("SCOPE_LEVEL <", value, "scopeLevel");
            return (Criteria) this;
        }

        public Criteria andScopeLevelLessThanOrEqualTo(String value) {
            addCriterion("SCOPE_LEVEL <=", value, "scopeLevel");
            return (Criteria) this;
        }

        public Criteria andScopeLevelLike(String value) {
            addCriterion("SCOPE_LEVEL like", value, "scopeLevel");
            return (Criteria) this;
        }

        public Criteria andScopeLevelNotLike(String value) {
            addCriterion("SCOPE_LEVEL not like", value, "scopeLevel");
            return (Criteria) this;
        }

        public Criteria andScopeLevelIn(List<String> values) {
            addCriterion("SCOPE_LEVEL in", values, "scopeLevel");
            return (Criteria) this;
        }

        public Criteria andScopeLevelNotIn(List<String> values) {
            addCriterion("SCOPE_LEVEL not in", values, "scopeLevel");
            return (Criteria) this;
        }

        public Criteria andScopeLevelBetween(String value1, String value2) {
            addCriterion("SCOPE_LEVEL between", value1, value2, "scopeLevel");
            return (Criteria) this;
        }

        public Criteria andScopeLevelNotBetween(String value1, String value2) {
            addCriterion("SCOPE_LEVEL not between", value1, value2, "scopeLevel");
            return (Criteria) this;
        }

        public Criteria andJOB_IDIsNull() {
            addCriterion("JOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andJOB_IDIsNotNull() {
            addCriterion("JOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJOB_IDEqualTo(String value) {
            addCriterion("JOB_ID =", value, "JOB_ID");
            return (Criteria) this;
        }

        public Criteria andJOB_IDNotEqualTo(String value) {
            addCriterion("JOB_ID <>", value, "JOB_ID");
            return (Criteria) this;
        }

        public Criteria andJOB_IDGreaterThan(String value) {
            addCriterion("JOB_ID >", value, "JOB_ID");
            return (Criteria) this;
        }

        public Criteria andJOB_IDGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_ID >=", value, "JOB_ID");
            return (Criteria) this;
        }

        public Criteria andJOB_IDLessThan(String value) {
            addCriterion("JOB_ID <", value, "JOB_ID");
            return (Criteria) this;
        }

        public Criteria andJOB_IDLessThanOrEqualTo(String value) {
            addCriterion("JOB_ID <=", value, "JOB_ID");
            return (Criteria) this;
        }

        public Criteria andJOB_IDLike(String value) {
            addCriterion("JOB_ID like", value, "JOB_ID");
            return (Criteria) this;
        }

        public Criteria andJOB_IDNotLike(String value) {
            addCriterion("JOB_ID not like", value, "JOB_ID");
            return (Criteria) this;
        }

        public Criteria andJOB_IDIn(List<String> values) {
            addCriterion("JOB_ID in", values, "JOB_ID");
            return (Criteria) this;
        }

        public Criteria andJOB_IDNotIn(List<String> values) {
            addCriterion("JOB_ID not in", values, "JOB_ID");
            return (Criteria) this;
        }

        public Criteria andJOB_IDBetween(String value1, String value2) {
            addCriterion("JOB_ID between", value1, value2, "JOB_ID");
            return (Criteria) this;
        }

        public Criteria andJOB_IDNotBetween(String value1, String value2) {
            addCriterion("JOB_ID not between", value1, value2, "JOB_ID");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMENotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMELessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMELessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMENotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMENotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "UPDATE_TIME");
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