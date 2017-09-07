package com.zdjy.bigdata.antun.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andName1IsNull() {
            addCriterion("name1 is null");
            return (Criteria) this;
        }

        public Criteria andName1IsNotNull() {
            addCriterion("name1 is not null");
            return (Criteria) this;
        }

        public Criteria andName1EqualTo(String value) {
            addCriterion("name1 =", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotEqualTo(String value) {
            addCriterion("name1 <>", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1GreaterThan(String value) {
            addCriterion("name1 >", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1GreaterThanOrEqualTo(String value) {
            addCriterion("name1 >=", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1LessThan(String value) {
            addCriterion("name1 <", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1LessThanOrEqualTo(String value) {
            addCriterion("name1 <=", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1Like(String value) {
            addCriterion("name1 like", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotLike(String value) {
            addCriterion("name1 not like", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1In(List<String> values) {
            addCriterion("name1 in", values, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotIn(List<String> values) {
            addCriterion("name1 not in", values, "name1");
            return (Criteria) this;
        }

        public Criteria andName1Between(String value1, String value2) {
            addCriterion("name1 between", value1, value2, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotBetween(String value1, String value2) {
            addCriterion("name1 not between", value1, value2, "name1");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(String value) {
            addCriterion("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(String value) {
            addCriterion("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(String value) {
            addCriterion("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(String value) {
            addCriterion("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(String value) {
            addCriterion("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(String value) {
            addCriterion("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLike(String value) {
            addCriterion("birth like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotLike(String value) {
            addCriterion("birth not like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<String> values) {
            addCriterion("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<String> values) {
            addCriterion("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(String value1, String value2) {
            addCriterion("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(String value1, String value2) {
            addCriterion("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNull() {
            addCriterion("idno is null");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNotNull() {
            addCriterion("idno is not null");
            return (Criteria) this;
        }

        public Criteria andIdnoEqualTo(String value) {
            addCriterion("idno =", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotEqualTo(String value) {
            addCriterion("idno <>", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThan(String value) {
            addCriterion("idno >", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("idno >=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThan(String value) {
            addCriterion("idno <", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThanOrEqualTo(String value) {
            addCriterion("idno <=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLike(String value) {
            addCriterion("idno like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotLike(String value) {
            addCriterion("idno not like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoIn(List<String> values) {
            addCriterion("idno in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotIn(List<String> values) {
            addCriterion("idno not in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoBetween(String value1, String value2) {
            addCriterion("idno between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotBetween(String value1, String value2) {
            addCriterion("idno not between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andTownIsNull() {
            addCriterion("town is null");
            return (Criteria) this;
        }

        public Criteria andTownIsNotNull() {
            addCriterion("town is not null");
            return (Criteria) this;
        }

        public Criteria andTownEqualTo(Integer value) {
            addCriterion("town =", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotEqualTo(Integer value) {
            addCriterion("town <>", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThan(Integer value) {
            addCriterion("town >", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThanOrEqualTo(Integer value) {
            addCriterion("town >=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThan(Integer value) {
            addCriterion("town <", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThanOrEqualTo(Integer value) {
            addCriterion("town <=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownIn(List<Integer> values) {
            addCriterion("town in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotIn(List<Integer> values) {
            addCriterion("town not in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownBetween(Integer value1, Integer value2) {
            addCriterion("town between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotBetween(Integer value1, Integer value2) {
            addCriterion("town not between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("cid like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("cid not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("mid like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("mid not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andStatus1IsNull() {
            addCriterion("status1 is null");
            return (Criteria) this;
        }

        public Criteria andStatus1IsNotNull() {
            addCriterion("status1 is not null");
            return (Criteria) this;
        }

        public Criteria andStatus1EqualTo(Integer value) {
            addCriterion("status1 =", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1NotEqualTo(Integer value) {
            addCriterion("status1 <>", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1GreaterThan(Integer value) {
            addCriterion("status1 >", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1GreaterThanOrEqualTo(Integer value) {
            addCriterion("status1 >=", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1LessThan(Integer value) {
            addCriterion("status1 <", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1LessThanOrEqualTo(Integer value) {
            addCriterion("status1 <=", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1In(List<Integer> values) {
            addCriterion("status1 in", values, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1NotIn(List<Integer> values) {
            addCriterion("status1 not in", values, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1Between(Integer value1, Integer value2) {
            addCriterion("status1 between", value1, value2, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1NotBetween(Integer value1, Integer value2) {
            addCriterion("status1 not between", value1, value2, "status1");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Integer value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Integer value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Integer value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Integer value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Integer value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Integer> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Integer> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Integer value1, Integer value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andTend1IsNull() {
            addCriterion("tend1 is null");
            return (Criteria) this;
        }

        public Criteria andTend1IsNotNull() {
            addCriterion("tend1 is not null");
            return (Criteria) this;
        }

        public Criteria andTend1EqualTo(String value) {
            addCriterion("tend1 =", value, "tend1");
            return (Criteria) this;
        }

        public Criteria andTend1NotEqualTo(String value) {
            addCriterion("tend1 <>", value, "tend1");
            return (Criteria) this;
        }

        public Criteria andTend1GreaterThan(String value) {
            addCriterion("tend1 >", value, "tend1");
            return (Criteria) this;
        }

        public Criteria andTend1GreaterThanOrEqualTo(String value) {
            addCriterion("tend1 >=", value, "tend1");
            return (Criteria) this;
        }

        public Criteria andTend1LessThan(String value) {
            addCriterion("tend1 <", value, "tend1");
            return (Criteria) this;
        }

        public Criteria andTend1LessThanOrEqualTo(String value) {
            addCriterion("tend1 <=", value, "tend1");
            return (Criteria) this;
        }

        public Criteria andTend1Like(String value) {
            addCriterion("tend1 like", value, "tend1");
            return (Criteria) this;
        }

        public Criteria andTend1NotLike(String value) {
            addCriterion("tend1 not like", value, "tend1");
            return (Criteria) this;
        }

        public Criteria andTend1In(List<String> values) {
            addCriterion("tend1 in", values, "tend1");
            return (Criteria) this;
        }

        public Criteria andTend1NotIn(List<String> values) {
            addCriterion("tend1 not in", values, "tend1");
            return (Criteria) this;
        }

        public Criteria andTend1Between(String value1, String value2) {
            addCriterion("tend1 between", value1, value2, "tend1");
            return (Criteria) this;
        }

        public Criteria andTend1NotBetween(String value1, String value2) {
            addCriterion("tend1 not between", value1, value2, "tend1");
            return (Criteria) this;
        }

        public Criteria andTend2IsNull() {
            addCriterion("tend2 is null");
            return (Criteria) this;
        }

        public Criteria andTend2IsNotNull() {
            addCriterion("tend2 is not null");
            return (Criteria) this;
        }

        public Criteria andTend2EqualTo(String value) {
            addCriterion("tend2 =", value, "tend2");
            return (Criteria) this;
        }

        public Criteria andTend2NotEqualTo(String value) {
            addCriterion("tend2 <>", value, "tend2");
            return (Criteria) this;
        }

        public Criteria andTend2GreaterThan(String value) {
            addCriterion("tend2 >", value, "tend2");
            return (Criteria) this;
        }

        public Criteria andTend2GreaterThanOrEqualTo(String value) {
            addCriterion("tend2 >=", value, "tend2");
            return (Criteria) this;
        }

        public Criteria andTend2LessThan(String value) {
            addCriterion("tend2 <", value, "tend2");
            return (Criteria) this;
        }

        public Criteria andTend2LessThanOrEqualTo(String value) {
            addCriterion("tend2 <=", value, "tend2");
            return (Criteria) this;
        }

        public Criteria andTend2Like(String value) {
            addCriterion("tend2 like", value, "tend2");
            return (Criteria) this;
        }

        public Criteria andTend2NotLike(String value) {
            addCriterion("tend2 not like", value, "tend2");
            return (Criteria) this;
        }

        public Criteria andTend2In(List<String> values) {
            addCriterion("tend2 in", values, "tend2");
            return (Criteria) this;
        }

        public Criteria andTend2NotIn(List<String> values) {
            addCriterion("tend2 not in", values, "tend2");
            return (Criteria) this;
        }

        public Criteria andTend2Between(String value1, String value2) {
            addCriterion("tend2 between", value1, value2, "tend2");
            return (Criteria) this;
        }

        public Criteria andTend2NotBetween(String value1, String value2) {
            addCriterion("tend2 not between", value1, value2, "tend2");
            return (Criteria) this;
        }

        public Criteria andTend3IsNull() {
            addCriterion("tend3 is null");
            return (Criteria) this;
        }

        public Criteria andTend3IsNotNull() {
            addCriterion("tend3 is not null");
            return (Criteria) this;
        }

        public Criteria andTend3EqualTo(String value) {
            addCriterion("tend3 =", value, "tend3");
            return (Criteria) this;
        }

        public Criteria andTend3NotEqualTo(String value) {
            addCriterion("tend3 <>", value, "tend3");
            return (Criteria) this;
        }

        public Criteria andTend3GreaterThan(String value) {
            addCriterion("tend3 >", value, "tend3");
            return (Criteria) this;
        }

        public Criteria andTend3GreaterThanOrEqualTo(String value) {
            addCriterion("tend3 >=", value, "tend3");
            return (Criteria) this;
        }

        public Criteria andTend3LessThan(String value) {
            addCriterion("tend3 <", value, "tend3");
            return (Criteria) this;
        }

        public Criteria andTend3LessThanOrEqualTo(String value) {
            addCriterion("tend3 <=", value, "tend3");
            return (Criteria) this;
        }

        public Criteria andTend3Like(String value) {
            addCriterion("tend3 like", value, "tend3");
            return (Criteria) this;
        }

        public Criteria andTend3NotLike(String value) {
            addCriterion("tend3 not like", value, "tend3");
            return (Criteria) this;
        }

        public Criteria andTend3In(List<String> values) {
            addCriterion("tend3 in", values, "tend3");
            return (Criteria) this;
        }

        public Criteria andTend3NotIn(List<String> values) {
            addCriterion("tend3 not in", values, "tend3");
            return (Criteria) this;
        }

        public Criteria andTend3Between(String value1, String value2) {
            addCriterion("tend3 between", value1, value2, "tend3");
            return (Criteria) this;
        }

        public Criteria andTend3NotBetween(String value1, String value2) {
            addCriterion("tend3 not between", value1, value2, "tend3");
            return (Criteria) this;
        }

        public Criteria andTend4IsNull() {
            addCriterion("tend4 is null");
            return (Criteria) this;
        }

        public Criteria andTend4IsNotNull() {
            addCriterion("tend4 is not null");
            return (Criteria) this;
        }

        public Criteria andTend4EqualTo(String value) {
            addCriterion("tend4 =", value, "tend4");
            return (Criteria) this;
        }

        public Criteria andTend4NotEqualTo(String value) {
            addCriterion("tend4 <>", value, "tend4");
            return (Criteria) this;
        }

        public Criteria andTend4GreaterThan(String value) {
            addCriterion("tend4 >", value, "tend4");
            return (Criteria) this;
        }

        public Criteria andTend4GreaterThanOrEqualTo(String value) {
            addCriterion("tend4 >=", value, "tend4");
            return (Criteria) this;
        }

        public Criteria andTend4LessThan(String value) {
            addCriterion("tend4 <", value, "tend4");
            return (Criteria) this;
        }

        public Criteria andTend4LessThanOrEqualTo(String value) {
            addCriterion("tend4 <=", value, "tend4");
            return (Criteria) this;
        }

        public Criteria andTend4Like(String value) {
            addCriterion("tend4 like", value, "tend4");
            return (Criteria) this;
        }

        public Criteria andTend4NotLike(String value) {
            addCriterion("tend4 not like", value, "tend4");
            return (Criteria) this;
        }

        public Criteria andTend4In(List<String> values) {
            addCriterion("tend4 in", values, "tend4");
            return (Criteria) this;
        }

        public Criteria andTend4NotIn(List<String> values) {
            addCriterion("tend4 not in", values, "tend4");
            return (Criteria) this;
        }

        public Criteria andTend4Between(String value1, String value2) {
            addCriterion("tend4 between", value1, value2, "tend4");
            return (Criteria) this;
        }

        public Criteria andTend4NotBetween(String value1, String value2) {
            addCriterion("tend4 not between", value1, value2, "tend4");
            return (Criteria) this;
        }

        public Criteria andTend5IsNull() {
            addCriterion("tend5 is null");
            return (Criteria) this;
        }

        public Criteria andTend5IsNotNull() {
            addCriterion("tend5 is not null");
            return (Criteria) this;
        }

        public Criteria andTend5EqualTo(String value) {
            addCriterion("tend5 =", value, "tend5");
            return (Criteria) this;
        }

        public Criteria andTend5NotEqualTo(String value) {
            addCriterion("tend5 <>", value, "tend5");
            return (Criteria) this;
        }

        public Criteria andTend5GreaterThan(String value) {
            addCriterion("tend5 >", value, "tend5");
            return (Criteria) this;
        }

        public Criteria andTend5GreaterThanOrEqualTo(String value) {
            addCriterion("tend5 >=", value, "tend5");
            return (Criteria) this;
        }

        public Criteria andTend5LessThan(String value) {
            addCriterion("tend5 <", value, "tend5");
            return (Criteria) this;
        }

        public Criteria andTend5LessThanOrEqualTo(String value) {
            addCriterion("tend5 <=", value, "tend5");
            return (Criteria) this;
        }

        public Criteria andTend5Like(String value) {
            addCriterion("tend5 like", value, "tend5");
            return (Criteria) this;
        }

        public Criteria andTend5NotLike(String value) {
            addCriterion("tend5 not like", value, "tend5");
            return (Criteria) this;
        }

        public Criteria andTend5In(List<String> values) {
            addCriterion("tend5 in", values, "tend5");
            return (Criteria) this;
        }

        public Criteria andTend5NotIn(List<String> values) {
            addCriterion("tend5 not in", values, "tend5");
            return (Criteria) this;
        }

        public Criteria andTend5Between(String value1, String value2) {
            addCriterion("tend5 between", value1, value2, "tend5");
            return (Criteria) this;
        }

        public Criteria andTend5NotBetween(String value1, String value2) {
            addCriterion("tend5 not between", value1, value2, "tend5");
            return (Criteria) this;
        }

        public Criteria andTend6IsNull() {
            addCriterion("tend6 is null");
            return (Criteria) this;
        }

        public Criteria andTend6IsNotNull() {
            addCriterion("tend6 is not null");
            return (Criteria) this;
        }

        public Criteria andTend6EqualTo(String value) {
            addCriterion("tend6 =", value, "tend6");
            return (Criteria) this;
        }

        public Criteria andTend6NotEqualTo(String value) {
            addCriterion("tend6 <>", value, "tend6");
            return (Criteria) this;
        }

        public Criteria andTend6GreaterThan(String value) {
            addCriterion("tend6 >", value, "tend6");
            return (Criteria) this;
        }

        public Criteria andTend6GreaterThanOrEqualTo(String value) {
            addCriterion("tend6 >=", value, "tend6");
            return (Criteria) this;
        }

        public Criteria andTend6LessThan(String value) {
            addCriterion("tend6 <", value, "tend6");
            return (Criteria) this;
        }

        public Criteria andTend6LessThanOrEqualTo(String value) {
            addCriterion("tend6 <=", value, "tend6");
            return (Criteria) this;
        }

        public Criteria andTend6Like(String value) {
            addCriterion("tend6 like", value, "tend6");
            return (Criteria) this;
        }

        public Criteria andTend6NotLike(String value) {
            addCriterion("tend6 not like", value, "tend6");
            return (Criteria) this;
        }

        public Criteria andTend6In(List<String> values) {
            addCriterion("tend6 in", values, "tend6");
            return (Criteria) this;
        }

        public Criteria andTend6NotIn(List<String> values) {
            addCriterion("tend6 not in", values, "tend6");
            return (Criteria) this;
        }

        public Criteria andTend6Between(String value1, String value2) {
            addCriterion("tend6 between", value1, value2, "tend6");
            return (Criteria) this;
        }

        public Criteria andTend6NotBetween(String value1, String value2) {
            addCriterion("tend6 not between", value1, value2, "tend6");
            return (Criteria) this;
        }

        public Criteria andTend7IsNull() {
            addCriterion("tend7 is null");
            return (Criteria) this;
        }

        public Criteria andTend7IsNotNull() {
            addCriterion("tend7 is not null");
            return (Criteria) this;
        }

        public Criteria andTend7EqualTo(String value) {
            addCriterion("tend7 =", value, "tend7");
            return (Criteria) this;
        }

        public Criteria andTend7NotEqualTo(String value) {
            addCriterion("tend7 <>", value, "tend7");
            return (Criteria) this;
        }

        public Criteria andTend7GreaterThan(String value) {
            addCriterion("tend7 >", value, "tend7");
            return (Criteria) this;
        }

        public Criteria andTend7GreaterThanOrEqualTo(String value) {
            addCriterion("tend7 >=", value, "tend7");
            return (Criteria) this;
        }

        public Criteria andTend7LessThan(String value) {
            addCriterion("tend7 <", value, "tend7");
            return (Criteria) this;
        }

        public Criteria andTend7LessThanOrEqualTo(String value) {
            addCriterion("tend7 <=", value, "tend7");
            return (Criteria) this;
        }

        public Criteria andTend7Like(String value) {
            addCriterion("tend7 like", value, "tend7");
            return (Criteria) this;
        }

        public Criteria andTend7NotLike(String value) {
            addCriterion("tend7 not like", value, "tend7");
            return (Criteria) this;
        }

        public Criteria andTend7In(List<String> values) {
            addCriterion("tend7 in", values, "tend7");
            return (Criteria) this;
        }

        public Criteria andTend7NotIn(List<String> values) {
            addCriterion("tend7 not in", values, "tend7");
            return (Criteria) this;
        }

        public Criteria andTend7Between(String value1, String value2) {
            addCriterion("tend7 between", value1, value2, "tend7");
            return (Criteria) this;
        }

        public Criteria andTend7NotBetween(String value1, String value2) {
            addCriterion("tend7 not between", value1, value2, "tend7");
            return (Criteria) this;
        }

        public Criteria andTend8IsNull() {
            addCriterion("tend8 is null");
            return (Criteria) this;
        }

        public Criteria andTend8IsNotNull() {
            addCriterion("tend8 is not null");
            return (Criteria) this;
        }

        public Criteria andTend8EqualTo(String value) {
            addCriterion("tend8 =", value, "tend8");
            return (Criteria) this;
        }

        public Criteria andTend8NotEqualTo(String value) {
            addCriterion("tend8 <>", value, "tend8");
            return (Criteria) this;
        }

        public Criteria andTend8GreaterThan(String value) {
            addCriterion("tend8 >", value, "tend8");
            return (Criteria) this;
        }

        public Criteria andTend8GreaterThanOrEqualTo(String value) {
            addCriterion("tend8 >=", value, "tend8");
            return (Criteria) this;
        }

        public Criteria andTend8LessThan(String value) {
            addCriterion("tend8 <", value, "tend8");
            return (Criteria) this;
        }

        public Criteria andTend8LessThanOrEqualTo(String value) {
            addCriterion("tend8 <=", value, "tend8");
            return (Criteria) this;
        }

        public Criteria andTend8Like(String value) {
            addCriterion("tend8 like", value, "tend8");
            return (Criteria) this;
        }

        public Criteria andTend8NotLike(String value) {
            addCriterion("tend8 not like", value, "tend8");
            return (Criteria) this;
        }

        public Criteria andTend8In(List<String> values) {
            addCriterion("tend8 in", values, "tend8");
            return (Criteria) this;
        }

        public Criteria andTend8NotIn(List<String> values) {
            addCriterion("tend8 not in", values, "tend8");
            return (Criteria) this;
        }

        public Criteria andTend8Between(String value1, String value2) {
            addCriterion("tend8 between", value1, value2, "tend8");
            return (Criteria) this;
        }

        public Criteria andTend8NotBetween(String value1, String value2) {
            addCriterion("tend8 not between", value1, value2, "tend8");
            return (Criteria) this;
        }

        public Criteria andTend9IsNull() {
            addCriterion("tend9 is null");
            return (Criteria) this;
        }

        public Criteria andTend9IsNotNull() {
            addCriterion("tend9 is not null");
            return (Criteria) this;
        }

        public Criteria andTend9EqualTo(String value) {
            addCriterion("tend9 =", value, "tend9");
            return (Criteria) this;
        }

        public Criteria andTend9NotEqualTo(String value) {
            addCriterion("tend9 <>", value, "tend9");
            return (Criteria) this;
        }

        public Criteria andTend9GreaterThan(String value) {
            addCriterion("tend9 >", value, "tend9");
            return (Criteria) this;
        }

        public Criteria andTend9GreaterThanOrEqualTo(String value) {
            addCriterion("tend9 >=", value, "tend9");
            return (Criteria) this;
        }

        public Criteria andTend9LessThan(String value) {
            addCriterion("tend9 <", value, "tend9");
            return (Criteria) this;
        }

        public Criteria andTend9LessThanOrEqualTo(String value) {
            addCriterion("tend9 <=", value, "tend9");
            return (Criteria) this;
        }

        public Criteria andTend9Like(String value) {
            addCriterion("tend9 like", value, "tend9");
            return (Criteria) this;
        }

        public Criteria andTend9NotLike(String value) {
            addCriterion("tend9 not like", value, "tend9");
            return (Criteria) this;
        }

        public Criteria andTend9In(List<String> values) {
            addCriterion("tend9 in", values, "tend9");
            return (Criteria) this;
        }

        public Criteria andTend9NotIn(List<String> values) {
            addCriterion("tend9 not in", values, "tend9");
            return (Criteria) this;
        }

        public Criteria andTend9Between(String value1, String value2) {
            addCriterion("tend9 between", value1, value2, "tend9");
            return (Criteria) this;
        }

        public Criteria andTend9NotBetween(String value1, String value2) {
            addCriterion("tend9 not between", value1, value2, "tend9");
            return (Criteria) this;
        }

        public Criteria andTend10IsNull() {
            addCriterion("tend10 is null");
            return (Criteria) this;
        }

        public Criteria andTend10IsNotNull() {
            addCriterion("tend10 is not null");
            return (Criteria) this;
        }

        public Criteria andTend10EqualTo(String value) {
            addCriterion("tend10 =", value, "tend10");
            return (Criteria) this;
        }

        public Criteria andTend10NotEqualTo(String value) {
            addCriterion("tend10 <>", value, "tend10");
            return (Criteria) this;
        }

        public Criteria andTend10GreaterThan(String value) {
            addCriterion("tend10 >", value, "tend10");
            return (Criteria) this;
        }

        public Criteria andTend10GreaterThanOrEqualTo(String value) {
            addCriterion("tend10 >=", value, "tend10");
            return (Criteria) this;
        }

        public Criteria andTend10LessThan(String value) {
            addCriterion("tend10 <", value, "tend10");
            return (Criteria) this;
        }

        public Criteria andTend10LessThanOrEqualTo(String value) {
            addCriterion("tend10 <=", value, "tend10");
            return (Criteria) this;
        }

        public Criteria andTend10Like(String value) {
            addCriterion("tend10 like", value, "tend10");
            return (Criteria) this;
        }

        public Criteria andTend10NotLike(String value) {
            addCriterion("tend10 not like", value, "tend10");
            return (Criteria) this;
        }

        public Criteria andTend10In(List<String> values) {
            addCriterion("tend10 in", values, "tend10");
            return (Criteria) this;
        }

        public Criteria andTend10NotIn(List<String> values) {
            addCriterion("tend10 not in", values, "tend10");
            return (Criteria) this;
        }

        public Criteria andTend10Between(String value1, String value2) {
            addCriterion("tend10 between", value1, value2, "tend10");
            return (Criteria) this;
        }

        public Criteria andTend10NotBetween(String value1, String value2) {
            addCriterion("tend10 not between", value1, value2, "tend10");
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