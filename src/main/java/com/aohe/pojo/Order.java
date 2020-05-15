package com.aohe.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.id
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.user_id
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.order_no
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Long orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.shipping_id
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Integer shippingId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.payment
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private BigDecimal payment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.payment_type
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Integer paymentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.postage
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Integer postage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.status
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.payment_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Date paymentTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.send_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Date sendTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.end_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.close_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Date closeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.create_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_order.update_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.id
     *
     * @return the value of aohe_order.id
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.id
     *
     * @param id the value for aohe_order.id
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.user_id
     *
     * @return the value of aohe_order.user_id
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.user_id
     *
     * @param userId the value for aohe_order.user_id
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.order_no
     *
     * @return the value of aohe_order.order_no
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Long getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.order_no
     *
     * @param orderNo the value for aohe_order.order_no
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.shipping_id
     *
     * @return the value of aohe_order.shipping_id
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Integer getShippingId() {
        return shippingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.shipping_id
     *
     * @param shippingId the value for aohe_order.shipping_id
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.payment
     *
     * @return the value of aohe_order.payment
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.payment
     *
     * @param payment the value for aohe_order.payment
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.payment_type
     *
     * @return the value of aohe_order.payment_type
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.payment_type
     *
     * @param paymentType the value for aohe_order.payment_type
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.postage
     *
     * @return the value of aohe_order.postage
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Integer getPostage() {
        return postage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.postage
     *
     * @param postage the value for aohe_order.postage
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.status
     *
     * @return the value of aohe_order.status
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.status
     *
     * @param status the value for aohe_order.status
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.payment_time
     *
     * @return the value of aohe_order.payment_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.payment_time
     *
     * @param paymentTime the value for aohe_order.payment_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.send_time
     *
     * @return the value of aohe_order.send_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.send_time
     *
     * @param sendTime the value for aohe_order.send_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.end_time
     *
     * @return the value of aohe_order.end_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.end_time
     *
     * @param endTime the value for aohe_order.end_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.close_time
     *
     * @return the value of aohe_order.close_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.close_time
     *
     * @param closeTime the value for aohe_order.close_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.create_time
     *
     * @return the value of aohe_order.create_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.create_time
     *
     * @param createTime the value for aohe_order.create_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_order.update_time
     *
     * @return the value of aohe_order.update_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_order.update_time
     *
     * @param updateTime the value for aohe_order.update_time
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}