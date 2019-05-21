package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:11
  Purpose: 订单收货地址
*/

public class OrderRecipientAddressBean {
    private int order_recipient_address_id;
    private String address_level_1;
    private String address_level_2;
    private String address_level_3;
    private String address_level_4;
    private String address_level_5;
    private String address_level_6;
    private String address_free;
    private int address_status;

    public OrderRecipientAddressBean() {
    }

    public int getOrder_recipient_address_id() {
        return order_recipient_address_id;
    }

    public void setOrder_recipient_address_id(int order_recipient_address_id) {
        this.order_recipient_address_id = order_recipient_address_id;
    }

    public String getAddress_level_1() {
        return address_level_1;
    }

    public void setAddress_level_1(String address_level_1) {
        this.address_level_1 = address_level_1;
    }

    public String getAddress_level_2() {
        return address_level_2;
    }

    public void setAddress_level_2(String address_level_2) {
        this.address_level_2 = address_level_2;
    }

    public String getAddress_level_3() {
        return address_level_3;
    }

    public void setAddress_level_3(String address_level_3) {
        this.address_level_3 = address_level_3;
    }

    public String getAddress_level_4() {
        return address_level_4;
    }

    public void setAddress_level_4(String address_level_4) {
        this.address_level_4 = address_level_4;
    }

    public String getAddress_level_5() {
        return address_level_5;
    }

    public void setAddress_level_5(String address_level_5) {
        this.address_level_5 = address_level_5;
    }

    public String getAddress_level_6() {
        return address_level_6;
    }

    public void setAddress_level_6(String address_level_6) {
        this.address_level_6 = address_level_6;
    }

    public String getAddress_free() {
        return address_free;
    }

    public void setAddress_free(String address_free) {
        this.address_free = address_free;
    }

    public int getAddress_status() {
        return address_status;
    }

    public void setAddress_status(int address_status) {
        this.address_status = address_status;
    }
}
