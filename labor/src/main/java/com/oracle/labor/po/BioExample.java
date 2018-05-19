package com.oracle.labor.po;

import java.util.ArrayList;
import java.util.List;

public class BioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BioExample() {
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

        public Criteria andBioIdIsNull() {
            addCriterion("bio_id is null");
            return (Criteria) this;
        }

        public Criteria andBioIdIsNotNull() {
            addCriterion("bio_id is not null");
            return (Criteria) this;
        }

        public Criteria andBioIdEqualTo(String value) {
            addCriterion("bio_id =", value, "bioId");
            return (Criteria) this;
        }

        public Criteria andBioIdNotEqualTo(String value) {
            addCriterion("bio_id <>", value, "bioId");
            return (Criteria) this;
        }

        public Criteria andBioIdGreaterThan(String value) {
            addCriterion("bio_id >", value, "bioId");
            return (Criteria) this;
        }

        public Criteria andBioIdGreaterThanOrEqualTo(String value) {
            addCriterion("bio_id >=", value, "bioId");
            return (Criteria) this;
        }

        public Criteria andBioIdLessThan(String value) {
            addCriterion("bio_id <", value, "bioId");
            return (Criteria) this;
        }

        public Criteria andBioIdLessThanOrEqualTo(String value) {
            addCriterion("bio_id <=", value, "bioId");
            return (Criteria) this;
        }

        public Criteria andBioIdLike(String value) {
            addCriterion("bio_id like", value, "bioId");
            return (Criteria) this;
        }

        public Criteria andBioIdNotLike(String value) {
            addCriterion("bio_id not like", value, "bioId");
            return (Criteria) this;
        }

        public Criteria andBioIdIn(List<String> values) {
            addCriterion("bio_id in", values, "bioId");
            return (Criteria) this;
        }

        public Criteria andBioIdNotIn(List<String> values) {
            addCriterion("bio_id not in", values, "bioId");
            return (Criteria) this;
        }

        public Criteria andBioIdBetween(String value1, String value2) {
            addCriterion("bio_id between", value1, value2, "bioId");
            return (Criteria) this;
        }

        public Criteria andBioIdNotBetween(String value1, String value2) {
            addCriterion("bio_id not between", value1, value2, "bioId");
            return (Criteria) this;
        }

        public Criteria andBioNoIsNull() {
            addCriterion("bio_no is null");
            return (Criteria) this;
        }

        public Criteria andBioNoIsNotNull() {
            addCriterion("bio_no is not null");
            return (Criteria) this;
        }

        public Criteria andBioNoEqualTo(String value) {
            addCriterion("bio_no =", value, "bioNo");
            return (Criteria) this;
        }

        public Criteria andBioNoNotEqualTo(String value) {
            addCriterion("bio_no <>", value, "bioNo");
            return (Criteria) this;
        }

        public Criteria andBioNoGreaterThan(String value) {
            addCriterion("bio_no >", value, "bioNo");
            return (Criteria) this;
        }

        public Criteria andBioNoGreaterThanOrEqualTo(String value) {
            addCriterion("bio_no >=", value, "bioNo");
            return (Criteria) this;
        }

        public Criteria andBioNoLessThan(String value) {
            addCriterion("bio_no <", value, "bioNo");
            return (Criteria) this;
        }

        public Criteria andBioNoLessThanOrEqualTo(String value) {
            addCriterion("bio_no <=", value, "bioNo");
            return (Criteria) this;
        }

        public Criteria andBioNoLike(String value) {
            addCriterion("bio_no like", value, "bioNo");
            return (Criteria) this;
        }

        public Criteria andBioNoNotLike(String value) {
            addCriterion("bio_no not like", value, "bioNo");
            return (Criteria) this;
        }

        public Criteria andBioNoIn(List<String> values) {
            addCriterion("bio_no in", values, "bioNo");
            return (Criteria) this;
        }

        public Criteria andBioNoNotIn(List<String> values) {
            addCriterion("bio_no not in", values, "bioNo");
            return (Criteria) this;
        }

        public Criteria andBioNoBetween(String value1, String value2) {
            addCriterion("bio_no between", value1, value2, "bioNo");
            return (Criteria) this;
        }

        public Criteria andBioNoNotBetween(String value1, String value2) {
            addCriterion("bio_no not between", value1, value2, "bioNo");
            return (Criteria) this;
        }

        public Criteria andBioNameIsNull() {
            addCriterion("bio_name is null");
            return (Criteria) this;
        }

        public Criteria andBioNameIsNotNull() {
            addCriterion("bio_name is not null");
            return (Criteria) this;
        }

