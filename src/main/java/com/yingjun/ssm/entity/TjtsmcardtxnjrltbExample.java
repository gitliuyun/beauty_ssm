package com.yingjun.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class TjtsmcardtxnjrltbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TjtsmcardtxnjrltbExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andTjtsmcardtxnjrltbIdIsNull() {
            addCriterion("tjtsmcardtxnjrltb_id is null");
            return (Criteria) this;
        }

        public Criteria andTjtsmcardtxnjrltbIdIsNotNull() {
            addCriterion("tjtsmcardtxnjrltb_id is not null");
            return (Criteria) this;
        }

        public Criteria andTjtsmcardtxnjrltbIdEqualTo(Long value) {
            addCriterion("tjtsmcardtxnjrltb_id =", value, "tjtsmcardtxnjrltbId");
            return (Criteria) this;
        }

        public Criteria andTjtsmcardtxnjrltbIdNotEqualTo(Long value) {
            addCriterion("tjtsmcardtxnjrltb_id <>", value, "tjtsmcardtxnjrltbId");
            return (Criteria) this;
        }

        public Criteria andTjtsmcardtxnjrltbIdGreaterThan(Long value) {
            addCriterion("tjtsmcardtxnjrltb_id >", value, "tjtsmcardtxnjrltbId");
            return (Criteria) this;
        }

        public Criteria andTjtsmcardtxnjrltbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tjtsmcardtxnjrltb_id >=", value, "tjtsmcardtxnjrltbId");
            return (Criteria) this;
        }

        public Criteria andTjtsmcardtxnjrltbIdLessThan(Long value) {
            addCriterion("tjtsmcardtxnjrltb_id <", value, "tjtsmcardtxnjrltbId");
            return (Criteria) this;
        }

        public Criteria andTjtsmcardtxnjrltbIdLessThanOrEqualTo(Long value) {
            addCriterion("tjtsmcardtxnjrltb_id <=", value, "tjtsmcardtxnjrltbId");
            return (Criteria) this;
        }

        public Criteria andTjtsmcardtxnjrltbIdIn(List<Long> values) {
            addCriterion("tjtsmcardtxnjrltb_id in", values, "tjtsmcardtxnjrltbId");
            return (Criteria) this;
        }

        public Criteria andTjtsmcardtxnjrltbIdNotIn(List<Long> values) {
            addCriterion("tjtsmcardtxnjrltb_id not in", values, "tjtsmcardtxnjrltbId");
            return (Criteria) this;
        }

        public Criteria andTjtsmcardtxnjrltbIdBetween(Long value1, Long value2) {
            addCriterion("tjtsmcardtxnjrltb_id between", value1, value2, "tjtsmcardtxnjrltbId");
            return (Criteria) this;
        }

        public Criteria andTjtsmcardtxnjrltbIdNotBetween(Long value1, Long value2) {
            addCriterion("tjtsmcardtxnjrltb_id not between", value1, value2, "tjtsmcardtxnjrltbId");
            return (Criteria) this;
        }

        public Criteria andFileidIsNull() {
            addCriterion("fileid is null");
            return (Criteria) this;
        }

        public Criteria andFileidIsNotNull() {
            addCriterion("fileid is not null");
            return (Criteria) this;
        }

        public Criteria andFileidEqualTo(String value) {
            addCriterion("fileid =", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotEqualTo(String value) {
            addCriterion("fileid <>", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThan(String value) {
            addCriterion("fileid >", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThanOrEqualTo(String value) {
            addCriterion("fileid >=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThan(String value) {
            addCriterion("fileid <", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThanOrEqualTo(String value) {
            addCriterion("fileid <=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLike(String value) {
            addCriterion("fileid like", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotLike(String value) {
            addCriterion("fileid not like", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidIn(List<String> values) {
            addCriterion("fileid in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotIn(List<String> values) {
            addCriterion("fileid not in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidBetween(String value1, String value2) {
            addCriterion("fileid between", value1, value2, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotBetween(String value1, String value2) {
            addCriterion("fileid not between", value1, value2, "fileid");
            return (Criteria) this;
        }

        public Criteria andFilenoIsNull() {
            addCriterion("fileno is null");
            return (Criteria) this;
        }

        public Criteria andFilenoIsNotNull() {
            addCriterion("fileno is not null");
            return (Criteria) this;
        }

        public Criteria andFilenoEqualTo(String value) {
            addCriterion("fileno =", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoNotEqualTo(String value) {
            addCriterion("fileno <>", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoGreaterThan(String value) {
            addCriterion("fileno >", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoGreaterThanOrEqualTo(String value) {
            addCriterion("fileno >=", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoLessThan(String value) {
            addCriterion("fileno <", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoLessThanOrEqualTo(String value) {
            addCriterion("fileno <=", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoLike(String value) {
            addCriterion("fileno like", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoNotLike(String value) {
            addCriterion("fileno not like", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoIn(List<String> values) {
            addCriterion("fileno in", values, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoNotIn(List<String> values) {
            addCriterion("fileno not in", values, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoBetween(String value1, String value2) {
            addCriterion("fileno between", value1, value2, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoNotBetween(String value1, String value2) {
            addCriterion("fileno not between", value1, value2, "fileno");
            return (Criteria) this;
        }

        public Criteria andUnitnoIsNull() {
            addCriterion("unitno is null");
            return (Criteria) this;
        }

        public Criteria andUnitnoIsNotNull() {
            addCriterion("unitno is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnoEqualTo(String value) {
            addCriterion("unitno =", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoNotEqualTo(String value) {
            addCriterion("unitno <>", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoGreaterThan(String value) {
            addCriterion("unitno >", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoGreaterThanOrEqualTo(String value) {
            addCriterion("unitno >=", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoLessThan(String value) {
            addCriterion("unitno <", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoLessThanOrEqualTo(String value) {
            addCriterion("unitno <=", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoLike(String value) {
            addCriterion("unitno like", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoNotLike(String value) {
            addCriterion("unitno not like", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoIn(List<String> values) {
            addCriterion("unitno in", values, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoNotIn(List<String> values) {
            addCriterion("unitno not in", values, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoBetween(String value1, String value2) {
            addCriterion("unitno between", value1, value2, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoNotBetween(String value1, String value2) {
            addCriterion("unitno not between", value1, value2, "unitno");
            return (Criteria) this;
        }

        public Criteria andFileverIsNull() {
            addCriterion("filever is null");
            return (Criteria) this;
        }

        public Criteria andFileverIsNotNull() {
            addCriterion("filever is not null");
            return (Criteria) this;
        }

        public Criteria andFileverEqualTo(String value) {
            addCriterion("filever =", value, "filever");
            return (Criteria) this;
        }

        public Criteria andFileverNotEqualTo(String value) {
            addCriterion("filever <>", value, "filever");
            return (Criteria) this;
        }

        public Criteria andFileverGreaterThan(String value) {
            addCriterion("filever >", value, "filever");
            return (Criteria) this;
        }

        public Criteria andFileverGreaterThanOrEqualTo(String value) {
            addCriterion("filever >=", value, "filever");
            return (Criteria) this;
        }

        public Criteria andFileverLessThan(String value) {
            addCriterion("filever <", value, "filever");
            return (Criteria) this;
        }

        public Criteria andFileverLessThanOrEqualTo(String value) {
            addCriterion("filever <=", value, "filever");
            return (Criteria) this;
        }

        public Criteria andFileverLike(String value) {
            addCriterion("filever like", value, "filever");
            return (Criteria) this;
        }

        public Criteria andFileverNotLike(String value) {
            addCriterion("filever not like", value, "filever");
            return (Criteria) this;
        }

        public Criteria andFileverIn(List<String> values) {
            addCriterion("filever in", values, "filever");
            return (Criteria) this;
        }

        public Criteria andFileverNotIn(List<String> values) {
            addCriterion("filever not in", values, "filever");
            return (Criteria) this;
        }

        public Criteria andFileverBetween(String value1, String value2) {
            addCriterion("filever between", value1, value2, "filever");
            return (Criteria) this;
        }

        public Criteria andFileverNotBetween(String value1, String value2) {
            addCriterion("filever not between", value1, value2, "filever");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("birthdate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(String value) {
            addCriterion("birthdate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(String value) {
            addCriterion("birthdate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(String value) {
            addCriterion("birthdate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("birthdate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(String value) {
            addCriterion("birthdate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(String value) {
            addCriterion("birthdate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLike(String value) {
            addCriterion("birthdate like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotLike(String value) {
            addCriterion("birthdate not like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<String> values) {
            addCriterion("birthdate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<String> values) {
            addCriterion("birthdate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(String value1, String value2) {
            addCriterion("birthdate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(String value1, String value2) {
            addCriterion("birthdate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("cardno is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("cardno is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("cardno =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("cardno <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("cardno >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("cardno >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("cardno <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("cardno <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("cardno like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("cardno not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("cardno in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("cardno not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("cardno between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("cardno not between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNull() {
            addCriterion("cardtype is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNotNull() {
            addCriterion("cardtype is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeEqualTo(String value) {
            addCriterion("cardtype =", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotEqualTo(String value) {
            addCriterion("cardtype <>", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThan(String value) {
            addCriterion("cardtype >", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("cardtype >=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThan(String value) {
            addCriterion("cardtype <", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThanOrEqualTo(String value) {
            addCriterion("cardtype <=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLike(String value) {
            addCriterion("cardtype like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotLike(String value) {
            addCriterion("cardtype not like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeIn(List<String> values) {
            addCriterion("cardtype in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotIn(List<String> values) {
            addCriterion("cardtype not in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeBetween(String value1, String value2) {
            addCriterion("cardtype between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotBetween(String value1, String value2) {
            addCriterion("cardtype not between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNull() {
            addCriterion("transdate is null");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNotNull() {
            addCriterion("transdate is not null");
            return (Criteria) this;
        }

        public Criteria andTransdateEqualTo(String value) {
            addCriterion("transdate =", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotEqualTo(String value) {
            addCriterion("transdate <>", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThan(String value) {
            addCriterion("transdate >", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThanOrEqualTo(String value) {
            addCriterion("transdate >=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThan(String value) {
            addCriterion("transdate <", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThanOrEqualTo(String value) {
            addCriterion("transdate <=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLike(String value) {
            addCriterion("transdate like", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotLike(String value) {
            addCriterion("transdate not like", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateIn(List<String> values) {
            addCriterion("transdate in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotIn(List<String> values) {
            addCriterion("transdate not in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateBetween(String value1, String value2) {
            addCriterion("transdate between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotBetween(String value1, String value2) {
            addCriterion("transdate not between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNull() {
            addCriterion("transtype is null");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNotNull() {
            addCriterion("transtype is not null");
            return (Criteria) this;
        }

        public Criteria andTranstypeEqualTo(String value) {
            addCriterion("transtype =", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotEqualTo(String value) {
            addCriterion("transtype <>", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThan(String value) {
            addCriterion("transtype >", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThanOrEqualTo(String value) {
            addCriterion("transtype >=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThan(String value) {
            addCriterion("transtype <", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThanOrEqualTo(String value) {
            addCriterion("transtype <=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLike(String value) {
            addCriterion("transtype like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotLike(String value) {
            addCriterion("transtype not like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeIn(List<String> values) {
            addCriterion("transtype in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotIn(List<String> values) {
            addCriterion("transtype not in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeBetween(String value1, String value2) {
            addCriterion("transtype between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotBetween(String value1, String value2) {
            addCriterion("transtype not between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNull() {
            addCriterion("totalnum is null");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNotNull() {
            addCriterion("totalnum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalnumEqualTo(Integer value) {
            addCriterion("totalnum =", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotEqualTo(Integer value) {
            addCriterion("totalnum <>", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThan(Integer value) {
            addCriterion("totalnum >", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalnum >=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThan(Integer value) {
            addCriterion("totalnum <", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThanOrEqualTo(Integer value) {
            addCriterion("totalnum <=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumIn(List<Integer> values) {
            addCriterion("totalnum in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotIn(List<Integer> values) {
            addCriterion("totalnum not in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumBetween(Integer value1, Integer value2) {
            addCriterion("totalnum between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotBetween(Integer value1, Integer value2) {
            addCriterion("totalnum not between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalsumIsNull() {
            addCriterion("totalsum is null");
            return (Criteria) this;
        }

        public Criteria andTotalsumIsNotNull() {
            addCriterion("totalsum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsumEqualTo(Integer value) {
            addCriterion("totalsum =", value, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumNotEqualTo(Integer value) {
            addCriterion("totalsum <>", value, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumGreaterThan(Integer value) {
            addCriterion("totalsum >", value, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalsum >=", value, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumLessThan(Integer value) {
            addCriterion("totalsum <", value, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumLessThanOrEqualTo(Integer value) {
            addCriterion("totalsum <=", value, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumIn(List<Integer> values) {
            addCriterion("totalsum in", values, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumNotIn(List<Integer> values) {
            addCriterion("totalsum not in", values, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumBetween(Integer value1, Integer value2) {
            addCriterion("totalsum between", value1, value2, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumNotBetween(Integer value1, Integer value2) {
            addCriterion("totalsum not between", value1, value2, "totalsum");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeIsNull() {
            addCriterion("industrycode is null");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeIsNotNull() {
            addCriterion("industrycode is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeEqualTo(String value) {
            addCriterion("industrycode =", value, "industrycode");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeNotEqualTo(String value) {
            addCriterion("industrycode <>", value, "industrycode");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeGreaterThan(String value) {
            addCriterion("industrycode >", value, "industrycode");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("industrycode >=", value, "industrycode");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeLessThan(String value) {
            addCriterion("industrycode <", value, "industrycode");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeLessThanOrEqualTo(String value) {
            addCriterion("industrycode <=", value, "industrycode");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeLike(String value) {
            addCriterion("industrycode like", value, "industrycode");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeNotLike(String value) {
            addCriterion("industrycode not like", value, "industrycode");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeIn(List<String> values) {
            addCriterion("industrycode in", values, "industrycode");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeNotIn(List<String> values) {
            addCriterion("industrycode not in", values, "industrycode");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeBetween(String value1, String value2) {
            addCriterion("industrycode between", value1, value2, "industrycode");
            return (Criteria) this;
        }

        public Criteria andIndustrycodeNotBetween(String value1, String value2) {
            addCriterion("industrycode not between", value1, value2, "industrycode");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNull() {
            addCriterion("unitid is null");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNotNull() {
            addCriterion("unitid is not null");
            return (Criteria) this;
        }

        public Criteria andUnitidEqualTo(String value) {
            addCriterion("unitid =", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotEqualTo(String value) {
            addCriterion("unitid <>", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThan(String value) {
            addCriterion("unitid >", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThanOrEqualTo(String value) {
            addCriterion("unitid >=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThan(String value) {
            addCriterion("unitid <", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThanOrEqualTo(String value) {
            addCriterion("unitid <=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLike(String value) {
            addCriterion("unitid like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotLike(String value) {
            addCriterion("unitid not like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidIn(List<String> values) {
            addCriterion("unitid in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotIn(List<String> values) {
            addCriterion("unitid not in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidBetween(String value1, String value2) {
            addCriterion("unitid between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotBetween(String value1, String value2) {
            addCriterion("unitid not between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andShopnoIsNull() {
            addCriterion("shopno is null");
            return (Criteria) this;
        }

        public Criteria andShopnoIsNotNull() {
            addCriterion("shopno is not null");
            return (Criteria) this;
        }

        public Criteria andShopnoEqualTo(String value) {
            addCriterion("shopno =", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoNotEqualTo(String value) {
            addCriterion("shopno <>", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoGreaterThan(String value) {
            addCriterion("shopno >", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoGreaterThanOrEqualTo(String value) {
            addCriterion("shopno >=", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoLessThan(String value) {
            addCriterion("shopno <", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoLessThanOrEqualTo(String value) {
            addCriterion("shopno <=", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoLike(String value) {
            addCriterion("shopno like", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoNotLike(String value) {
            addCriterion("shopno not like", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoIn(List<String> values) {
            addCriterion("shopno in", values, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoNotIn(List<String> values) {
            addCriterion("shopno not in", values, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoBetween(String value1, String value2) {
            addCriterion("shopno between", value1, value2, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoNotBetween(String value1, String value2) {
            addCriterion("shopno not between", value1, value2, "shopno");
            return (Criteria) this;
        }

        public Criteria andKktypeIsNull() {
            addCriterion("kktype is null");
            return (Criteria) this;
        }

        public Criteria andKktypeIsNotNull() {
            addCriterion("kktype is not null");
            return (Criteria) this;
        }

        public Criteria andKktypeEqualTo(String value) {
            addCriterion("kktype =", value, "kktype");
            return (Criteria) this;
        }

        public Criteria andKktypeNotEqualTo(String value) {
            addCriterion("kktype <>", value, "kktype");
            return (Criteria) this;
        }

        public Criteria andKktypeGreaterThan(String value) {
            addCriterion("kktype >", value, "kktype");
            return (Criteria) this;
        }

        public Criteria andKktypeGreaterThanOrEqualTo(String value) {
            addCriterion("kktype >=", value, "kktype");
            return (Criteria) this;
        }

        public Criteria andKktypeLessThan(String value) {
            addCriterion("kktype <", value, "kktype");
            return (Criteria) this;
        }

        public Criteria andKktypeLessThanOrEqualTo(String value) {
            addCriterion("kktype <=", value, "kktype");
            return (Criteria) this;
        }

        public Criteria andKktypeLike(String value) {
            addCriterion("kktype like", value, "kktype");
            return (Criteria) this;
        }

        public Criteria andKktypeNotLike(String value) {
            addCriterion("kktype not like", value, "kktype");
            return (Criteria) this;
        }

        public Criteria andKktypeIn(List<String> values) {
            addCriterion("kktype in", values, "kktype");
            return (Criteria) this;
        }

        public Criteria andKktypeNotIn(List<String> values) {
            addCriterion("kktype not in", values, "kktype");
            return (Criteria) this;
        }

        public Criteria andKktypeBetween(String value1, String value2) {
            addCriterion("kktype between", value1, value2, "kktype");
            return (Criteria) this;
        }

        public Criteria andKktypeNotBetween(String value1, String value2) {
            addCriterion("kktype not between", value1, value2, "kktype");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNull() {
            addCriterion("unitcode is null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNotNull() {
            addCriterion("unitcode is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeEqualTo(String value) {
            addCriterion("unitcode =", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotEqualTo(String value) {
            addCriterion("unitcode <>", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThan(String value) {
            addCriterion("unitcode >", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("unitcode >=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThan(String value) {
            addCriterion("unitcode <", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThanOrEqualTo(String value) {
            addCriterion("unitcode <=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLike(String value) {
            addCriterion("unitcode like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotLike(String value) {
            addCriterion("unitcode not like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIn(List<String> values) {
            addCriterion("unitcode in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotIn(List<String> values) {
            addCriterion("unitcode not in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeBetween(String value1, String value2) {
            addCriterion("unitcode between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotBetween(String value1, String value2) {
            addCriterion("unitcode not between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNull() {
            addCriterion("mobileno is null");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNotNull() {
            addCriterion("mobileno is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenoEqualTo(String value) {
            addCriterion("mobileno =", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotEqualTo(String value) {
            addCriterion("mobileno <>", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThan(String value) {
            addCriterion("mobileno >", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("mobileno >=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThan(String value) {
            addCriterion("mobileno <", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThanOrEqualTo(String value) {
            addCriterion("mobileno <=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLike(String value) {
            addCriterion("mobileno like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotLike(String value) {
            addCriterion("mobileno not like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoIn(List<String> values) {
            addCriterion("mobileno in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotIn(List<String> values) {
            addCriterion("mobileno not in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoBetween(String value1, String value2) {
            addCriterion("mobileno between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotBetween(String value1, String value2) {
            addCriterion("mobileno not between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andProductcompanyIsNull() {
            addCriterion("productcompany is null");
            return (Criteria) this;
        }

        public Criteria andProductcompanyIsNotNull() {
            addCriterion("productcompany is not null");
            return (Criteria) this;
        }

        public Criteria andProductcompanyEqualTo(String value) {
            addCriterion("productcompany =", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyNotEqualTo(String value) {
            addCriterion("productcompany <>", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyGreaterThan(String value) {
            addCriterion("productcompany >", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("productcompany >=", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyLessThan(String value) {
            addCriterion("productcompany <", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyLessThanOrEqualTo(String value) {
            addCriterion("productcompany <=", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyLike(String value) {
            addCriterion("productcompany like", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyNotLike(String value) {
            addCriterion("productcompany not like", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyIn(List<String> values) {
            addCriterion("productcompany in", values, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyNotIn(List<String> values) {
            addCriterion("productcompany not in", values, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyBetween(String value1, String value2) {
            addCriterion("productcompany between", value1, value2, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyNotBetween(String value1, String value2) {
            addCriterion("productcompany not between", value1, value2, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductmodelIsNull() {
            addCriterion("productmodel is null");
            return (Criteria) this;
        }

        public Criteria andProductmodelIsNotNull() {
            addCriterion("productmodel is not null");
            return (Criteria) this;
        }

        public Criteria andProductmodelEqualTo(String value) {
            addCriterion("productmodel =", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelNotEqualTo(String value) {
            addCriterion("productmodel <>", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelGreaterThan(String value) {
            addCriterion("productmodel >", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelGreaterThanOrEqualTo(String value) {
            addCriterion("productmodel >=", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelLessThan(String value) {
            addCriterion("productmodel <", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelLessThanOrEqualTo(String value) {
            addCriterion("productmodel <=", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelLike(String value) {
            addCriterion("productmodel like", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelNotLike(String value) {
            addCriterion("productmodel not like", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelIn(List<String> values) {
            addCriterion("productmodel in", values, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelNotIn(List<String> values) {
            addCriterion("productmodel not in", values, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelBetween(String value1, String value2) {
            addCriterion("productmodel between", value1, value2, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelNotBetween(String value1, String value2) {
            addCriterion("productmodel not between", value1, value2, "productmodel");
            return (Criteria) this;
        }

        public Criteria andRsvdIsNull() {
            addCriterion("rsvd is null");
            return (Criteria) this;
        }

        public Criteria andRsvdIsNotNull() {
            addCriterion("rsvd is not null");
            return (Criteria) this;
        }

        public Criteria andRsvdEqualTo(String value) {
            addCriterion("rsvd =", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdNotEqualTo(String value) {
            addCriterion("rsvd <>", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdGreaterThan(String value) {
            addCriterion("rsvd >", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdGreaterThanOrEqualTo(String value) {
            addCriterion("rsvd >=", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdLessThan(String value) {
            addCriterion("rsvd <", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdLessThanOrEqualTo(String value) {
            addCriterion("rsvd <=", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdLike(String value) {
            addCriterion("rsvd like", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdNotLike(String value) {
            addCriterion("rsvd not like", value, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdIn(List<String> values) {
            addCriterion("rsvd in", values, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdNotIn(List<String> values) {
            addCriterion("rsvd not in", values, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdBetween(String value1, String value2) {
            addCriterion("rsvd between", value1, value2, "rsvd");
            return (Criteria) this;
        }

        public Criteria andRsvdNotBetween(String value1, String value2) {
            addCriterion("rsvd not between", value1, value2, "rsvd");
            return (Criteria) this;
        }
    }

    /**
     */
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