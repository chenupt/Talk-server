package me.risky.talk.server.domain;

import java.util.Date;

public class TContent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.id
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.title
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.body
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    private String body;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.url
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.create_time
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.user_id
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.status
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.id
     *
     * @return the value of t_content.id
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.id
     *
     * @param id the value for t_content.id
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.title
     *
     * @return the value of t_content.title
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.title
     *
     * @param title the value for t_content.title
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.body
     *
     * @return the value of t_content.body
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public String getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.body
     *
     * @param body the value for t_content.body
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.url
     *
     * @return the value of t_content.url
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.url
     *
     * @param url the value for t_content.url
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.create_time
     *
     * @return the value of t_content.create_time
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.create_time
     *
     * @param createTime the value for t_content.create_time
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.user_id
     *
     * @return the value of t_content.user_id
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.user_id
     *
     * @param userId the value for t_content.user_id
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.status
     *
     * @return the value of t_content.status
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.status
     *
     * @param status the value for t_content.status
     *
     * @mbggenerated Thu Dec 25 11:21:32 CST 2014
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}