        public Criteria andBioNameEqualTo(String value) {
            addCriterion("bio_name =", value, "bioName");
            return (Criteria) this;
        }

        public Criteria andBioNameNotEqualTo(String value) {
            addCriterion("bio_name <>", value, "bioName");
            return (Criteria) this;
        }

        public Criteria andBioNameGreaterThan(String value) {
            addCriterion("bio_name >", value, "bioName");
            return (Criteria) this;
        }

        public Criteria andBioNameGreaterThanOrEqualTo(String value) {
            addCriterion("bio_name >=", value, "bioName");
            return (Criteria) this;
        }

        public Criteria andBioNameLessThan(String value) {
            addCriterion("bio_name <", value, "bioName");
            return (Criteria) this;
        }

        public Criteria andBioNameLessThanOrEqualTo(String value) {
            addCriterion("bio_name <=", value, "bioName");
            return (Criteria) this;
        }

        public Criteria andBioNameLike(String value) {
            addCriterion("bio_name like", value, "bioName");
            return (Criteria) this;
        }

        public Criteria andBioNameNotLike(String value) {
            addCriterion("bio_name not like", value, "bioName");
            return (Criteria) this;
        }

        public Criteria andBioNameIn(List<String> values) {
            addCriterion("bio_name in", values, "bioName");
            return (Criteria) this;
        }

        public Criteria andBioNameNotIn(List<String> values) {
            addCriterion("bio_name not in", values, "bioName");
            return (Criteria) this;
        }

        public Criteria andBioNameBetween(String value1, String value2) {
            addCriterion("bio_name between", value1, value2, "bioName");
            return (Criteria) this;
        }

        public Criteria andBioNameNotBetween(String value1, String value2) {
            addCriterion("bio_name not between", value1, value2, "bioName");
            return (Criteria) this;
        }

        public Criteria andBioShortnameIsNull() {
            addCriterion("bio_shortname is null");
            return (Criteria) this;
        }

        public Criteria andBioShortnameIsNotNull() {
            addCriterion("bio_shortname is not null");
            return (Criteria) this;
        }

        public Criteria andBioShortnameEqualTo(String value) {
            addCriterion("bio_shortname =", value, "bioShortname");
            return (Criteria) this;
        }

        public Criteria andBioShortnameNotEqualTo(String value) {
            addCriterion("bio_shortname <>", value, "bioShortname");
            return (Criteria) this;
        }

        public Criteria andBioShortnameGreaterThan(String value) {
            addCriterion("bio_shortname >", value, "bioShortname");
            return (Criteria) this;
        }

