package com.oracle.labor.po;

import java.util.ArrayList;
import java.util.List;

public class ZjDwdjjdbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZjDwdjjdbExample() {
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

        public Criteria andDwdjjdbhIsNull() {
            addCriterion("DWDJJDBH is null");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhIsNotNull() {
            addCriterion("DWDJJDBH is not null");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhEqualTo(String value) {
            addCriterion("DWDJJDBH =", value, "dwdjjdbh");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhNotEqualTo(String value) {
            addCriterion("DWDJJDBH <>", value, "dwdjjdbh");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhGreaterThan(String value) {
            addCriterion("DWDJJDBH >", value, "dwdjjdbh");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhGreaterThanOrEqualTo(String value) {
            addCriterion("DWDJJDBH >=", value, "dwdjjdbh");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhLessThan(String value) {
            addCriterion("DWDJJDBH <", value, "dwdjjdbh");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhLessThanOrEqualTo(String value) {
            addCriterion("DWDJJDBH <=", value, "dwdjjdbh");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhLike(String value) {
            addCriterion("DWDJJDBH like", value, "dwdjjdbh");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhNotLike(String value) {
            addCriterion("DWDJJDBH not like", value, "dwdjjdbh");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhIn(List<String> values) {
            addCriterion("DWDJJDBH in", values, "dwdjjdbh");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhNotIn(List<String> values) {
            addCriterion("DWDJJDBH not in", values, "dwdjjdbh");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhBetween(String value1, String value2) {
            addCriterion("DWDJJDBH between", value1, value2, "dwdjjdbh");
            return (Criteria) this;
        }

        public Criteria andDwdjjdbhNotBetween(String value1, String value2) {
            addCriterion("DWDJJDBH not between", value1, value2, "dwdjjdbh");
            return (Criteria) this;
        }

        public Criteria andZpbhIsNull() {
            addCriterion("ZPBH is null");
            return (Criteria) this;
        }

        public Criteria andZpbhIsNotNull() {
            addCriterion("ZPBH is not null");
            return (Criteria) this;
        }

        public Criteria andZpbhEqualTo(String value) {
            addCriterion("ZPBH =", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhNotEqualTo(String value) {
            addCriterion("ZPBH <>", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhGreaterThan(String value) {
            addCriterion("ZPBH >", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhGreaterThanOrEqualTo(String value) {
            addCriterion("ZPBH >=", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhLessThan(String value) {
            addCriterion("ZPBH <", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhLessThanOrEqualTo(String value) {
            addCriterion("ZPBH <=", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhLike(String value) {
            addCriterion("ZPBH like", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhNotLike(String value) {
            addCriterion("ZPBH not like", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhIn(List<String> values) {
            addCriterion("ZPBH in", values, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhNotIn(List<String> values) {
            addCriterion("ZPBH not in", values, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhBetween(String value1, String value2) {
            addCriterion("ZPBH between", value1, value2, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhNotBetween(String value1, String value2) {
            addCriterion("ZPBH not between", value1, value2, "zpbh");
            return (Criteria) this;
        }

        public Criteria andDjyyIsNull() {
            addCriterion("DJYY is null");
            return (Criteria) this;
        }

        public Criteria andDjyyIsNotNull() {
            addCriterion("DJYY is not null");
            return (Criteria) this;
        }

        public Criteria andDjyyEqualTo(String value) {
            addCriterion("DJYY =", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotEqualTo(String value) {
            addCriterion("DJYY <>", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyGreaterThan(String value) {
            addCriterion("DJYY >", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyGreaterThanOrEqualTo(String value) {
            addCriterion("DJYY >=", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyLessThan(String value) {
            addCriterion("DJYY <", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyLessThanOrEqualTo(String value) {
            addCriterion("DJYY <=", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyLike(String value) {
            addCriterion("DJYY like", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotLike(String value) {
            addCriterion("DJYY not like", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyIn(List<String> values) {
            addCriterion("DJYY in", values, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotIn(List<String> values) {
            addCriterion("DJYY not in", values, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyBetween(String value1, String value2) {
            addCriterion("DJYY between", value1, value2, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotBetween(String value1, String value2) {
            addCriterion("DJYY not between", value1, value2, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNull() {
            addCriterion("DJSJ is null");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNotNull() {
            addCriterion("DJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andDjsjEqualTo(String value) {
            addCriterion("DJSJ =", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotEqualTo(String value) {
            addCriterion("DJSJ <>", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThan(String value) {
            addCriterion("DJSJ >", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThanOrEqualTo(String value) {
            addCriterion("DJSJ >=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThan(String value) {
            addCriterion("DJSJ <", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThanOrEqualTo(String value) {
            addCriterion("DJSJ <=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLike(String value) {
            addCriterion("DJSJ like", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotLike(String value) {
            addCriterion("DJSJ not like", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjIn(List<String> values) {
            addCriterion("DJSJ in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotIn(List<String> values) {
            addCriterion("DJSJ not in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjBetween(String value1, String value2) {
            addCriterion("DJSJ between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotBetween(String value1, String value2) {
            addCriterion("DJSJ not between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andJdyyIsNull() {
            addCriterion("JDYY is null");
            return (Criteria) this;
        }

        public Criteria andJdyyIsNotNull() {
            addCriterion("JDYY is not null");
            return (Criteria) this;
        }

        public Criteria andJdyyEqualTo(String value) {
            addCriterion("JDYY =", value, "jdyy");
            return (Criteria) this;
        }

        public Criteria andJdyyNotEqualTo(String value) {
            addCriterion("JDYY <>", value, "jdyy");
            return (Criteria) this;
        }

        public Criteria andJdyyGreaterThan(String value) {
            addCriterion("JDYY >", value, "jdyy");
            return (Criteria) this;
        }

        public Criteria andJdyyGreaterThanOrEqualTo(String value) {
            addCriterion("JDYY >=", value, "jdyy");
            return (Criteria) this;
        }

        public Criteria andJdyyLessThan(String value) {
            addCriterion("JDYY <", value, "jdyy");
            return (Criteria) this;
        }

        public Criteria andJdyyLessThanOrEqualTo(String value) {
            addCriterion("JDYY <=", value, "jdyy");
            return (Criteria) this;
        }

        public Criteria andJdyyLike(String value) {
            addCriterion("JDYY like", value, "jdyy");
            return (Criteria) this;
        }

        public Criteria andJdyyNotLike(String value) {
            addCriterion("JDYY not like", value, "jdyy");
            return (Criteria) this;
        }

        public Criteria andJdyyIn(List<String> values) {
            addCriterion("JDYY in", values, "jdyy");
            return (Criteria) this;
        }

        public Criteria andJdyyNotIn(List<String> values) {
            addCriterion("JDYY not in", values, "jdyy");
            return (Criteria) this;
        }

        public Criteria andJdyyBetween(String value1, String value2) {
            addCriterion("JDYY between", value1, value2, "jdyy");
            return (Criteria) this;
        }

        public Criteria andJdyyNotBetween(String value1, String value2) {
            addCriterion("JDYY not between", value1, value2, "jdyy");
            return (Criteria) this;
        }

        public Criteria andJdsjIsNull() {
            addCriterion("JDSJ is null");
            return (Criteria) this;
        }

        public Criteria andJdsjIsNotNull() {
            addCriterion("JDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJdsjEqualTo(String value) {
            addCriterion("JDSJ =", value, "jdsj");
            return (Criteria) this;
        }

        public Criteria andJdsjNotEqualTo(String value) {
            addCriterion("JDSJ <>", value, "jdsj");
            return (Criteria) this;
        }

        public Criteria andJdsjGreaterThan(String value) {
            addCriterion("JDSJ >", value, "jdsj");
            return (Criteria) this;
        }

        public Criteria andJdsjGreaterThanOrEqualTo(String value) {
            addCriterion("JDSJ >=", value, "jdsj");
            return (Criteria) this;
        }

        public Criteria andJdsjLessThan(String value) {
            addCriterion("JDSJ <", value, "jdsj");
            return (Criteria) this;
        }

        public Criteria andJdsjLessThanOrEqualTo(String value) {
            addCriterion("JDSJ <=", value, "jdsj");
            return (Criteria) this;
        }

        public Criteria andJdsjLike(String value) {
            addCriterion("JDSJ like", value, "jdsj");
            return (Criteria) this;
        }

        public Criteria andJdsjNotLike(String value) {
            addCriterion("JDSJ not like", value, "jdsj");
            return (Criteria) this;
        }

        public Criteria andJdsjIn(List<String> values) {
            addCriterion("JDSJ in", values, "jdsj");
            return (Criteria) this;
        }

        public Criteria andJdsjNotIn(List<String> values) {
            addCriterion("JDSJ not in", values, "jdsj");
            return (Criteria) this;
        }

        public Criteria andJdsjBetween(String value1, String value2) {
            addCriterion("JDSJ between", value1, value2, "jdsj");
            return (Criteria) this;
        }

        public Criteria andJdsjNotBetween(String value1, String value2) {
            addCriterion("JDSJ not between", value1, value2, "jdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjIsNull() {
            addCriterion("GDSJ is null");
            return (Criteria) this;
        }

        public Criteria andGdsjIsNotNull() {
            addCriterion("GDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andGdsjEqualTo(String value) {
            addCriterion("GDSJ =", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjNotEqualTo(String value) {
            addCriterion("GDSJ <>", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjGreaterThan(String value) {
            addCriterion("GDSJ >", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjGreaterThanOrEqualTo(String value) {
            addCriterion("GDSJ >=", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjLessThan(String value) {
            addCriterion("GDSJ <", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjLessThanOrEqualTo(String value) {
            addCriterion("GDSJ <=", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjLike(String value) {
            addCriterion("GDSJ like", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjNotLike(String value) {
            addCriterion("GDSJ not like", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjIn(List<String> values) {
            addCriterion("GDSJ in", values, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjNotIn(List<String> values) {
            addCriterion("GDSJ not in", values, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjBetween(String value1, String value2) {
            addCriterion("GDSJ between", value1, value2, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjNotBetween(String value1, String value2) {
            addCriterion("GDSJ not between", value1, value2, "gdsj");
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