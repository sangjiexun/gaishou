package vn.bananavietnam.ict.common.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IvbMPesticidesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public IvbMPesticidesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
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

        public Criteria andPesticideIdIsNull() {
            addCriterion("PESTICIDE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPesticideIdIsNotNull() {
            addCriterion("PESTICIDE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPesticideIdEqualTo(String value) {
            addCriterion("PESTICIDE_ID =", value, "pesticideId");
            return (Criteria) this;
        }

        public Criteria andPesticideIdNotEqualTo(String value) {
            addCriterion("PESTICIDE_ID <>", value, "pesticideId");
            return (Criteria) this;
        }

        public Criteria andPesticideIdGreaterThan(String value) {
            addCriterion("PESTICIDE_ID >", value, "pesticideId");
            return (Criteria) this;
        }

        public Criteria andPesticideIdGreaterThanOrEqualTo(String value) {
            addCriterion("PESTICIDE_ID >=", value, "pesticideId");
            return (Criteria) this;
        }

        public Criteria andPesticideIdLessThan(String value) {
            addCriterion("PESTICIDE_ID <", value, "pesticideId");
            return (Criteria) this;
        }

        public Criteria andPesticideIdLessThanOrEqualTo(String value) {
            addCriterion("PESTICIDE_ID <=", value, "pesticideId");
            return (Criteria) this;
        }

        public Criteria andPesticideIdLike(String value) {
            addCriterion("PESTICIDE_ID like", value, "pesticideId");
            return (Criteria) this;
        }

        public Criteria andPesticideIdNotLike(String value) {
            addCriterion("PESTICIDE_ID not like", value, "pesticideId");
            return (Criteria) this;
        }

        public Criteria andPesticideIdIn(List<String> values) {
            addCriterion("PESTICIDE_ID in", values, "pesticideId");
            return (Criteria) this;
        }

        public Criteria andPesticideIdNotIn(List<String> values) {
            addCriterion("PESTICIDE_ID not in", values, "pesticideId");
            return (Criteria) this;
        }

        public Criteria andPesticideIdBetween(String value1, String value2) {
            addCriterion("PESTICIDE_ID between", value1, value2, "pesticideId");
            return (Criteria) this;
        }

        public Criteria andPesticideIdNotBetween(String value1, String value2) {
            addCriterion("PESTICIDE_ID not between", value1, value2, "pesticideId");
            return (Criteria) this;
        }

        public Criteria andPesticideNameIsNull() {
            addCriterion("PESTICIDE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPesticideNameIsNotNull() {
            addCriterion("PESTICIDE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPesticideNameEqualTo(String value) {
            addCriterion("PESTICIDE_NAME =", value, "pesticideName");
            return (Criteria) this;
        }

        public Criteria andPesticideNameNotEqualTo(String value) {
            addCriterion("PESTICIDE_NAME <>", value, "pesticideName");
            return (Criteria) this;
        }

        public Criteria andPesticideNameGreaterThan(String value) {
            addCriterion("PESTICIDE_NAME >", value, "pesticideName");
            return (Criteria) this;
        }

        public Criteria andPesticideNameGreaterThanOrEqualTo(String value) {
            addCriterion("PESTICIDE_NAME >=", value, "pesticideName");
            return (Criteria) this;
        }

        public Criteria andPesticideNameLessThan(String value) {
            addCriterion("PESTICIDE_NAME <", value, "pesticideName");
            return (Criteria) this;
        }

        public Criteria andPesticideNameLessThanOrEqualTo(String value) {
            addCriterion("PESTICIDE_NAME <=", value, "pesticideName");
            return (Criteria) this;
        }

        public Criteria andPesticideNameLike(String value) {
            addCriterion("PESTICIDE_NAME like", value, "pesticideName");
            return (Criteria) this;
        }

        public Criteria andPesticideNameNotLike(String value) {
            addCriterion("PESTICIDE_NAME not like", value, "pesticideName");
            return (Criteria) this;
        }

        public Criteria andPesticideNameIn(List<String> values) {
            addCriterion("PESTICIDE_NAME in", values, "pesticideName");
            return (Criteria) this;
        }

        public Criteria andPesticideNameNotIn(List<String> values) {
            addCriterion("PESTICIDE_NAME not in", values, "pesticideName");
            return (Criteria) this;
        }

        public Criteria andPesticideNameBetween(String value1, String value2) {
            addCriterion("PESTICIDE_NAME between", value1, value2, "pesticideName");
            return (Criteria) this;
        }

        public Criteria andPesticideNameNotBetween(String value1, String value2) {
            addCriterion("PESTICIDE_NAME not between", value1, value2, "pesticideName");
            return (Criteria) this;
        }

        public Criteria andImageLink1IsNull() {
            addCriterion("IMAGE_LINK_1 is null");
            return (Criteria) this;
        }

        public Criteria andImageLink1IsNotNull() {
            addCriterion("IMAGE_LINK_1 is not null");
            return (Criteria) this;
        }

        public Criteria andImageLink1EqualTo(String value) {
            addCriterion("IMAGE_LINK_1 =", value, "imageLink1");
            return (Criteria) this;
        }

        public Criteria andImageLink1NotEqualTo(String value) {
            addCriterion("IMAGE_LINK_1 <>", value, "imageLink1");
            return (Criteria) this;
        }

        public Criteria andImageLink1GreaterThan(String value) {
            addCriterion("IMAGE_LINK_1 >", value, "imageLink1");
            return (Criteria) this;
        }

        public Criteria andImageLink1GreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_LINK_1 >=", value, "imageLink1");
            return (Criteria) this;
        }

        public Criteria andImageLink1LessThan(String value) {
            addCriterion("IMAGE_LINK_1 <", value, "imageLink1");
            return (Criteria) this;
        }

        public Criteria andImageLink1LessThanOrEqualTo(String value) {
            addCriterion("IMAGE_LINK_1 <=", value, "imageLink1");
            return (Criteria) this;
        }

        public Criteria andImageLink1Like(String value) {
            addCriterion("IMAGE_LINK_1 like", value, "imageLink1");
            return (Criteria) this;
        }

        public Criteria andImageLink1NotLike(String value) {
            addCriterion("IMAGE_LINK_1 not like", value, "imageLink1");
            return (Criteria) this;
        }

        public Criteria andImageLink1In(List<String> values) {
            addCriterion("IMAGE_LINK_1 in", values, "imageLink1");
            return (Criteria) this;
        }

        public Criteria andImageLink1NotIn(List<String> values) {
            addCriterion("IMAGE_LINK_1 not in", values, "imageLink1");
            return (Criteria) this;
        }

        public Criteria andImageLink1Between(String value1, String value2) {
            addCriterion("IMAGE_LINK_1 between", value1, value2, "imageLink1");
            return (Criteria) this;
        }

        public Criteria andImageLink1NotBetween(String value1, String value2) {
            addCriterion("IMAGE_LINK_1 not between", value1, value2, "imageLink1");
            return (Criteria) this;
        }

        public Criteria andImageLink2IsNull() {
            addCriterion("IMAGE_LINK_2 is null");
            return (Criteria) this;
        }

        public Criteria andImageLink2IsNotNull() {
            addCriterion("IMAGE_LINK_2 is not null");
            return (Criteria) this;
        }

        public Criteria andImageLink2EqualTo(String value) {
            addCriterion("IMAGE_LINK_2 =", value, "imageLink2");
            return (Criteria) this;
        }

        public Criteria andImageLink2NotEqualTo(String value) {
            addCriterion("IMAGE_LINK_2 <>", value, "imageLink2");
            return (Criteria) this;
        }

        public Criteria andImageLink2GreaterThan(String value) {
            addCriterion("IMAGE_LINK_2 >", value, "imageLink2");
            return (Criteria) this;
        }

        public Criteria andImageLink2GreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_LINK_2 >=", value, "imageLink2");
            return (Criteria) this;
        }

        public Criteria andImageLink2LessThan(String value) {
            addCriterion("IMAGE_LINK_2 <", value, "imageLink2");
            return (Criteria) this;
        }

        public Criteria andImageLink2LessThanOrEqualTo(String value) {
            addCriterion("IMAGE_LINK_2 <=", value, "imageLink2");
            return (Criteria) this;
        }

        public Criteria andImageLink2Like(String value) {
            addCriterion("IMAGE_LINK_2 like", value, "imageLink2");
            return (Criteria) this;
        }

        public Criteria andImageLink2NotLike(String value) {
            addCriterion("IMAGE_LINK_2 not like", value, "imageLink2");
            return (Criteria) this;
        }

        public Criteria andImageLink2In(List<String> values) {
            addCriterion("IMAGE_LINK_2 in", values, "imageLink2");
            return (Criteria) this;
        }

        public Criteria andImageLink2NotIn(List<String> values) {
            addCriterion("IMAGE_LINK_2 not in", values, "imageLink2");
            return (Criteria) this;
        }

        public Criteria andImageLink2Between(String value1, String value2) {
            addCriterion("IMAGE_LINK_2 between", value1, value2, "imageLink2");
            return (Criteria) this;
        }

        public Criteria andImageLink2NotBetween(String value1, String value2) {
            addCriterion("IMAGE_LINK_2 not between", value1, value2, "imageLink2");
            return (Criteria) this;
        }

        public Criteria andImageLink3IsNull() {
            addCriterion("IMAGE_LINK_3 is null");
            return (Criteria) this;
        }

        public Criteria andImageLink3IsNotNull() {
            addCriterion("IMAGE_LINK_3 is not null");
            return (Criteria) this;
        }

        public Criteria andImageLink3EqualTo(String value) {
            addCriterion("IMAGE_LINK_3 =", value, "imageLink3");
            return (Criteria) this;
        }

        public Criteria andImageLink3NotEqualTo(String value) {
            addCriterion("IMAGE_LINK_3 <>", value, "imageLink3");
            return (Criteria) this;
        }

        public Criteria andImageLink3GreaterThan(String value) {
            addCriterion("IMAGE_LINK_3 >", value, "imageLink3");
            return (Criteria) this;
        }

        public Criteria andImageLink3GreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_LINK_3 >=", value, "imageLink3");
            return (Criteria) this;
        }

        public Criteria andImageLink3LessThan(String value) {
            addCriterion("IMAGE_LINK_3 <", value, "imageLink3");
            return (Criteria) this;
        }

        public Criteria andImageLink3LessThanOrEqualTo(String value) {
            addCriterion("IMAGE_LINK_3 <=", value, "imageLink3");
            return (Criteria) this;
        }

        public Criteria andImageLink3Like(String value) {
            addCriterion("IMAGE_LINK_3 like", value, "imageLink3");
            return (Criteria) this;
        }

        public Criteria andImageLink3NotLike(String value) {
            addCriterion("IMAGE_LINK_3 not like", value, "imageLink3");
            return (Criteria) this;
        }

        public Criteria andImageLink3In(List<String> values) {
            addCriterion("IMAGE_LINK_3 in", values, "imageLink3");
            return (Criteria) this;
        }

        public Criteria andImageLink3NotIn(List<String> values) {
            addCriterion("IMAGE_LINK_3 not in", values, "imageLink3");
            return (Criteria) this;
        }

        public Criteria andImageLink3Between(String value1, String value2) {
            addCriterion("IMAGE_LINK_3 between", value1, value2, "imageLink3");
            return (Criteria) this;
        }

        public Criteria andImageLink3NotBetween(String value1, String value2) {
            addCriterion("IMAGE_LINK_3 not between", value1, value2, "imageLink3");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("CREATE_USER_ID like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("CREATE_USER_ID not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("UPDATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("UPDATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(String value) {
            addCriterion("UPDATE_USER_ID =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(String value) {
            addCriterion("UPDATE_USER_ID <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(String value) {
            addCriterion("UPDATE_USER_ID >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_ID >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(String value) {
            addCriterion("UPDATE_USER_ID <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_ID <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLike(String value) {
            addCriterion("UPDATE_USER_ID like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotLike(String value) {
            addCriterion("UPDATE_USER_ID not like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<String> values) {
            addCriterion("UPDATE_USER_ID in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<String> values) {
            addCriterion("UPDATE_USER_ID not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_ID between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_ID not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("DELETE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("DELETE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Boolean value) {
            addCriterion("DELETE_FLAG =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Boolean value) {
            addCriterion("DELETE_FLAG <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Boolean value) {
            addCriterion("DELETE_FLAG >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DELETE_FLAG >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Boolean value) {
            addCriterion("DELETE_FLAG <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("DELETE_FLAG <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Boolean> values) {
            addCriterion("DELETE_FLAG in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Boolean> values) {
            addCriterion("DELETE_FLAG not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DELETE_FLAG not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated do_not_delete_during_merge Fri Apr 07 14:55:57 ICT 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table IVB_M_PESTICIDES
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
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