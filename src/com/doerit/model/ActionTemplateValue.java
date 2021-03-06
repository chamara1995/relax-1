package com.doerit.model;

import java.util.Date;

public class ActionTemplateValue {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_action_template_value.ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_action_template_value.ACTION_TEMPLATE_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String actionTemplateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_action_template_value.ACTION_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String actionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_action_template_value.STATUS
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_action_template_value.INSERT_USER_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String insertUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_action_template_value.INSERT_DATETIME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private Date insertDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_action_template_value.UPDATE_USER_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String updateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_action_template_value.UPDATE_DATETIME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private Date updateDatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_action_template_value.ID
     *
     * @return the value of tbl_action_template_value.ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_action_template_value.ID
     *
     * @param id the value for tbl_action_template_value.ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_action_template_value.ACTION_TEMPLATE_ID
     *
     * @return the value of tbl_action_template_value.ACTION_TEMPLATE_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getActionTemplateId() {
        return actionTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_action_template_value.ACTION_TEMPLATE_ID
     *
     * @param actionTemplateId the value for tbl_action_template_value.ACTION_TEMPLATE_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setActionTemplateId(String actionTemplateId) {
        this.actionTemplateId = actionTemplateId == null ? null : actionTemplateId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_action_template_value.ACTION_ID
     *
     * @return the value of tbl_action_template_value.ACTION_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_action_template_value.ACTION_ID
     *
     * @param actionId the value for tbl_action_template_value.ACTION_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setActionId(String actionId) {
        this.actionId = actionId == null ? null : actionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_action_template_value.STATUS
     *
     * @return the value of tbl_action_template_value.STATUS
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_action_template_value.STATUS
     *
     * @param status the value for tbl_action_template_value.STATUS
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_action_template_value.INSERT_USER_ID
     *
     * @return the value of tbl_action_template_value.INSERT_USER_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getInsertUserId() {
        return insertUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_action_template_value.INSERT_USER_ID
     *
     * @param insertUserId the value for tbl_action_template_value.INSERT_USER_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setInsertUserId(String insertUserId) {
        this.insertUserId = insertUserId == null ? null : insertUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_action_template_value.INSERT_DATETIME
     *
     * @return the value of tbl_action_template_value.INSERT_DATETIME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public Date getInsertDatetime() {
        return insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_action_template_value.INSERT_DATETIME
     *
     * @param insertDatetime the value for tbl_action_template_value.INSERT_DATETIME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setInsertDatetime(Date insertDatetime) {
        this.insertDatetime = insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_action_template_value.UPDATE_USER_ID
     *
     * @return the value of tbl_action_template_value.UPDATE_USER_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_action_template_value.UPDATE_USER_ID
     *
     * @param updateUserId the value for tbl_action_template_value.UPDATE_USER_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_action_template_value.UPDATE_DATETIME
     *
     * @return the value of tbl_action_template_value.UPDATE_DATETIME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_action_template_value.UPDATE_DATETIME
     *
     * @param updateDatetime the value for tbl_action_template_value.UPDATE_DATETIME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}