        public Criteria andBioShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("bio_shortname >=", value, "bioShortname");
            return (Criteria) this;
        }

        public Criteria andBioShortnameLessThan(String value) {
            addCriterion("bio_shortname <", value, "bioShortname");
            return (Criteria) this;
        }

        public Criteria andBioShortnameLessThanOrEqualTo(String value) {
            addCriterion("bio_shortname <=", value, "bioShortname");
            return (Criteria) this;
        }

        public Criteria andBioShortnameLike(String value) {
            addCriterion("bio_shortname like", value, "bioShortname");
            return (Criteria) this;
        }

        public Criteria andBioShortnameNotLike(String value) {
            addCriterion("bio_shortname not like", value, "bioShortname");
            return (Criteria) this;
        }

        public Criteria andBioShortnameIn(List<String> values) {
            addCriterion("bio_shortname in", values, "bioShortname");
            return (Criteria) this;
        }

        public Criteria andBioShortnameNotIn(List<String> values) {
            addCriterion("bio_shortname not in", values, "bioShortname");
            return (Criteria) this;
        }

        public Criteria andBioShortnameBetween(String value1, String value2) {
            addCriterion("bio_shortname between", value1, value2, "bioShortname");
            return (Criteria) this;
        }

        public Criteria andBioShortnameNotBetween(String value1, String value2) {
            addCriterion("bio_shortname not between", value1, value2, "bioShortname");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeIsNull() {
            addCriterion("bio_orgtype is null");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeIsNotNull() {
            addCriterion("bio_orgtype is not null");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeEqualTo(String value) {
            addCriterion("bio_orgtype =", value, "bioOrgtype");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeNotEqualTo(String value) {
            addCriterion("bio_orgtype <>", value, "bioOrgtype");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeGreaterThan(String value) {
            addCriterion("bio_orgtype >", value, "bioOrgtype");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeGreaterThanOrEqualTo(String value) {
            addCriterion("bio_orgtype >=", value, "bioOrgtype");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeLessThan(String value) {
            addCriterion("bio_orgtype <", value, "bioOrgtype");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeLessThanOrEqualTo(String value) {
            addCriterion("bio_orgtype <=", value, "bioOrgtype");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeLike(String value) {
            addCriterion("bio_orgtype like", value, "bioOrgtype");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeNotLike(String value) {
            addCriterion("bio_orgtype not like", value, "bioOrgtype");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeIn(List<String> values) {
            addCriterion("bio_orgtype in", values, "bioOrgtype");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeNotIn(List<String> values) {
            addCriterion("bio_orgtype not in", values, "bioOrgtype");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeBetween(String value1, String value2) {
            addCriterion("bio_orgtype between", value1, value2, "bioOrgtype");
            return (Criteria) this;
        }

        public Criteria andBioOrgtypeNotBetween(String value1, String value2) {
            addCriterion("bio_orgtype not between", value1, value2, "bioOrgtype");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeIsNull() {
            addCriterion("cdg_regtype is null");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeIsNotNull() {
            addCriterion("cdg_regtype is not null");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeEqualTo(String value) {
            addCriterion("cdg_regtype =", value, "cdgRegtype");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeNotEqualTo(String value) {
            addCriterion("cdg_regtype <>", value, "cdgRegtype");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeGreaterThan(String value) {
            addCriterion("cdg_regtype >", value, "cdgRegtype");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeGreaterThanOrEqualTo(String value) {
            addCriterion("cdg_regtype >=", value, "cdgRegtype");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeLessThan(String value) {
            addCriterion("cdg_regtype <", value, "cdgRegtype");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeLessThanOrEqualTo(String value) {
            addCriterion("cdg_regtype <=", value, "cdgRegtype");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeLike(String value) {
            addCriterion("cdg_regtype like", value, "cdgRegtype");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeNotLike(String value) {
            addCriterion("cdg_regtype not like", value, "cdgRegtype");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeIn(List<String> values) {
            addCriterion("cdg_regtype in", values, "cdgRegtype");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeNotIn(List<String> values) {
            addCriterion("cdg_regtype not in", values, "cdgRegtype");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeBetween(String value1, String value2) {
            addCriterion("cdg_regtype between", value1, value2, "cdgRegtype");
            return (Criteria) this;
        }

        public Criteria andCdgRegtypeNotBetween(String value1, String value2) {
            addCriterion("cdg_regtype not between", value1, value2, "cdgRegtype");
            return (Criteria) this;
        }

        public Criteria andBioIndustryIsNull() {
            addCriterion("bio_industry is null");
            return (Criteria) this;
        }

        public Criteria andBioIndustryIsNotNull() {
            addCriterion("bio_industry is not null");
            return (Criteria) this;
        }

        public Criteria andBioIndustryEqualTo(String value) {
            addCriterion("bio_industry =", value, "bioIndustry");
            return (Criteria) this;
        }

        public Criteria andBioIndustryNotEqualTo(String value) {
            addCriterion("bio_industry <>", value, "bioIndustry");
            return (Criteria) this;
        }

        public Criteria andBioIndustryGreaterThan(String value) {
            addCriterion("bio_industry >", value, "bioIndustry");
            return (Criteria) this;
        }

        public Criteria andBioIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("bio_industry >=", value, "bioIndustry");
            return (Criteria) this;
        }

        public Criteria andBioIndustryLessThan(String value) {
            addCriterion("bio_industry <", value, "bioIndustry");
            return (Criteria) this;
        }

        public Criteria andBioIndustryLessThanOrEqualTo(String value) {
            addCriterion("bio_industry <=", value, "bioIndustry");
            return (Criteria) this;
        }

        public Criteria andBioIndustryLike(String value) {
            addCriterion("bio_industry like", value, "bioIndustry");
            return (Criteria) this;
        }

        public Criteria andBioIndustryNotLike(String value) {
            addCriterion("bio_industry not like", value, "bioIndustry");
            return (Criteria) this;
        }

        public Criteria andBioIndustryIn(List<String> values) {
            addCriterion("bio_industry in", values, "bioIndustry");
            return (Criteria) this;
        }

        public Criteria andBioIndustryNotIn(List<String> values) {
            addCriterion("bio_industry not in", values, "bioIndustry");
            return (Criteria) this;
        }

        public Criteria andBioIndustryBetween(String value1, String value2) {
            addCriterion("bio_industry between", value1, value2, "bioIndustry");
            return (Criteria) this;
        }

        public Criteria andBioIndustryNotBetween(String value1, String value2) {
            addCriterion("bio_industry not between", value1, value2, "bioIndustry");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeIsNull() {
            addCriterion("bio_rga_regioncode is null");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeIsNotNull() {
            addCriterion("bio_rga_regioncode is not null");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeEqualTo(String value) {
            addCriterion("bio_rga_regioncode =", value, "bioRgaRegioncode");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeNotEqualTo(String value) {
            addCriterion("bio_rga_regioncode <>", value, "bioRgaRegioncode");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeGreaterThan(String value) {
            addCriterion("bio_rga_regioncode >", value, "bioRgaRegioncode");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("bio_rga_regioncode >=", value, "bioRgaRegioncode");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeLessThan(String value) {
            addCriterion("bio_rga_regioncode <", value, "bioRgaRegioncode");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeLessThanOrEqualTo(String value) {
            addCriterion("bio_rga_regioncode <=", value, "bioRgaRegioncode");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeLike(String value) {
            addCriterion("bio_rga_regioncode like", value, "bioRgaRegioncode");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeNotLike(String value) {
            addCriterion("bio_rga_regioncode not like", value, "bioRgaRegioncode");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeIn(List<String> values) {
            addCriterion("bio_rga_regioncode in", values, "bioRgaRegioncode");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeNotIn(List<String> values) {
            addCriterion("bio_rga_regioncode not in", values, "bioRgaRegioncode");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeBetween(String value1, String value2) {
            addCriterion("bio_rga_regioncode between", value1, value2, "bioRgaRegioncode");
            return (Criteria) this;
        }

        public Criteria andBioRgaRegioncodeNotBetween(String value1, String value2) {
            addCriterion("bio_rga_regioncode not between", value1, value2, "bioRgaRegioncode");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeIsNull() {
            addCriterion("bio_bua_postcode is null");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeIsNotNull() {
            addCriterion("bio_bua_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeEqualTo(String value) {
            addCriterion("bio_bua_postcode =", value, "bioBuaPostcode");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeNotEqualTo(String value) {
            addCriterion("bio_bua_postcode <>", value, "bioBuaPostcode");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeGreaterThan(String value) {
            addCriterion("bio_bua_postcode >", value, "bioBuaPostcode");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bio_bua_postcode >=", value, "bioBuaPostcode");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeLessThan(String value) {
            addCriterion("bio_bua_postcode <", value, "bioBuaPostcode");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeLessThanOrEqualTo(String value) {
            addCriterion("bio_bua_postcode <=", value, "bioBuaPostcode");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeLike(String value) {
            addCriterion("bio_bua_postcode like", value, "bioBuaPostcode");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeNotLike(String value) {
            addCriterion("bio_bua_postcode not like", value, "bioBuaPostcode");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeIn(List<String> values) {
            addCriterion("bio_bua_postcode in", values, "bioBuaPostcode");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeNotIn(List<String> values) {
            addCriterion("bio_bua_postcode not in", values, "bioBuaPostcode");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeBetween(String value1, String value2) {
            addCriterion("bio_bua_postcode between", value1, value2, "bioBuaPostcode");
            return (Criteria) this;
        }

        public Criteria andBioBuaPostcodeNotBetween(String value1, String value2) {
            addCriterion("bio_bua_postcode not between", value1, value2, "bioBuaPostcode");
            return (Criteria) this;
        }

        public Criteria andBioConFaxIsNull() {
            addCriterion("bio_con_fax is null");
            return (Criteria) this;
        }

        public Criteria andBioConFaxIsNotNull() {
            addCriterion("bio_con_fax is not null");
            return (Criteria) this;
        }

        public Criteria andBioConFaxEqualTo(String value) {
            addCriterion("bio_con_fax =", value, "bioConFax");
            return (Criteria) this;
        }

        public Criteria andBioConFaxNotEqualTo(String value) {
            addCriterion("bio_con_fax <>", value, "bioConFax");
            return (Criteria) this;
        }

        public Criteria andBioConFaxGreaterThan(String value) {
            addCriterion("bio_con_fax >", value, "bioConFax");
            return (Criteria) this;
        }

        public Criteria andBioConFaxGreaterThanOrEqualTo(String value) {
            addCriterion("bio_con_fax >=", value, "bioConFax");
            return (Criteria) this;
        }

        public Criteria andBioConFaxLessThan(String value) {
            addCriterion("bio_con_fax <", value, "bioConFax");
            return (Criteria) this;
        }

        public Criteria andBioConFaxLessThanOrEqualTo(String value) {
            addCriterion("bio_con_fax <=", value, "bioConFax");
            return (Criteria) this;
        }

        public Criteria andBioConFaxLike(String value) {
            addCriterion("bio_con_fax like", value, "bioConFax");
            return (Criteria) this;
        }

        public Criteria andBioConFaxNotLike(String value) {
            addCriterion("bio_con_fax not like", value, "bioConFax");
            return (Criteria) this;
        }

        public Criteria andBioConFaxIn(List<String> values) {
            addCriterion("bio_con_fax in", values, "bioConFax");
            return (Criteria) this;
        }

        public Criteria andBioConFaxNotIn(List<String> values) {
            addCriterion("bio_con_fax not in", values, "bioConFax");
            return (Criteria) this;
        }

        public Criteria andBioConFaxBetween(String value1, String value2) {
            addCriterion("bio_con_fax between", value1, value2, "bioConFax");
            return (Criteria) this;
        }

        public Criteria andBioConFaxNotBetween(String value1, String value2) {
            addCriterion("bio_con_fax not between", value1, value2, "bioConFax");
            return (Criteria) this;
        }

        public Criteria andBioConMailIsNull() {
            addCriterion("bio_con_mail is null");
            return (Criteria) this;
        }

        public Criteria andBioConMailIsNotNull() {
            addCriterion("bio_con_mail is not null");
            return (Criteria) this;
        }

        public Criteria andBioConMailEqualTo(String value) {
            addCriterion("bio_con_mail =", value, "bioConMail");
            return (Criteria) this;
        }

        public Criteria andBioConMailNotEqualTo(String value) {
            addCriterion("bio_con_mail <>", value, "bioConMail");
            return (Criteria) this;
        }

        public Criteria andBioConMailGreaterThan(String value) {
            addCriterion("bio_con_mail >", value, "bioConMail");
            return (Criteria) this;
        }

        public Criteria andBioConMailGreaterThanOrEqualTo(String value) {
            addCriterion("bio_con_mail >=", value, "bioConMail");
            return (Criteria) this;
        }

        public Criteria andBioConMailLessThan(String value) {
            addCriterion("bio_con_mail <", value, "bioConMail");
            return (Criteria) this;
        }

        public Criteria andBioConMailLessThanOrEqualTo(String value) {
            addCriterion("bio_con_mail <=", value, "bioConMail");
            return (Criteria) this;
        }

        public Criteria andBioConMailLike(String value) {
            addCriterion("bio_con_mail like", value, "bioConMail");
            return (Criteria) this;
        }

        public Criteria andBioConMailNotLike(String value) {
            addCriterion("bio_con_mail not like", value, "bioConMail");
            return (Criteria) this;
        }

        public Criteria andBioConMailIn(List<String> values) {
            addCriterion("bio_con_mail in", values, "bioConMail");
            return (Criteria) this;
        }

        public Criteria andBioConMailNotIn(List<String> values) {
            addCriterion("bio_con_mail not in", values, "bioConMail");
            return (Criteria) this;
        }

        public Criteria andBioConMailBetween(String value1, String value2) {
            addCriterion("bio_con_mail between", value1, value2, "bioConMail");
            return (Criteria) this;
        }

        public Criteria andBioConMailNotBetween(String value1, String value2) {
            addCriterion("bio_con_mail not between", value1, value2, "bioConMail");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressIsNull() {
            addCriterion("bio_bua_address is null");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressIsNotNull() {
            addCriterion("bio_bua_address is not null");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressEqualTo(String value) {
            addCriterion("bio_bua_address =", value, "bioBuaAddress");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressNotEqualTo(String value) {
            addCriterion("bio_bua_address <>", value, "bioBuaAddress");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressGreaterThan(String value) {
            addCriterion("bio_bua_address >", value, "bioBuaAddress");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bio_bua_address >=", value, "bioBuaAddress");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressLessThan(String value) {
            addCriterion("bio_bua_address <", value, "bioBuaAddress");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressLessThanOrEqualTo(String value) {
            addCriterion("bio_bua_address <=", value, "bioBuaAddress");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressLike(String value) {
            addCriterion("bio_bua_address like", value, "bioBuaAddress");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressNotLike(String value) {
            addCriterion("bio_bua_address not like", value, "bioBuaAddress");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressIn(List<String> values) {
            addCriterion("bio_bua_address in", values, "bioBuaAddress");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressNotIn(List<String> values) {
            addCriterion("bio_bua_address not in", values, "bioBuaAddress");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressBetween(String value1, String value2) {
            addCriterion("bio_bua_address between", value1, value2, "bioBuaAddress");
            return (Criteria) this;
        }

        public Criteria andBioBuaAddressNotBetween(String value1, String value2) {
            addCriterion("bio_bua_address not between", value1, value2, "bioBuaAddress");
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