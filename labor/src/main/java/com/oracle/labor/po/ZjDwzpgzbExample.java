package com.oracle.labor.po;

import java.util.ArrayList;
import java.util.List;

public class ZjDwzpgzbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZjDwzpgzbExample() {
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

        public Criteria andZpgzbhIsNull() {
            addCriterion("ZPGZBH is null");
            return (Criteria) this;
        }

        public Criteria andZpgzbhIsNotNull() {
            addCriterion("ZPGZBH is not null");
            return (Criteria) this;
        }

        public Criteria andZpgzbhEqualTo(String value) {
            addCriterion("ZPGZBH =", value, "zpgzbh");
            return (Criteria) this;
        }

        public Criteria andZpgzbhNotEqualTo(String value) {
            addCriterion("ZPGZBH <>", value, "zpgzbh");
            return (Criteria) this;
        }

        public Criteria andZpgzbhGreaterThan(String value) {
            addCriterion("ZPGZBH >", value, "zpgzbh");
            return (Criteria) this;
        }

        public Criteria andZpgzbhGreaterThanOrEqualTo(String value) {
            addCriterion("ZPGZBH >=", value, "zpgzbh");
            return (Criteria) this;
        }

        public Criteria andZpgzbhLessThan(String value) {
            addCriterion("ZPGZBH <", value, "zpgzbh");
            return (Criteria) this;
        }

        public Criteria andZpgzbhLessThanOrEqualTo(String value) {
            addCriterion("ZPGZBH <=", value, "zpgzbh");
            return (Criteria) this;
        }

        public Criteria andZpgzbhLike(String value) {
            addCriterion("ZPGZBH like", value, "zpgzbh");
            return (Criteria) this;
        }

        public Criteria andZpgzbhNotLike(String value) {
            addCriterion("ZPGZBH not like", value, "zpgzbh");
            return (Criteria) this;
        }

        public Criteria andZpgzbhIn(List<String> values) {
            addCriterion("ZPGZBH in", values, "zpgzbh");
            return (Criteria) this;
        }

        public Criteria andZpgzbhNotIn(List<String> values) {
            addCriterion("ZPGZBH not in", values, "zpgzbh");
            return (Criteria) this;
        }

        public Criteria andZpgzbhBetween(String value1, String value2) {
            addCriterion("ZPGZBH between", value1, value2, "zpgzbh");
            return (Criteria) this;
        }

