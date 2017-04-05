package com.yingjun.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class DictshopcodetbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DictshopcodetbExample() {
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

        public Criteria andDictshopcodetbIdIsNull() {
            addCriterion("dictshopcodetb_id is null");
            return (Criteria) this;
        }

        public Criteria andDictshopcodetbIdIsNotNull() {
            addCriterion("dictshopcodetb_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictshopcodetbIdEqualTo(Long value) {
            addCriterion("dictshopcodetb_id =", value, "dictshopcodetbId");
            return (Criteria) this;
        }

        public Criteria andDictshopcodetbIdNotEqualTo(Long value) {
            addCriterion("dictshopcodetb_id <>", value, "dictshopcodetbId");
            return (Criteria) this;
        }

        public Criteria andDictshopcodetbIdGreaterThan(Long value) {
            addCriterion("dictshopcodetb_id >", value, "dictshopcodetbId");
            return (Criteria) this;
        }

        public Criteria andDictshopcodetbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dictshopcodetb_id >=", value, "dictshopcodetbId");
            return (Criteria) this;
        }

        public Criteria andDictshopcodetbIdLessThan(Long value) {
            addCriterion("dictshopcodetb_id <", value, "dictshopcodetbId");
            return (Criteria) this;
        }

        public Criteria andDictshopcodetbIdLessThanOrEqualTo(Long value) {
            addCriterion("dictshopcodetb_id <=", value, "dictshopcodetbId");
            return (Criteria) this;
        }

        public Criteria andDictshopcodetbIdIn(List<Long> values) {
            addCriterion("dictshopcodetb_id in", values, "dictshopcodetbId");
            return (Criteria) this;
        }

        public Criteria andDictshopcodetbIdNotIn(List<Long> values) {
            addCriterion("dictshopcodetb_id not in", values, "dictshopcodetbId");
            return (Criteria) this;
        }

        public Criteria andDictshopcodetbIdBetween(Long value1, Long value2) {
            addCriterion("dictshopcodetb_id between", value1, value2, "dictshopcodetbId");
            return (Criteria) this;
        }

        public Criteria andDictshopcodetbIdNotBetween(Long value1, Long value2) {
            addCriterion("dictshopcodetb_id not between", value1, value2, "dictshopcodetbId");
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

        public Criteria andShopnameIsNull() {
            addCriterion("shopname is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopname is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopname =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopname <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopname >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopname >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopname <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopname <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopname like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopname not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopname in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopname not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopname between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopname not between", value1, value2, "shopname");
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