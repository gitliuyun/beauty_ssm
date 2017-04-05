package com.yingjun.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class BiwhitecardinfotbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BiwhitecardinfotbExample() {
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

        public Criteria andBiwhitecardinfotbIdIsNull() {
            addCriterion("biwhitecardinfotb_id is null");
            return (Criteria) this;
        }

        public Criteria andBiwhitecardinfotbIdIsNotNull() {
            addCriterion("biwhitecardinfotb_id is not null");
            return (Criteria) this;
        }

        public Criteria andBiwhitecardinfotbIdEqualTo(Long value) {
            addCriterion("biwhitecardinfotb_id =", value, "biwhitecardinfotbId");
            return (Criteria) this;
        }

        public Criteria andBiwhitecardinfotbIdNotEqualTo(Long value) {
            addCriterion("biwhitecardinfotb_id <>", value, "biwhitecardinfotbId");
            return (Criteria) this;
        }

        public Criteria andBiwhitecardinfotbIdGreaterThan(Long value) {
            addCriterion("biwhitecardinfotb_id >", value, "biwhitecardinfotbId");
            return (Criteria) this;
        }

        public Criteria andBiwhitecardinfotbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("biwhitecardinfotb_id >=", value, "biwhitecardinfotbId");
            return (Criteria) this;
        }

        public Criteria andBiwhitecardinfotbIdLessThan(Long value) {
            addCriterion("biwhitecardinfotb_id <", value, "biwhitecardinfotbId");
            return (Criteria) this;
        }

        public Criteria andBiwhitecardinfotbIdLessThanOrEqualTo(Long value) {
            addCriterion("biwhitecardinfotb_id <=", value, "biwhitecardinfotbId");
            return (Criteria) this;
        }

        public Criteria andBiwhitecardinfotbIdIn(List<Long> values) {
            addCriterion("biwhitecardinfotb_id in", values, "biwhitecardinfotbId");
            return (Criteria) this;
        }

        public Criteria andBiwhitecardinfotbIdNotIn(List<Long> values) {
            addCriterion("biwhitecardinfotb_id not in", values, "biwhitecardinfotbId");
            return (Criteria) this;
        }

        public Criteria andBiwhitecardinfotbIdBetween(Long value1, Long value2) {
            addCriterion("biwhitecardinfotb_id between", value1, value2, "biwhitecardinfotbId");
            return (Criteria) this;
        }

        public Criteria andBiwhitecardinfotbIdNotBetween(Long value1, Long value2) {
            addCriterion("biwhitecardinfotb_id not between", value1, value2, "biwhitecardinfotbId");
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