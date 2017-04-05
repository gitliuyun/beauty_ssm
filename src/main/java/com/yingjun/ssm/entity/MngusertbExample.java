package com.yingjun.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class MngusertbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MngusertbExample() {
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

        public Criteria andMngusertbIdIsNull() {
            addCriterion("mngusertb_id is null");
            return (Criteria) this;
        }

        public Criteria andMngusertbIdIsNotNull() {
            addCriterion("mngusertb_id is not null");
            return (Criteria) this;
        }

        public Criteria andMngusertbIdEqualTo(Long value) {
            addCriterion("mngusertb_id =", value, "mngusertbId");
            return (Criteria) this;
        }

        public Criteria andMngusertbIdNotEqualTo(Long value) {
            addCriterion("mngusertb_id <>", value, "mngusertbId");
            return (Criteria) this;
        }

        public Criteria andMngusertbIdGreaterThan(Long value) {
            addCriterion("mngusertb_id >", value, "mngusertbId");
            return (Criteria) this;
        }

        public Criteria andMngusertbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mngusertb_id >=", value, "mngusertbId");
            return (Criteria) this;
        }

        public Criteria andMngusertbIdLessThan(Long value) {
            addCriterion("mngusertb_id <", value, "mngusertbId");
            return (Criteria) this;
        }

        public Criteria andMngusertbIdLessThanOrEqualTo(Long value) {
            addCriterion("mngusertb_id <=", value, "mngusertbId");
            return (Criteria) this;
        }

        public Criteria andMngusertbIdIn(List<Long> values) {
            addCriterion("mngusertb_id in", values, "mngusertbId");
            return (Criteria) this;
        }

        public Criteria andMngusertbIdNotIn(List<Long> values) {
            addCriterion("mngusertb_id not in", values, "mngusertbId");
            return (Criteria) this;
        }

        public Criteria andMngusertbIdBetween(Long value1, Long value2) {
            addCriterion("mngusertb_id between", value1, value2, "mngusertbId");
            return (Criteria) this;
        }

        public Criteria andMngusertbIdNotBetween(Long value1, Long value2) {
            addCriterion("mngusertb_id not between", value1, value2, "mngusertbId");
            return (Criteria) this;
        }

        public Criteria andSystemidIsNull() {
            addCriterion("systemid is null");
            return (Criteria) this;
        }

        public Criteria andSystemidIsNotNull() {
            addCriterion("systemid is not null");
            return (Criteria) this;
        }

        public Criteria andSystemidEqualTo(String value) {
            addCriterion("systemid =", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotEqualTo(String value) {
            addCriterion("systemid <>", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidGreaterThan(String value) {
            addCriterion("systemid >", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidGreaterThanOrEqualTo(String value) {
            addCriterion("systemid >=", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLessThan(String value) {
            addCriterion("systemid <", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLessThanOrEqualTo(String value) {
            addCriterion("systemid <=", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLike(String value) {
            addCriterion("systemid like", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotLike(String value) {
            addCriterion("systemid not like", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidIn(List<String> values) {
            addCriterion("systemid in", values, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotIn(List<String> values) {
            addCriterion("systemid not in", values, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidBetween(String value1, String value2) {
            addCriterion("systemid between", value1, value2, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotBetween(String value1, String value2) {
            addCriterion("systemid not between", value1, value2, "systemid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andGardeIsNull() {
            addCriterion("garde is null");
            return (Criteria) this;
        }

        public Criteria andGardeIsNotNull() {
            addCriterion("garde is not null");
            return (Criteria) this;
        }

        public Criteria andGardeEqualTo(Integer value) {
            addCriterion("garde =", value, "garde");
            return (Criteria) this;
        }

        public Criteria andGardeNotEqualTo(Integer value) {
            addCriterion("garde <>", value, "garde");
            return (Criteria) this;
        }

        public Criteria andGardeGreaterThan(Integer value) {
            addCriterion("garde >", value, "garde");
            return (Criteria) this;
        }

        public Criteria andGardeGreaterThanOrEqualTo(Integer value) {
            addCriterion("garde >=", value, "garde");
            return (Criteria) this;
        }

        public Criteria andGardeLessThan(Integer value) {
            addCriterion("garde <", value, "garde");
            return (Criteria) this;
        }

        public Criteria andGardeLessThanOrEqualTo(Integer value) {
            addCriterion("garde <=", value, "garde");
            return (Criteria) this;
        }

        public Criteria andGardeIn(List<Integer> values) {
            addCriterion("garde in", values, "garde");
            return (Criteria) this;
        }

        public Criteria andGardeNotIn(List<Integer> values) {
            addCriterion("garde not in", values, "garde");
            return (Criteria) this;
        }

        public Criteria andGardeBetween(Integer value1, Integer value2) {
            addCriterion("garde between", value1, value2, "garde");
            return (Criteria) this;
        }

        public Criteria andGardeNotBetween(Integer value1, Integer value2) {
            addCriterion("garde not between", value1, value2, "garde");
            return (Criteria) this;
        }

        public Criteria andStatIsNull() {
            addCriterion("stat is null");
            return (Criteria) this;
        }

        public Criteria andStatIsNotNull() {
            addCriterion("stat is not null");
            return (Criteria) this;
        }

        public Criteria andStatEqualTo(Integer value) {
            addCriterion("stat =", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotEqualTo(Integer value) {
            addCriterion("stat <>", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThan(Integer value) {
            addCriterion("stat >", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThanOrEqualTo(Integer value) {
            addCriterion("stat >=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThan(Integer value) {
            addCriterion("stat <", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThanOrEqualTo(Integer value) {
            addCriterion("stat <=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatIn(List<Integer> values) {
            addCriterion("stat in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotIn(List<Integer> values) {
            addCriterion("stat not in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatBetween(Integer value1, Integer value2) {
            addCriterion("stat between", value1, value2, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotBetween(Integer value1, Integer value2) {
            addCriterion("stat not between", value1, value2, "stat");
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