        public Criteria andZpgzbhNotBetween(String value1, String value2) {
            addCriterion("ZPGZBH not between", value1, value2, "zpgzbh");
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

        public Criteria andZpgzIsNull() {
            addCriterion("ZPGZ is null");
            return (Criteria) this;
        }

        public Criteria andZpgzIsNotNull() {
            addCriterion("ZPGZ is not null");
            return (Criteria) this;
        }

        public Criteria andZpgzEqualTo(String value) {
            addCriterion("ZPGZ =", value, "zpgz");
            return (Criteria) this;
        }

        public Criteria andZpgzNotEqualTo(String value) {
            addCriterion("ZPGZ <>", value, "zpgz");
            return (Criteria) this;
        }

        public Criteria andZpgzGreaterThan(String value) {
            addCriterion("ZPGZ >", value, "zpgz");
            return (Criteria) this;
        }

        public Criteria andZpgzGreaterThanOrEqualTo(String value) {
            addCriterion("ZPGZ >=", value, "zpgz");
            return (Criteria) this;
        }

        public Criteria andZpgzLessThan(String value) {
            addCriterion("ZPGZ <", value, "zpgz");
            return (Criteria) this;
        }

        public Criteria andZpgzLessThanOrEqualTo(String value) {
            addCriterion("ZPGZ <=", value, "zpgz");
            return (Criteria) this;
        }

        public Criteria andZpgzLike(String value) {
            addCriterion("ZPGZ like", value, "zpgz");
            return (Criteria) this;
        }

        public Criteria andZpgzNotLike(String value) {
            addCriterion("ZPGZ not like", value, "zpgz");
            return (Criteria) this;
        }

        public Criteria andZpgzIn(List<String> values) {
            addCriterion("ZPGZ in", values, "zpgz");
            return (Criteria) this;
        }

        public Criteria andZpgzNotIn(List<String> values) {
            addCriterion("ZPGZ not in", values, "zpgz");
            return (Criteria) this;
        }

        public Criteria andZpgzBetween(String value1, String value2) {
            addCriterion("ZPGZ between", value1, value2, "zpgz");
            return (Criteria) this;
        }

        public Criteria andZpgzNotBetween(String value1, String value2) {
            addCriterion("ZPGZ not between", value1, value2, "zpgz");
            return (Criteria) this;
        }

        public Criteria andZpgzbmIsNull() {
            addCriterion("ZPGZBM is null");
            return (Criteria) this;
        }

        public Criteria andZpgzbmIsNotNull() {
            addCriterion("ZPGZBM is not null");
            return (Criteria) this;
        }

        public Criteria andZpgzbmEqualTo(String value) {
            addCriterion("ZPGZBM =", value, "zpgzbm");
            return (Criteria) this;
        }

        public Criteria andZpgzbmNotEqualTo(String value) {
            addCriterion("ZPGZBM <>", value, "zpgzbm");
            return (Criteria) this;
        }

        public Criteria andZpgzbmGreaterThan(String value) {
            addCriterion("ZPGZBM >", value, "zpgzbm");
            return (Criteria) this;
        }

        public Criteria andZpgzbmGreaterThanOrEqualTo(String value) {
            addCriterion("ZPGZBM >=", value, "zpgzbm");
            return (Criteria) this;
        }

        public Criteria andZpgzbmLessThan(String value) {
            addCriterion("ZPGZBM <", value, "zpgzbm");
            return (Criteria) this;
        }

        public Criteria andZpgzbmLessThanOrEqualTo(String value) {
            addCriterion("ZPGZBM <=", value, "zpgzbm");
            return (Criteria) this;
        }

        public Criteria andZpgzbmLike(String value) {
            addCriterion("ZPGZBM like", value, "zpgzbm");
            return (Criteria) this;
        }

        public Criteria andZpgzbmNotLike(String value) {
            addCriterion("ZPGZBM not like", value, "zpgzbm");
            return (Criteria) this;
        }

        public Criteria andZpgzbmIn(List<String> values) {
            addCriterion("ZPGZBM in", values, "zpgzbm");
            return (Criteria) this;
        }

        public Criteria andZpgzbmNotIn(List<String> values) {
            addCriterion("ZPGZBM not in", values, "zpgzbm");
            return (Criteria) this;
        }

        public Criteria andZpgzbmBetween(String value1, String value2) {
            addCriterion("ZPGZBM between", value1, value2, "zpgzbm");
            return (Criteria) this;
        }

        public Criteria andZpgzbmNotBetween(String value1, String value2) {
            addCriterion("ZPGZBM not between", value1, value2, "zpgzbm");
            return (Criteria) this;
        }

        public Criteria andGwlbIsNull() {
            addCriterion("GWLB is null");
            return (Criteria) this;
        }

        public Criteria andGwlbIsNotNull() {
            addCriterion("GWLB is not null");
            return (Criteria) this;
        }

        public Criteria andGwlbEqualTo(String value) {
            addCriterion("GWLB =", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbNotEqualTo(String value) {
            addCriterion("GWLB <>", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbGreaterThan(String value) {
            addCriterion("GWLB >", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbGreaterThanOrEqualTo(String value) {
            addCriterion("GWLB >=", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbLessThan(String value) {
            addCriterion("GWLB <", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbLessThanOrEqualTo(String value) {
            addCriterion("GWLB <=", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbLike(String value) {
            addCriterion("GWLB like", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbNotLike(String value) {
            addCriterion("GWLB not like", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbIn(List<String> values) {
            addCriterion("GWLB in", values, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbNotIn(List<String> values) {
            addCriterion("GWLB not in", values, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbBetween(String value1, String value2) {
            addCriterion("GWLB between", value1, value2, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbNotBetween(String value1, String value2) {
            addCriterion("GWLB not between", value1, value2, "gwlb");
            return (Criteria) this;
        }

        public Criteria andZrsIsNull() {
            addCriterion("ZRS is null");
            return (Criteria) this;
        }

        public Criteria andZrsIsNotNull() {
            addCriterion("ZRS is not null");
            return (Criteria) this;
        }

        public Criteria andZrsEqualTo(String value) {
            addCriterion("ZRS =", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsNotEqualTo(String value) {
            addCriterion("ZRS <>", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsGreaterThan(String value) {
            addCriterion("ZRS >", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsGreaterThanOrEqualTo(String value) {
            addCriterion("ZRS >=", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsLessThan(String value) {
            addCriterion("ZRS <", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsLessThanOrEqualTo(String value) {
            addCriterion("ZRS <=", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsLike(String value) {
            addCriterion("ZRS like", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsNotLike(String value) {
            addCriterion("ZRS not like", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsIn(List<String> values) {
            addCriterion("ZRS in", values, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsNotIn(List<String> values) {
            addCriterion("ZRS not in", values, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsBetween(String value1, String value2) {
            addCriterion("ZRS between", value1, value2, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsNotBetween(String value1, String value2) {
            addCriterion("ZRS not between", value1, value2, "zrs");
            return (Criteria) this;
        }

        public Criteria andZprsnIsNull() {
            addCriterion("ZPRSN is null");
            return (Criteria) this;
        }

        public Criteria andZprsnIsNotNull() {
            addCriterion("ZPRSN is not null");
            return (Criteria) this;
        }

        public Criteria andZprsnEqualTo(String value) {
            addCriterion("ZPRSN =", value, "zprsn");
            return (Criteria) this;
        }

        public Criteria andZprsnNotEqualTo(String value) {
            addCriterion("ZPRSN <>", value, "zprsn");
            return (Criteria) this;
        }

        public Criteria andZprsnGreaterThan(String value) {
            addCriterion("ZPRSN >", value, "zprsn");
            return (Criteria) this;
        }

        public Criteria andZprsnGreaterThanOrEqualTo(String value) {
            addCriterion("ZPRSN >=", value, "zprsn");
            return (Criteria) this;
        }

        public Criteria andZprsnLessThan(String value) {
            addCriterion("ZPRSN <", value, "zprsn");
            return (Criteria) this;
        }

        public Criteria andZprsnLessThanOrEqualTo(String value) {
            addCriterion("ZPRSN <=", value, "zprsn");
            return (Criteria) this;
        }

        public Criteria andZprsnLike(String value) {
            addCriterion("ZPRSN like", value, "zprsn");
            return (Criteria) this;
        }

        public Criteria andZprsnNotLike(String value) {
            addCriterion("ZPRSN not like", value, "zprsn");
            return (Criteria) this;
        }

        public Criteria andZprsnIn(List<String> values) {
            addCriterion("ZPRSN in", values, "zprsn");
            return (Criteria) this;
        }

        public Criteria andZprsnNotIn(List<String> values) {
            addCriterion("ZPRSN not in", values, "zprsn");
            return (Criteria) this;
        }

        public Criteria andZprsnBetween(String value1, String value2) {
            addCriterion("ZPRSN between", value1, value2, "zprsn");
            return (Criteria) this;
        }

        public Criteria andZprsnNotBetween(String value1, String value2) {
            addCriterion("ZPRSN not between", value1, value2, "zprsn");
            return (Criteria) this;
        }

        public Criteria andZprsnvIsNull() {
            addCriterion("ZPRSNV is null");
            return (Criteria) this;
        }

        public Criteria andZprsnvIsNotNull() {
            addCriterion("ZPRSNV is not null");
            return (Criteria) this;
        }

        public Criteria andZprsnvEqualTo(String value) {
            addCriterion("ZPRSNV =", value, "zprsnv");
            return (Criteria) this;
        }

        public Criteria andZprsnvNotEqualTo(String value) {
            addCriterion("ZPRSNV <>", value, "zprsnv");
            return (Criteria) this;
        }

        public Criteria andZprsnvGreaterThan(String value) {
            addCriterion("ZPRSNV >", value, "zprsnv");
            return (Criteria) this;
        }

        public Criteria andZprsnvGreaterThanOrEqualTo(String value) {
            addCriterion("ZPRSNV >=", value, "zprsnv");
            return (Criteria) this;
        }

        public Criteria andZprsnvLessThan(String value) {
            addCriterion("ZPRSNV <", value, "zprsnv");
            return (Criteria) this;
        }

        public Criteria andZprsnvLessThanOrEqualTo(String value) {
            addCriterion("ZPRSNV <=", value, "zprsnv");
            return (Criteria) this;
        }

        public Criteria andZprsnvLike(String value) {
            addCriterion("ZPRSNV like", value, "zprsnv");
            return (Criteria) this;
        }

        public Criteria andZprsnvNotLike(String value) {
            addCriterion("ZPRSNV not like", value, "zprsnv");
            return (Criteria) this;
        }

        public Criteria andZprsnvIn(List<String> values) {
            addCriterion("ZPRSNV in", values, "zprsnv");
            return (Criteria) this;
        }

        public Criteria andZprsnvNotIn(List<String> values) {
            addCriterion("ZPRSNV not in", values, "zprsnv");
            return (Criteria) this;
        }

        public Criteria andZprsnvBetween(String value1, String value2) {
            addCriterion("ZPRSNV between", value1, value2, "zprsnv");
            return (Criteria) this;
        }

        public Criteria andZprsnvNotBetween(String value1, String value2) {
            addCriterion("ZPRSNV not between", value1, value2, "zprsnv");
            return (Criteria) this;
        }

        public Criteria andXbbxIsNull() {
            addCriterion("XBBX is null");
            return (Criteria) this;
        }

        public Criteria andXbbxIsNotNull() {
            addCriterion("XBBX is not null");
            return (Criteria) this;
        }

        public Criteria andXbbxEqualTo(String value) {
            addCriterion("XBBX =", value, "xbbx");
            return (Criteria) this;
        }

        public Criteria andXbbxNotEqualTo(String value) {
            addCriterion("XBBX <>", value, "xbbx");
            return (Criteria) this;
        }

        public Criteria andXbbxGreaterThan(String value) {
            addCriterion("XBBX >", value, "xbbx");
            return (Criteria) this;
        }

        public Criteria andXbbxGreaterThanOrEqualTo(String value) {
            addCriterion("XBBX >=", value, "xbbx");
            return (Criteria) this;
        }

        public Criteria andXbbxLessThan(String value) {
            addCriterion("XBBX <", value, "xbbx");
            return (Criteria) this;
        }

        public Criteria andXbbxLessThanOrEqualTo(String value) {
            addCriterion("XBBX <=", value, "xbbx");
            return (Criteria) this;
        }

        public Criteria andXbbxLike(String value) {
            addCriterion("XBBX like", value, "xbbx");
            return (Criteria) this;
        }

        public Criteria andXbbxNotLike(String value) {
            addCriterion("XBBX not like", value, "xbbx");
            return (Criteria) this;
        }

        public Criteria andXbbxIn(List<String> values) {
            addCriterion("XBBX in", values, "xbbx");
            return (Criteria) this;
        }

        public Criteria andXbbxNotIn(List<String> values) {
            addCriterion("XBBX not in", values, "xbbx");
            return (Criteria) this;
        }

        public Criteria andXbbxBetween(String value1, String value2) {
            addCriterion("XBBX between", value1, value2, "xbbx");
            return (Criteria) this;
        }

        public Criteria andXbbxNotBetween(String value1, String value2) {
            addCriterion("XBBX not between", value1, value2, "xbbx");
            return (Criteria) this;
        }

        public Criteria andHjxzIsNull() {
            addCriterion("hjxz is null");
            return (Criteria) this;
        }

        public Criteria andHjxzIsNotNull() {
            addCriterion("hjxz is not null");
            return (Criteria) this;
        }

        public Criteria andHjxzEqualTo(String value) {
            addCriterion("hjxz =", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzNotEqualTo(String value) {
            addCriterion("hjxz <>", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzGreaterThan(String value) {
            addCriterion("hjxz >", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzGreaterThanOrEqualTo(String value) {
            addCriterion("hjxz >=", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzLessThan(String value) {
            addCriterion("hjxz <", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzLessThanOrEqualTo(String value) {
            addCriterion("hjxz <=", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzLike(String value) {
            addCriterion("hjxz like", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzNotLike(String value) {
            addCriterion("hjxz not like", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzIn(List<String> values) {
            addCriterion("hjxz in", values, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzNotIn(List<String> values) {
            addCriterion("hjxz not in", values, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzBetween(String value1, String value2) {
            addCriterion("hjxz between", value1, value2, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzNotBetween(String value1, String value2) {
            addCriterion("hjxz not between", value1, value2, "hjxz");
            return (Criteria) this;
        }

        public Criteria andKssjIsNull() {
            addCriterion("KSSJ is null");
            return (Criteria) this;
        }

        public Criteria andKssjIsNotNull() {
            addCriterion("KSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andKssjEqualTo(String value) {
            addCriterion("KSSJ =", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotEqualTo(String value) {
            addCriterion("KSSJ <>", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjGreaterThan(String value) {
            addCriterion("KSSJ >", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjGreaterThanOrEqualTo(String value) {
            addCriterion("KSSJ >=", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLessThan(String value) {
            addCriterion("KSSJ <", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLessThanOrEqualTo(String value) {
            addCriterion("KSSJ <=", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLike(String value) {
            addCriterion("KSSJ like", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotLike(String value) {
            addCriterion("KSSJ not like", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjIn(List<String> values) {
            addCriterion("KSSJ in", values, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotIn(List<String> values) {
            addCriterion("KSSJ not in", values, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjBetween(String value1, String value2) {
            addCriterion("KSSJ between", value1, value2, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotBetween(String value1, String value2) {
            addCriterion("KSSJ not between", value1, value2, "kssj");
            return (Criteria) this;
        }

        public Criteria andJssjIsNull() {
            addCriterion("JSSJ is null");
            return (Criteria) this;
        }

        public Criteria andJssjIsNotNull() {
            addCriterion("JSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJssjEqualTo(String value) {
            addCriterion("JSSJ =", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotEqualTo(String value) {
            addCriterion("JSSJ <>", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjGreaterThan(String value) {
            addCriterion("JSSJ >", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjGreaterThanOrEqualTo(String value) {
            addCriterion("JSSJ >=", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLessThan(String value) {
            addCriterion("JSSJ <", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLessThanOrEqualTo(String value) {
            addCriterion("JSSJ <=", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLike(String value) {
            addCriterion("JSSJ like", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotLike(String value) {
            addCriterion("JSSJ not like", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjIn(List<String> values) {
            addCriterion("JSSJ in", values, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotIn(List<String> values) {
            addCriterion("JSSJ not in", values, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjBetween(String value1, String value2) {
            addCriterion("JSSJ between", value1, value2, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotBetween(String value1, String value2) {
            addCriterion("JSSJ not between", value1, value2, "jssj");
            return (Criteria) this;
        }

        public Criteria andZxnlIsNull() {
            addCriterion("ZXNL is null");
            return (Criteria) this;
        }

        public Criteria andZxnlIsNotNull() {
            addCriterion("ZXNL is not null");
            return (Criteria) this;
        }

        public Criteria andZxnlEqualTo(String value) {
            addCriterion("ZXNL =", value, "zxnl");
            return (Criteria) this;
        }

        public Criteria andZxnlNotEqualTo(String value) {
            addCriterion("ZXNL <>", value, "zxnl");
            return (Criteria) this;
        }

        public Criteria andZxnlGreaterThan(String value) {
            addCriterion("ZXNL >", value, "zxnl");
            return (Criteria) this;
        }

        public Criteria andZxnlGreaterThanOrEqualTo(String value) {
            addCriterion("ZXNL >=", value, "zxnl");
            return (Criteria) this;
        }

        public Criteria andZxnlLessThan(String value) {
            addCriterion("ZXNL <", value, "zxnl");
            return (Criteria) this;
        }

        public Criteria andZxnlLessThanOrEqualTo(String value) {
            addCriterion("ZXNL <=", value, "zxnl");
            return (Criteria) this;
        }

        public Criteria andZxnlLike(String value) {
            addCriterion("ZXNL like", value, "zxnl");
            return (Criteria) this;
        }

        public Criteria andZxnlNotLike(String value) {
            addCriterion("ZXNL not like", value, "zxnl");
            return (Criteria) this;
        }

        public Criteria andZxnlIn(List<String> values) {
            addCriterion("ZXNL in", values, "zxnl");
            return (Criteria) this;
        }

        public Criteria andZxnlNotIn(List<String> values) {
            addCriterion("ZXNL not in", values, "zxnl");
            return (Criteria) this;
        }

        public Criteria andZxnlBetween(String value1, String value2) {
            addCriterion("ZXNL between", value1, value2, "zxnl");
            return (Criteria) this;
        }

        public Criteria andZxnlNotBetween(String value1, String value2) {
            addCriterion("ZXNL not between", value1, value2, "zxnl");
            return (Criteria) this;
        }

        public Criteria andZdnlIsNull() {
            addCriterion("ZDNL is null");
            return (Criteria) this;
        }

        public Criteria andZdnlIsNotNull() {
            addCriterion("ZDNL is not null");
            return (Criteria) this;
        }

        public Criteria andZdnlEqualTo(String value) {
            addCriterion("ZDNL =", value, "zdnl");
            return (Criteria) this;
        }

        public Criteria andZdnlNotEqualTo(String value) {
            addCriterion("ZDNL <>", value, "zdnl");
            return (Criteria) this;
        }

        public Criteria andZdnlGreaterThan(String value) {
            addCriterion("ZDNL >", value, "zdnl");
            return (Criteria) this;
        }

        public Criteria andZdnlGreaterThanOrEqualTo(String value) {
            addCriterion("ZDNL >=", value, "zdnl");
            return (Criteria) this;
        }

        public Criteria andZdnlLessThan(String value) {
            addCriterion("ZDNL <", value, "zdnl");
            return (Criteria) this;
        }

        public Criteria andZdnlLessThanOrEqualTo(String value) {
            addCriterion("ZDNL <=", value, "zdnl");
            return (Criteria) this;
        }

        public Criteria andZdnlLike(String value) {
            addCriterion("ZDNL like", value, "zdnl");
            return (Criteria) this;
        }

        public Criteria andZdnlNotLike(String value) {
            addCriterion("ZDNL not like", value, "zdnl");
            return (Criteria) this;
        }

        public Criteria andZdnlIn(List<String> values) {
            addCriterion("ZDNL in", values, "zdnl");
            return (Criteria) this;
        }

        public Criteria andZdnlNotIn(List<String> values) {
            addCriterion("ZDNL not in", values, "zdnl");
            return (Criteria) this;
        }

        public Criteria andZdnlBetween(String value1, String value2) {
            addCriterion("ZDNL between", value1, value2, "zdnl");
            return (Criteria) this;
        }

        public Criteria andZdnlNotBetween(String value1, String value2) {
            addCriterion("ZDNL not between", value1, value2, "zdnl");
            return (Criteria) this;
        }

        public Criteria andWhcdIsNull() {
            addCriterion("whcd is null");
            return (Criteria) this;
        }

        public Criteria andWhcdIsNotNull() {
            addCriterion("whcd is not null");
            return (Criteria) this;
        }

        public Criteria andWhcdEqualTo(String value) {
            addCriterion("whcd =", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdNotEqualTo(String value) {
            addCriterion("whcd <>", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdGreaterThan(String value) {
            addCriterion("whcd >", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdGreaterThanOrEqualTo(String value) {
            addCriterion("whcd >=", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdLessThan(String value) {
            addCriterion("whcd <", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdLessThanOrEqualTo(String value) {
            addCriterion("whcd <=", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdLike(String value) {
            addCriterion("whcd like", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdNotLike(String value) {
            addCriterion("whcd not like", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdIn(List<String> values) {
            addCriterion("whcd in", values, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdNotIn(List<String> values) {
            addCriterion("whcd not in", values, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdBetween(String value1, String value2) {
            addCriterion("whcd between", value1, value2, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdNotBetween(String value1, String value2) {
            addCriterion("whcd not between", value1, value2, "whcd");
            return (Criteria) this;
        }

        public Criteria andYgxsIsNull() {
            addCriterion("ygxs is null");
            return (Criteria) this;
        }

        public Criteria andYgxsIsNotNull() {
            addCriterion("ygxs is not null");
            return (Criteria) this;
        }

        public Criteria andYgxsEqualTo(String value) {
            addCriterion("ygxs =", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsNotEqualTo(String value) {
            addCriterion("ygxs <>", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsGreaterThan(String value) {
            addCriterion("ygxs >", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsGreaterThanOrEqualTo(String value) {
            addCriterion("ygxs >=", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsLessThan(String value) {
            addCriterion("ygxs <", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsLessThanOrEqualTo(String value) {
            addCriterion("ygxs <=", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsLike(String value) {
            addCriterion("ygxs like", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsNotLike(String value) {
            addCriterion("ygxs not like", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsIn(List<String> values) {
            addCriterion("ygxs in", values, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsNotIn(List<String> values) {
            addCriterion("ygxs not in", values, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsBetween(String value1, String value2) {
            addCriterion("ygxs between", value1, value2, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsNotBetween(String value1, String value2) {
            addCriterion("ygxs not between", value1, value2, "ygxs");
            return (Criteria) this;
        }

        public Criteria andZzyxIsNull() {
            addCriterion("ZZYX is null");
            return (Criteria) this;
        }

        public Criteria andZzyxIsNotNull() {
            addCriterion("ZZYX is not null");
            return (Criteria) this;
        }

        public Criteria andZzyxEqualTo(String value) {
            addCriterion("ZZYX =", value, "zzyx");
            return (Criteria) this;
        }

        public Criteria andZzyxNotEqualTo(String value) {
            addCriterion("ZZYX <>", value, "zzyx");
            return (Criteria) this;
        }

        public Criteria andZzyxGreaterThan(String value) {
            addCriterion("ZZYX >", value, "zzyx");
            return (Criteria) this;
        }

        public Criteria andZzyxGreaterThanOrEqualTo(String value) {
            addCriterion("ZZYX >=", value, "zzyx");
            return (Criteria) this;
        }

        public Criteria andZzyxLessThan(String value) {
            addCriterion("ZZYX <", value, "zzyx");
            return (Criteria) this;
        }

        public Criteria andZzyxLessThanOrEqualTo(String value) {
            addCriterion("ZZYX <=", value, "zzyx");
            return (Criteria) this;
        }

        public Criteria andZzyxLike(String value) {
            addCriterion("ZZYX like", value, "zzyx");
            return (Criteria) this;
        }

        public Criteria andZzyxNotLike(String value) {
            addCriterion("ZZYX not like", value, "zzyx");
            return (Criteria) this;
        }

        public Criteria andZzyxIn(List<String> values) {
            addCriterion("ZZYX in", values, "zzyx");
            return (Criteria) this;
        }

        public Criteria andZzyxNotIn(List<String> values) {
            addCriterion("ZZYX not in", values, "zzyx");
            return (Criteria) this;
        }

        public Criteria andZzyxBetween(String value1, String value2) {
            addCriterion("ZZYX between", value1, value2, "zzyx");
            return (Criteria) this;
        }

        public Criteria andZzyxNotBetween(String value1, String value2) {
            addCriterion("ZZYX not between", value1, value2, "zzyx");
            return (Criteria) this;
        }

        public Criteria andZgyxIsNull() {
            addCriterion("ZGYX is null");
            return (Criteria) this;
        }

        public Criteria andZgyxIsNotNull() {
            addCriterion("ZGYX is not null");
            return (Criteria) this;
        }

        public Criteria andZgyxEqualTo(String value) {
            addCriterion("ZGYX =", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxNotEqualTo(String value) {
            addCriterion("ZGYX <>", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxGreaterThan(String value) {
            addCriterion("ZGYX >", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxGreaterThanOrEqualTo(String value) {
            addCriterion("ZGYX >=", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxLessThan(String value) {
            addCriterion("ZGYX <", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxLessThanOrEqualTo(String value) {
            addCriterion("ZGYX <=", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxLike(String value) {
            addCriterion("ZGYX like", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxNotLike(String value) {
            addCriterion("ZGYX not like", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxIn(List<String> values) {
            addCriterion("ZGYX in", values, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxNotIn(List<String> values) {
            addCriterion("ZGYX not in", values, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxBetween(String value1, String value2) {
            addCriterion("ZGYX between", value1, value2, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxNotBetween(String value1, String value2) {
            addCriterion("ZGYX not between", value1, value2, "zgyx");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNull() {
            addCriterion("hyzk is null");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNotNull() {
            addCriterion("hyzk is not null");
            return (Criteria) this;
        }

        public Criteria andHyzkEqualTo(String value) {
            addCriterion("hyzk =", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotEqualTo(String value) {
            addCriterion("hyzk <>", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThan(String value) {
            addCriterion("hyzk >", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThanOrEqualTo(String value) {
            addCriterion("hyzk >=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThan(String value) {
            addCriterion("hyzk <", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThanOrEqualTo(String value) {
            addCriterion("hyzk <=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLike(String value) {
            addCriterion("hyzk like", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotLike(String value) {
            addCriterion("hyzk not like", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkIn(List<String> values) {
            addCriterion("hyzk in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotIn(List<String> values) {
            addCriterion("hyzk not in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkBetween(String value1, String value2) {
            addCriterion("hyzk between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotBetween(String value1, String value2) {
            addCriterion("hyzk not between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andJkzkIsNull() {
            addCriterion("jkzk is null");
            return (Criteria) this;
        }

        public Criteria andJkzkIsNotNull() {
            addCriterion("jkzk is not null");
            return (Criteria) this;
        }

        public Criteria andJkzkEqualTo(String value) {
            addCriterion("jkzk =", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkNotEqualTo(String value) {
            addCriterion("jkzk <>", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkGreaterThan(String value) {
            addCriterion("jkzk >", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkGreaterThanOrEqualTo(String value) {
            addCriterion("jkzk >=", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkLessThan(String value) {
            addCriterion("jkzk <", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkLessThanOrEqualTo(String value) {
            addCriterion("jkzk <=", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkLike(String value) {
            addCriterion("jkzk like", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkNotLike(String value) {
            addCriterion("jkzk not like", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkIn(List<String> values) {
            addCriterion("jkzk in", values, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkNotIn(List<String> values) {
            addCriterion("jkzk not in", values, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkBetween(String value1, String value2) {
            addCriterion("jkzk between", value1, value2, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkNotBetween(String value1, String value2) {
            addCriterion("jkzk not between", value1, value2, "jkzk");
            return (Criteria) this;
        }

        public Criteria andRylbIsNull() {
            addCriterion("rylb is null");
            return (Criteria) this;
        }

        public Criteria andRylbIsNotNull() {
            addCriterion("rylb is not null");
            return (Criteria) this;
        }

        public Criteria andRylbEqualTo(String value) {
            addCriterion("rylb =", value, "rylb");
            return (Criteria) this;
        }

        public Criteria andRylbNotEqualTo(String value) {
            addCriterion("rylb <>", value, "rylb");
            return (Criteria) this;
        }

        public Criteria andRylbGreaterThan(String value) {
            addCriterion("rylb >", value, "rylb");
            return (Criteria) this;
        }

        public Criteria andRylbGreaterThanOrEqualTo(String value) {
            addCriterion("rylb >=", value, "rylb");
            return (Criteria) this;
        }

        public Criteria andRylbLessThan(String value) {
            addCriterion("rylb <", value, "rylb");
            return (Criteria) this;
        }

        public Criteria andRylbLessThanOrEqualTo(String value) {
            addCriterion("rylb <=", value, "rylb");
            return (Criteria) this;
        }

        public Criteria andRylbLike(String value) {
            addCriterion("rylb like", value, "rylb");
            return (Criteria) this;
        }

        public Criteria andRylbNotLike(String value) {
            addCriterion("rylb not like", value, "rylb");
            return (Criteria) this;
        }

        public Criteria andRylbIn(List<String> values) {
            addCriterion("rylb in", values, "rylb");
            return (Criteria) this;
        }

        public Criteria andRylbNotIn(List<String> values) {
            addCriterion("rylb not in", values, "rylb");
            return (Criteria) this;
        }

        public Criteria andRylbBetween(String value1, String value2) {
            addCriterion("rylb between", value1, value2, "rylb");
            return (Criteria) this;
        }

        public Criteria andRylbNotBetween(String value1, String value2) {
            addCriterion("rylb not between", value1, value2, "rylb");
            return (Criteria) this;
        }

        public Criteria andSfbysIsNull() {
            addCriterion("sfbys is null");
            return (Criteria) this;
        }

        public Criteria andSfbysIsNotNull() {
            addCriterion("sfbys is not null");
            return (Criteria) this;
        }

        public Criteria andSfbysEqualTo(String value) {
            addCriterion("sfbys =", value, "sfbys");
            return (Criteria) this;
        }

        public Criteria andSfbysNotEqualTo(String value) {
            addCriterion("sfbys <>", value, "sfbys");
            return (Criteria) this;
        }

        public Criteria andSfbysGreaterThan(String value) {
            addCriterion("sfbys >", value, "sfbys");
            return (Criteria) this;
        }

        public Criteria andSfbysGreaterThanOrEqualTo(String value) {
            addCriterion("sfbys >=", value, "sfbys");
            return (Criteria) this;
        }

        public Criteria andSfbysLessThan(String value) {
            addCriterion("sfbys <", value, "sfbys");
            return (Criteria) this;
        }

        public Criteria andSfbysLessThanOrEqualTo(String value) {
            addCriterion("sfbys <=", value, "sfbys");
            return (Criteria) this;
        }

        public Criteria andSfbysLike(String value) {
            addCriterion("sfbys like", value, "sfbys");
            return (Criteria) this;
        }

        public Criteria andSfbysNotLike(String value) {
            addCriterion("sfbys not like", value, "sfbys");
            return (Criteria) this;
        }

        public Criteria andSfbysIn(List<String> values) {
            addCriterion("sfbys in", values, "sfbys");
            return (Criteria) this;
        }

        public Criteria andSfbysNotIn(List<String> values) {
            addCriterion("sfbys not in", values, "sfbys");
            return (Criteria) this;
        }

        public Criteria andSfbysBetween(String value1, String value2) {
            addCriterion("sfbys between", value1, value2, "sfbys");
            return (Criteria) this;
        }

        public Criteria andSfbysNotBetween(String value1, String value2) {
            addCriterion("sfbys not between", value1, value2, "sfbys");
            return (Criteria) this;
        }

        public Criteria andZpdqIsNull() {
            addCriterion("ZPDQ is null");
            return (Criteria) this;
        }

        public Criteria andZpdqIsNotNull() {
            addCriterion("ZPDQ is not null");
            return (Criteria) this;
        }

        public Criteria andZpdqEqualTo(String value) {
            addCriterion("ZPDQ =", value, "zpdq");
            return (Criteria) this;
        }

        public Criteria andZpdqNotEqualTo(String value) {
            addCriterion("ZPDQ <>", value, "zpdq");
            return (Criteria) this;
        }

        public Criteria andZpdqGreaterThan(String value) {
            addCriterion("ZPDQ >", value, "zpdq");
            return (Criteria) this;
        }

        public Criteria andZpdqGreaterThanOrEqualTo(String value) {
            addCriterion("ZPDQ >=", value, "zpdq");
            return (Criteria) this;
        }

        public Criteria andZpdqLessThan(String value) {
            addCriterion("ZPDQ <", value, "zpdq");
            return (Criteria) this;
        }

        public Criteria andZpdqLessThanOrEqualTo(String value) {
            addCriterion("ZPDQ <=", value, "zpdq");
            return (Criteria) this;
        }

        public Criteria andZpdqLike(String value) {
            addCriterion("ZPDQ like", value, "zpdq");
            return (Criteria) this;
        }

        public Criteria andZpdqNotLike(String value) {
            addCriterion("ZPDQ not like", value, "zpdq");
            return (Criteria) this;
        }

        public Criteria andZpdqIn(List<String> values) {
            addCriterion("ZPDQ in", values, "zpdq");
            return (Criteria) this;
        }

        public Criteria andZpdqNotIn(List<String> values) {
            addCriterion("ZPDQ not in", values, "zpdq");
            return (Criteria) this;
        }

        public Criteria andZpdqBetween(String value1, String value2) {
            addCriterion("ZPDQ between", value1, value2, "zpdq");
            return (Criteria) this;
        }

        public Criteria andZpdqNotBetween(String value1, String value2) {
            addCriterion("ZPDQ not between", value1, value2, "zpdq");
            return (Criteria) this;
        }

        public Criteria andJyyzIsNull() {
            addCriterion("JYYZ is null");
            return (Criteria) this;
        }

        public Criteria andJyyzIsNotNull() {
            addCriterion("JYYZ is not null");
            return (Criteria) this;
        }

        public Criteria andJyyzEqualTo(String value) {
            addCriterion("JYYZ =", value, "jyyz");
            return (Criteria) this;
        }

        public Criteria andJyyzNotEqualTo(String value) {
            addCriterion("JYYZ <>", value, "jyyz");
            return (Criteria) this;
        }

        public Criteria andJyyzGreaterThan(String value) {
            addCriterion("JYYZ >", value, "jyyz");
            return (Criteria) this;
        }

        public Criteria andJyyzGreaterThanOrEqualTo(String value) {
            addCriterion("JYYZ >=", value, "jyyz");
            return (Criteria) this;
        }

        public Criteria andJyyzLessThan(String value) {
            addCriterion("JYYZ <", value, "jyyz");
            return (Criteria) this;
        }

        public Criteria andJyyzLessThanOrEqualTo(String value) {
            addCriterion("JYYZ <=", value, "jyyz");
            return (Criteria) this;
        }

        public Criteria andJyyzLike(String value) {
            addCriterion("JYYZ like", value, "jyyz");
            return (Criteria) this;
        }

        public Criteria andJyyzNotLike(String value) {
            addCriterion("JYYZ not like", value, "jyyz");
            return (Criteria) this;
        }

        public Criteria andJyyzIn(List<String> values) {
            addCriterion("JYYZ in", values, "jyyz");
            return (Criteria) this;
        }

        public Criteria andJyyzNotIn(List<String> values) {
            addCriterion("JYYZ not in", values, "jyyz");
            return (Criteria) this;
        }

        public Criteria andJyyzBetween(String value1, String value2) {
            addCriterion("JYYZ between", value1, value2, "jyyz");
            return (Criteria) this;
        }

        public Criteria andJyyzNotBetween(String value1, String value2) {
            addCriterion("JYYZ not between", value1, value2, "jyyz");
            return (Criteria) this;
        }

        public Criteria andSlcdIsNull() {
            addCriterion("SLCD is null");
            return (Criteria) this;
        }

        public Criteria andSlcdIsNotNull() {
            addCriterion("SLCD is not null");
            return (Criteria) this;
        }

        public Criteria andSlcdEqualTo(String value) {
            addCriterion("SLCD =", value, "slcd");
            return (Criteria) this;
        }

        public Criteria andSlcdNotEqualTo(String value) {
            addCriterion("SLCD <>", value, "slcd");
            return (Criteria) this;
        }

        public Criteria andSlcdGreaterThan(String value) {
            addCriterion("SLCD >", value, "slcd");
            return (Criteria) this;
        }

        public Criteria andSlcdGreaterThanOrEqualTo(String value) {
            addCriterion("SLCD >=", value, "slcd");
            return (Criteria) this;
        }

        public Criteria andSlcdLessThan(String value) {
            addCriterion("SLCD <", value, "slcd");
            return (Criteria) this;
        }

        public Criteria andSlcdLessThanOrEqualTo(String value) {
            addCriterion("SLCD <=", value, "slcd");
            return (Criteria) this;
        }

        public Criteria andSlcdLike(String value) {
            addCriterion("SLCD like", value, "slcd");
            return (Criteria) this;
        }

        public Criteria andSlcdNotLike(String value) {
            addCriterion("SLCD not like", value, "slcd");
            return (Criteria) this;
        }

        public Criteria andSlcdIn(List<String> values) {
            addCriterion("SLCD in", values, "slcd");
            return (Criteria) this;
        }

        public Criteria andSlcdNotIn(List<String> values) {
            addCriterion("SLCD not in", values, "slcd");
            return (Criteria) this;
        }

        public Criteria andSlcdBetween(String value1, String value2) {
            addCriterion("SLCD between", value1, value2, "slcd");
            return (Criteria) this;
        }

        public Criteria andSlcdNotBetween(String value1, String value2) {
            addCriterion("SLCD not between", value1, value2, "slcd");
            return (Criteria) this;
        }

        public Criteria andJsjdjIsNull() {
            addCriterion("JSJDJ is null");
            return (Criteria) this;
        }

        public Criteria andJsjdjIsNotNull() {
            addCriterion("JSJDJ is not null");
            return (Criteria) this;
        }

        public Criteria andJsjdjEqualTo(String value) {
            addCriterion("JSJDJ =", value, "jsjdj");
            return (Criteria) this;
        }

        public Criteria andJsjdjNotEqualTo(String value) {
            addCriterion("JSJDJ <>", value, "jsjdj");
            return (Criteria) this;
        }

        public Criteria andJsjdjGreaterThan(String value) {
            addCriterion("JSJDJ >", value, "jsjdj");
            return (Criteria) this;
        }

        public Criteria andJsjdjGreaterThanOrEqualTo(String value) {
            addCriterion("JSJDJ >=", value, "jsjdj");
            return (Criteria) this;
        }

        public Criteria andJsjdjLessThan(String value) {
            addCriterion("JSJDJ <", value, "jsjdj");
            return (Criteria) this;
        }

        public Criteria andJsjdjLessThanOrEqualTo(String value) {
            addCriterion("JSJDJ <=", value, "jsjdj");
            return (Criteria) this;
        }

        public Criteria andJsjdjLike(String value) {
            addCriterion("JSJDJ like", value, "jsjdj");
            return (Criteria) this;
        }

        public Criteria andJsjdjNotLike(String value) {
            addCriterion("JSJDJ not like", value, "jsjdj");
            return (Criteria) this;
        }

        public Criteria andJsjdjIn(List<String> values) {
            addCriterion("JSJDJ in", values, "jsjdj");
            return (Criteria) this;
        }

        public Criteria andJsjdjNotIn(List<String> values) {
            addCriterion("JSJDJ not in", values, "jsjdj");
            return (Criteria) this;
        }

        public Criteria andJsjdjBetween(String value1, String value2) {
            addCriterion("JSJDJ between", value1, value2, "jsjdj");
            return (Criteria) this;
        }

        public Criteria andJsjdjNotBetween(String value1, String value2) {
            addCriterion("JSJDJ not between", value1, value2, "jsjdj");
            return (Criteria) this;
        }

        public Criteria andJsjslcdIsNull() {
            addCriterion("JSJSLCD is null");
            return (Criteria) this;
        }

        public Criteria andJsjslcdIsNotNull() {
            addCriterion("JSJSLCD is not null");
            return (Criteria) this;
        }

        public Criteria andJsjslcdEqualTo(String value) {
            addCriterion("JSJSLCD =", value, "jsjslcd");
            return (Criteria) this;
        }

        public Criteria andJsjslcdNotEqualTo(String value) {
            addCriterion("JSJSLCD <>", value, "jsjslcd");
            return (Criteria) this;
        }

        public Criteria andJsjslcdGreaterThan(String value) {
            addCriterion("JSJSLCD >", value, "jsjslcd");
            return (Criteria) this;
        }

        public Criteria andJsjslcdGreaterThanOrEqualTo(String value) {
            addCriterion("JSJSLCD >=", value, "jsjslcd");
            return (Criteria) this;
        }

        public Criteria andJsjslcdLessThan(String value) {
            addCriterion("JSJSLCD <", value, "jsjslcd");
            return (Criteria) this;
        }

        public Criteria andJsjslcdLessThanOrEqualTo(String value) {
            addCriterion("JSJSLCD <=", value, "jsjslcd");
            return (Criteria) this;
        }

        public Criteria andJsjslcdLike(String value) {
            addCriterion("JSJSLCD like", value, "jsjslcd");
            return (Criteria) this;
        }

        public Criteria andJsjslcdNotLike(String value) {
            addCriterion("JSJSLCD not like", value, "jsjslcd");
            return (Criteria) this;
        }

        public Criteria andJsjslcdIn(List<String> values) {
            addCriterion("JSJSLCD in", values, "jsjslcd");
            return (Criteria) this;
        }

        public Criteria andJsjslcdNotIn(List<String> values) {
            addCriterion("JSJSLCD not in", values, "jsjslcd");
            return (Criteria) this;
        }

        public Criteria andJsjslcdBetween(String value1, String value2) {
            addCriterion("JSJSLCD between", value1, value2, "jsjslcd");
            return (Criteria) this;
        }

        public Criteria andJsjslcdNotBetween(String value1, String value2) {
            addCriterion("JSJSLCD not between", value1, value2, "jsjslcd");
            return (Criteria) this;
        }

        public Criteria andGwmsIsNull() {
            addCriterion("GWMS is null");
            return (Criteria) this;
        }

        public Criteria andGwmsIsNotNull() {
            addCriterion("GWMS is not null");
            return (Criteria) this;
        }

        public Criteria andGwmsEqualTo(String value) {
            addCriterion("GWMS =", value, "gwms");
            return (Criteria) this;
        }

        public Criteria andGwmsNotEqualTo(String value) {
            addCriterion("GWMS <>", value, "gwms");
            return (Criteria) this;
        }

        public Criteria andGwmsGreaterThan(String value) {
            addCriterion("GWMS >", value, "gwms");
            return (Criteria) this;
        }

        public Criteria andGwmsGreaterThanOrEqualTo(String value) {
            addCriterion("GWMS >=", value, "gwms");
            return (Criteria) this;
        }

        public Criteria andGwmsLessThan(String value) {
            addCriterion("GWMS <", value, "gwms");
            return (Criteria) this;
        }

        public Criteria andGwmsLessThanOrEqualTo(String value) {
            addCriterion("GWMS <=", value, "gwms");
            return (Criteria) this;
        }

        public Criteria andGwmsLike(String value) {
            addCriterion("GWMS like", value, "gwms");
            return (Criteria) this;
        }

        public Criteria andGwmsNotLike(String value) {
            addCriterion("GWMS not like", value, "gwms");
            return (Criteria) this;
        }

        public Criteria andGwmsIn(List<String> values) {
            addCriterion("GWMS in", values, "gwms");
            return (Criteria) this;
        }

        public Criteria andGwmsNotIn(List<String> values) {
            addCriterion("GWMS not in", values, "gwms");
            return (Criteria) this;
        }

        public Criteria andGwmsBetween(String value1, String value2) {
            addCriterion("GWMS between", value1, value2, "gwms");
            return (Criteria) this;
        }

        public Criteria andGwmsNotBetween(String value1, String value2) {
            addCriterion("GWMS not between", value1, value2, "gwms");
            return (Criteria) this;
        }

        public Criteria andGzddIsNull() {
            addCriterion("GZDD is null");
            return (Criteria) this;
        }

        public Criteria andGzddIsNotNull() {
            addCriterion("GZDD is not null");
            return (Criteria) this;
        }

        public Criteria andGzddEqualTo(String value) {
            addCriterion("GZDD =", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddNotEqualTo(String value) {
            addCriterion("GZDD <>", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddGreaterThan(String value) {
            addCriterion("GZDD >", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddGreaterThanOrEqualTo(String value) {
            addCriterion("GZDD >=", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddLessThan(String value) {
            addCriterion("GZDD <", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddLessThanOrEqualTo(String value) {
            addCriterion("GZDD <=", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddLike(String value) {
            addCriterion("GZDD like", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddNotLike(String value) {
            addCriterion("GZDD not like", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddIn(List<String> values) {
            addCriterion("GZDD in", values, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddNotIn(List<String> values) {
            addCriterion("GZDD not in", values, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddBetween(String value1, String value2) {
            addCriterion("GZDD between", value1, value2, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddNotBetween(String value1, String value2) {
            addCriterion("GZDD not between", value1, value2, "gzdd");
            return (Criteria) this;
        }

        public Criteria andCgrsnIsNull() {
            addCriterion("CGRSN is null");
            return (Criteria) this;
        }

        public Criteria andCgrsnIsNotNull() {
            addCriterion("CGRSN is not null");
            return (Criteria) this;
        }

        public Criteria andCgrsnEqualTo(String value) {
            addCriterion("CGRSN =", value, "cgrsn");
            return (Criteria) this;
        }

        public Criteria andCgrsnNotEqualTo(String value) {
            addCriterion("CGRSN <>", value, "cgrsn");
            return (Criteria) this;
        }

        public Criteria andCgrsnGreaterThan(String value) {
            addCriterion("CGRSN >", value, "cgrsn");
            return (Criteria) this;
        }

        public Criteria andCgrsnGreaterThanOrEqualTo(String value) {
            addCriterion("CGRSN >=", value, "cgrsn");
            return (Criteria) this;
        }

        public Criteria andCgrsnLessThan(String value) {
            addCriterion("CGRSN <", value, "cgrsn");
            return (Criteria) this;
        }

        public Criteria andCgrsnLessThanOrEqualTo(String value) {
            addCriterion("CGRSN <=", value, "cgrsn");
            return (Criteria) this;
        }

        public Criteria andCgrsnLike(String value) {
            addCriterion("CGRSN like", value, "cgrsn");
            return (Criteria) this;
        }

        public Criteria andCgrsnNotLike(String value) {
            addCriterion("CGRSN not like", value, "cgrsn");
            return (Criteria) this;
        }

        public Criteria andCgrsnIn(List<String> values) {
            addCriterion("CGRSN in", values, "cgrsn");
            return (Criteria) this;
        }

        public Criteria andCgrsnNotIn(List<String> values) {
            addCriterion("CGRSN not in", values, "cgrsn");
            return (Criteria) this;
        }

        public Criteria andCgrsnBetween(String value1, String value2) {
            addCriterion("CGRSN between", value1, value2, "cgrsn");
            return (Criteria) this;
        }

        public Criteria andCgrsnNotBetween(String value1, String value2) {
            addCriterion("CGRSN not between", value1, value2, "cgrsn");
            return (Criteria) this;
        }

        public Criteria andCgrsnvIsNull() {
            addCriterion("CGRSNV is null");
            return (Criteria) this;
        }

        public Criteria andCgrsnvIsNotNull() {
            addCriterion("CGRSNV is not null");
            return (Criteria) this;
        }

        public Criteria andCgrsnvEqualTo(String value) {
            addCriterion("CGRSNV =", value, "cgrsnv");
            return (Criteria) this;
        }

        public Criteria andCgrsnvNotEqualTo(String value) {
            addCriterion("CGRSNV <>", value, "cgrsnv");
            return (Criteria) this;
        }

        public Criteria andCgrsnvGreaterThan(String value) {
            addCriterion("CGRSNV >", value, "cgrsnv");
            return (Criteria) this;
        }

        public Criteria andCgrsnvGreaterThanOrEqualTo(String value) {
            addCriterion("CGRSNV >=", value, "cgrsnv");
            return (Criteria) this;
        }

        public Criteria andCgrsnvLessThan(String value) {
            addCriterion("CGRSNV <", value, "cgrsnv");
            return (Criteria) this;
        }

        public Criteria andCgrsnvLessThanOrEqualTo(String value) {
            addCriterion("CGRSNV <=", value, "cgrsnv");
            return (Criteria) this;
        }

        public Criteria andCgrsnvLike(String value) {
            addCriterion("CGRSNV like", value, "cgrsnv");
            return (Criteria) this;
        }

        public Criteria andCgrsnvNotLike(String value) {
            addCriterion("CGRSNV not like", value, "cgrsnv");
            return (Criteria) this;
        }

        public Criteria andCgrsnvIn(List<String> values) {
            addCriterion("CGRSNV in", values, "cgrsnv");
            return (Criteria) this;
        }

        public Criteria andCgrsnvNotIn(List<String> values) {
            addCriterion("CGRSNV not in", values, "cgrsnv");
            return (Criteria) this;
        }

        public Criteria andCgrsnvBetween(String value1, String value2) {
            addCriterion("CGRSNV between", value1, value2, "cgrsnv");
            return (Criteria) this;
        }

        public Criteria andCgrsnvNotBetween(String value1, String value2) {
            addCriterion("CGRSNV not between", value1, value2, "cgrsnv");
            return (Criteria) this;
        }

        public Criteria andDjyxqIsNull() {
            addCriterion("DJYXQ is null");
            return (Criteria) this;
        }

        public Criteria andDjyxqIsNotNull() {
            addCriterion("DJYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andDjyxqEqualTo(String value) {
            addCriterion("DJYXQ =", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqNotEqualTo(String value) {
            addCriterion("DJYXQ <>", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqGreaterThan(String value) {
            addCriterion("DJYXQ >", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqGreaterThanOrEqualTo(String value) {
            addCriterion("DJYXQ >=", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqLessThan(String value) {
            addCriterion("DJYXQ <", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqLessThanOrEqualTo(String value) {
            addCriterion("DJYXQ <=", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqLike(String value) {
            addCriterion("DJYXQ like", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqNotLike(String value) {
            addCriterion("DJYXQ not like", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqIn(List<String> values) {
            addCriterion("DJYXQ in", values, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqNotIn(List<String> values) {
            addCriterion("DJYXQ not in", values, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqBetween(String value1, String value2) {
            addCriterion("DJYXQ between", value1, value2, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqNotBetween(String value1, String value2) {
            addCriterion("DJYXQ not between", value1, value2, "djyxq");
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