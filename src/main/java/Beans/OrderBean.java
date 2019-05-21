package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 17:26
  Purpose: 订单
*/

import java.math.BigDecimal;

public class OrderBean {
    private int order_id;
    private int order_no;
    private BigDecimal order_amount;
    private BigDecimal order_delivery_free;
    private int order_payment_part;
    private int order_status;
    private int order_delivery_man_id;
    private String order_recipient;
    private int order_recipient_address;
    private String order_note;
    private int order_activity;
    private String order_remarks;
    private int order_ordertime;
    private int order_paymenttime;

    public OrderBean() {
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_no() {
        return order_no;
    }

    public void setOrder_no(int order_no) {
        this.order_no = order_no;
    }

    public BigDecimal getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(BigDecimal order_amount) {
        this.order_amount = order_amount;
    }

    public BigDecimal getOrder_delivery_free() {
        return order_delivery_free;
    }

    public void setOrder_delivery_free(BigDecimal order_delivery_free) {
        this.order_delivery_free = order_delivery_free;
    }

    public int getOrder_payment_part() {
        return order_payment_part;
    }

    public void setOrder_payment_part(int order_payment_part) {
        this.order_payment_part = order_payment_part;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public int getOrder_delivery_man_id() {
        return order_delivery_man_id;
    }

    public void setOrder_delivery_man_id(int order_delivery_man_id) {
        this.order_delivery_man_id = order_delivery_man_id;
    }

    public String getOrder_recipient() {
        return order_recipient;
    }

    public void setOrder_recipient(String order_recipient) {
        this.order_recipient = order_recipient;
    }

    public int getOrder_recipient_address() {
        return order_recipient_address;
    }

    public void setOrder_recipient_address(int order_recipient_address) {
        this.order_recipient_address = order_recipient_address;
    }

    public String getOrder_note() {
        return order_note;
    }

    public void setOrder_note(String order_note) {
        this.order_note = order_note;
    }

    public int getOrder_activity() {
        return order_activity;
    }

    public void setOrder_activity(int order_activity) {
        this.order_activity = order_activity;
    }

    public String getOrder_remarks() {
        return order_remarks;
    }

    public void setOrder_remarks(String order_remarks) {
        this.order_remarks = order_remarks;
    }

    public int getOrder_ordertime() {
        return order_ordertime;
    }

    public void setOrder_ordertime(int order_ordertime) {
        this.order_ordertime = order_ordertime;
    }

    public int getOrder_paymenttime() {
        return order_paymenttime;
    }

    public void setOrder_paymenttime(int order_paymenttime) {
        this.order_paymenttime = order_paymenttime;
    }
}
