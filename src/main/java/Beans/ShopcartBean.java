package Beans;

/*
  Author: Jarcem
  Date: 2019/5/26
  Time: 12:37
  Purpose: 购物车
*/

public class ShopcartBean {
    private int shopcart_id;
    private int shopcart_user_id;
    private int shopcart_amount;
    private String shopcart_content;

    public ShopcartBean() {
    }

    public int getShopcart_id() {
        return shopcart_id;
    }

    public void setShopcart_id(int shopcart_id) {
        this.shopcart_id = shopcart_id;
    }

    public int getShopcart_user_id() {
        return shopcart_user_id;
    }

    public void setShopcart_user_id(int shopcart_user_id) {
        this.shopcart_user_id = shopcart_user_id;
    }

    public int getShopcart_amount() {
        return shopcart_amount;
    }

    public void setShopcart_amount(int shopcart_amount) {
        this.shopcart_amount = shopcart_amount;
    }

    public String getShopcart_content() {
        return shopcart_content;
    }

    public void setShopcart_content(String shopcart_content) {
        this.shopcart_content = shopcart_content;
    }
}
