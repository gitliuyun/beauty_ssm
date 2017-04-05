package com.yingjun.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class MngoprlogtbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MngoprlogtbExample() {
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

        public Criteria andMngoprlogtbIdIsNull() {
            addCriterion("mngoprlogtb_id is null");
            return (Criteria) this;
        }

        public Criteria andMngoprlogtbIdIsNotNull() {
            addCriterion("mngoprlogtb_id is not null");
            return (Criteria) this;
        }

        public Criteria andMngoprlogtbIdEqualTo(Long value) {
            addCriterion("mngoprlogtb_id =", value, "mngoprlogtbId");
            return (Criteria) this;
        }

        public Criteria andMngoprlogtbIdNotEqualTo(Long value) {
            addCriterion("mngoprlogtb_id <>", value, "mngoprlogtbId");
            return (Criteria) this;
        }

        public Criteria andMngoprlogtbIdGreaterThan(Long value) {
            addCriterion("mngoprlogtb_id >", value, "mngoprlogtbId");
            return (Criteria) this;
        }

        public Criteria andMngoprlogtbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mngoprlogtb_id >=", value, "mngoprlogtbId");
            return (Criteria) this;
        }

        public Criteria andMngoprlogtbIdLessThan(Long value) {
            addCriterion("mngoprlogtb_id <", value, "mngoprlogtbId");
            return (Criteria) this;
        }

        public Criteria andMngoprlogtbIdLessThanOrEqualTo(Long value) {
            addCriterion("mngoprlogtb_id <=", value, "mngoprlogtbId");
            return (Criteria) this;
        }

        public Criteria andMngoprlogtbIdIn(List<Long> values) {
            addCriterion("mngoprlogtb_id in", values, "mngoprlogtbId");
            return (Criteria) this;
        }

        public Criteria andMngoprlogtbIdNotIn(List<Long> values) {
            addCriterion("mngoprlogtb_id not in", values, "mngoprlogtbId");
            return (Criteria) this;
        }

        public Criteria andMngoprlogtbIdBetween(Long value1, Long value2) {
            addCriterion("mngoprlogtb_id between", value1, value2, "mngoprlogtbId");
            return (Criteria) this;
        }

        public Criteria andMngoprlogtbIdNotBetween(Long value1, Long value2) {
            addCriterion("mngoprlogtb_id not between", value1, value2, "mngoprlogtbId");
            return (Criteria) this;
        }

        public Criteria andLogseqIsNull() {
            addCriterion("logseq is null");
            return (Criteria) this;
        }

        public Criteria andLogseqIsNotNull() {
            addCriterion("logseq is not null");
            return (Criteria) this;
        }

        public Criteria andLogseqEqualTo(Integer value) {
            addCriterion("logseq =", value, "logseq");
            return (Criteria) this;
        }

        public Criteria andLogseqNotEqualTo(Integer value) {
            addCriterion("logseq <>", value, "logseq");
            return (Criteria) this;
        }

        public Criteria andLogseqGreaterThan(Integer value) {
            addCriterion("logseq >", value, "logseq");
            return (Criteria) this;
        }

        public Criteria andLogseqGreaterThanOrEqualTo(Integer value) {
            addCriterion("logseq >=", value, "logseq");
            return (Criteria) this;
        }

        public Criteria andLogseqLessThan(Integer value) {
            addCriterion("logseq <", value, "logseq");
            return (Criteria) this;
        }

        public Criteria andLogseqLessThanOrEqualTo(Integer value) {
            addCriterion("logseq <=", value, "logseq");
            return (Criteria) this;
        }

        public Criteria andLogseqIn(List<Integer> values) {
            addCriterion("logseq in", values, "logseq");
            return (Criteria) this;
        }

        public Criteria andLogseqNotIn(List<Integer> values) {
            addCriterion("logseq not in", values, "logseq");
            return (Criteria) this;
        }

        public Criteria andLogseqBetween(Integer value1, Integer value2) {
            addCriterion("logseq between", value1, value2, "logseq");
            return (Criteria) this;
        }

        public Criteria andLogseqNotBetween(Integer value1, Integer value2) {
            addCriterion("logseq not between", value1, value2, "logseq");
            return (Criteria) this;
        }

        public Criteria andLogtestIsNull() {
            addCriterion("logtest is null");
            return (Criteria) this;
        }

        public Criteria andLogtestIsNotNull() {
            addCriterion("logtest is not null");
            return (Criteria) this;
        }

        public Criteria andLogtestEqualTo(String value) {
            addCriterion("logtest =", value, "logtest");
            return (Criteria) this;
        }

        public Criteria andLogtestNotEqualTo(String value) {
            addCriterion("logtest <>", value, "logtest");
            return (Criteria) this;
        }

        public Criteria andLogtestGreaterThan(String value) {
            addCriterion("logtest >", value, "logtest");
            return (Criteria) this;
        }

        public Criteria andLogtestGreaterThanOrEqualTo(String value) {
            addCriterion("logtest >=", value, "logtest");
            return (Criteria) this;
        }

        public Criteria andLogtestLessThan(String value) {
            addCriterion("logtest <", value, "logtest");
            return (Criteria) this;
        }

        public Criteria andLogtestLessThanOrEqualTo(String value) {
            addCriterion("logtest <=", value, "logtest");
            return (Criteria) this;
        }

        public Criteria andLogtestLike(String value) {
            addCriterion("logtest like", value, "logtest");
            return (Criteria) this;
        }

        public Criteria andLogtestNotLike(String value) {
            addCriterion("logtest not like", value, "logtest");
            return (Criteria) this;
        }

        public Criteria andLogtestIn(List<String> values) {
            addCriterion("logtest in", values, "logtest");
            return (Criteria) this;
        }

        public Criteria andLogtestNotIn(List<String> values) {
            addCriterion("logtest not in", values, "logtest");
            return (Criteria) this;
        }

        public Criteria andLogtestBetween(String value1, String value2) {
            addCriterion("logtest between", value1, value2, "logtest");
            return (Criteria) this;
        }

        public Criteria andLogtestNotBetween(String value1, String value2) {
            addCriterion("logtest not between", value1, value2, "logtest");
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

        public Criteria andSessionidIsNull() {
            addCriterion("sessionid is null");
            return (Criteria) this;
        }

        public Criteria andSessionidIsNotNull() {
            addCriterion("sessionid is not null");
            return (Criteria) this;
        }

        public Criteria andSessionidEqualTo(String value) {
            addCriterion("sessionid =", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotEqualTo(String value) {
            addCriterion("sessionid <>", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThan(String value) {
            addCriterion("sessionid >", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThanOrEqualTo(String value) {
            addCriterion("sessionid >=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThan(String value) {
            addCriterion("sessionid <", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThanOrEqualTo(String value) {
            addCriterion("sessionid <=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLike(String value) {
            addCriterion("sessionid like", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotLike(String value) {
            addCriterion("sessionid not like", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidIn(List<String> values) {
            addCriterion("sessionid in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotIn(List<String> values) {
            addCriterion("sessionid not in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidBetween(String value1, String value2) {
            addCriterion("sessionid between", value1, value2, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotBetween(String value1, String value2) {
            addCriterion("sessionid not between", value1, value2, "sessionid");
            return (Criteria) this;
        }

        public Criteria andFuncidIsNull() {
            addCriterion("funcid is null");
            return (Criteria) this;
        }

        public Criteria andFuncidIsNotNull() {
            addCriterion("funcid is not null");
            return (Criteria) this;
        }

        public Criteria andFuncidEqualTo(String value) {
            addCriterion("funcid =", value, "funcid");
            return (Criteria) this;
        }

        public Criteria andFuncidNotEqualTo(String value) {
            addCriterion("funcid <>", value, "funcid");
            return (Criteria) this;
        }

        public Criteria andFuncidGreaterThan(String value) {
            addCriterion("funcid >", value, "funcid");
            return (Criteria) this;
        }

        public Criteria andFuncidGreaterThanOrEqualTo(String value) {
            addCriterion("funcid >=", value, "funcid");
            return (Criteria) this;
        }

        public Criteria andFuncidLessThan(String value) {
            addCriterion("funcid <", value, "funcid");
            return (Criteria) this;
        }

        public Criteria andFuncidLessThanOrEqualTo(String value) {
            addCriterion("funcid <=", value, "funcid");
            return (Criteria) this;
        }

        public Criteria andFuncidLike(String value) {
            addCriterion("funcid like", value, "funcid");
            return (Criteria) this;
        }

        public Criteria andFuncidNotLike(String value) {
            addCriterion("funcid not like", value, "funcid");
            return (Criteria) this;
        }

        public Criteria andFuncidIn(List<String> values) {
            addCriterion("funcid in", values, "funcid");
            return (Criteria) this;
        }

        public Criteria andFuncidNotIn(List<String> values) {
            addCriterion("funcid not in", values, "funcid");
            return (Criteria) this;
        }

        public Criteria andFuncidBetween(String value1, String value2) {
            addCriterion("funcid between", value1, value2, "funcid");
            return (Criteria) this;
        }

        public Criteria andFuncidNotBetween(String value1, String value2) {
            addCriterion("funcid not between", value1, value2, "funcid");
            return (Criteria) this;
        }

        public Criteria andFuncnameIsNull() {
            addCriterion("funcname is null");
            return (Criteria) this;
        }

        public Criteria andFuncnameIsNotNull() {
            addCriterion("funcname is not null");
            return (Criteria) this;
        }

        public Criteria andFuncnameEqualTo(String value) {
            addCriterion("funcname =", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameNotEqualTo(String value) {
            addCriterion("funcname <>", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameGreaterThan(String value) {
            addCriterion("funcname >", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameGreaterThanOrEqualTo(String value) {
            addCriterion("funcname >=", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameLessThan(String value) {
            addCriterion("funcname <", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameLessThanOrEqualTo(String value) {
            addCriterion("funcname <=", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameLike(String value) {
            addCriterion("funcname like", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameNotLike(String value) {
            addCriterion("funcname not like", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameIn(List<String> values) {
            addCriterion("funcname in", values, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameNotIn(List<String> values) {
            addCriterion("funcname not in", values, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameBetween(String value1, String value2) {
            addCriterion("funcname between", value1, value2, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameNotBetween(String value1, String value2) {
            addCriterion("funcname not between", value1, value2, "funcname");
            return (Criteria) this;
        }

        public Criteria andOpertypeIsNull() {
            addCriterion("opertype is null");
            return (Criteria) this;
        }

        public Criteria andOpertypeIsNotNull() {
            addCriterion("opertype is not null");
            return (Criteria) this;
        }

        public Criteria andOpertypeEqualTo(String value) {
            addCriterion("opertype =", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeNotEqualTo(String value) {
            addCriterion("opertype <>", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeGreaterThan(String value) {
            addCriterion("opertype >", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeGreaterThanOrEqualTo(String value) {
            addCriterion("opertype >=", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeLessThan(String value) {
            addCriterion("opertype <", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeLessThanOrEqualTo(String value) {
            addCriterion("opertype <=", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeLike(String value) {
            addCriterion("opertype like", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeNotLike(String value) {
            addCriterion("opertype not like", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeIn(List<String> values) {
            addCriterion("opertype in", values, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeNotIn(List<String> values) {
            addCriterion("opertype not in", values, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeBetween(String value1, String value2) {
            addCriterion("opertype between", value1, value2, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeNotBetween(String value1, String value2) {
            addCriterion("opertype not between", value1, value2, "opertype");
            return (Criteria) this;
        }

        public Criteria andBegtimeIsNull() {
            addCriterion("begtime is null");
            return (Criteria) this;
        }

        public Criteria andBegtimeIsNotNull() {
            addCriterion("begtime is not null");
            return (Criteria) this;
        }

        public Criteria andBegtimeEqualTo(String value) {
            addCriterion("begtime =", value, "begtime");
            return (Criteria) this;
        }

        public Criteria andBegtimeNotEqualTo(String value) {
            addCriterion("begtime <>", value, "begtime");
            return (Criteria) this;
        }

        public Criteria andBegtimeGreaterThan(String value) {
            addCriterion("begtime >", value, "begtime");
            return (Criteria) this;
        }

        public Criteria andBegtimeGreaterThanOrEqualTo(String value) {
            addCriterion("begtime >=", value, "begtime");
            return (Criteria) this;
        }

        public Criteria andBegtimeLessThan(String value) {
            addCriterion("begtime <", value, "begtime");
            return (Criteria) this;
        }

        public Criteria andBegtimeLessThanOrEqualTo(String value) {
            addCriterion("begtime <=", value, "begtime");
            return (Criteria) this;
        }

        public Criteria andBegtimeLike(String value) {
            addCriterion("begtime like", value, "begtime");
            return (Criteria) this;
        }

        public Criteria andBegtimeNotLike(String value) {
            addCriterion("begtime not like", value, "begtime");
            return (Criteria) this;
        }

        public Criteria andBegtimeIn(List<String> values) {
            addCriterion("begtime in", values, "begtime");
            return (Criteria) this;
        }

        public Criteria andBegtimeNotIn(List<String> values) {
            addCriterion("begtime not in", values, "begtime");
            return (Criteria) this;
        }

        public Criteria andBegtimeBetween(String value1, String value2) {
            addCriterion("begtime between", value1, value2, "begtime");
            return (Criteria) this;
        }

        public Criteria andBegtimeNotBetween(String value1, String value2) {
            addCriterion("begtime not between", value1, value2, "begtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endtime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endtime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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