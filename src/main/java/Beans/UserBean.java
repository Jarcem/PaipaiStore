package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:25
  Purpose: 用户
*/

public class UserBean {
    private int user_id;
    private String user_account;
    private String user_password;
    private int user_type;
    private String user_name;
    private int user_sex;
    private int user_birthday;
    private int user_phone_number;
    private int user_qq_number;
    private int account_status;
    private int achievement_id;
    private String pack;
    private int register_date;

    public UserBean() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(int user_sex) {
        this.user_sex = user_sex;
    }

    public int getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(int user_birthday) {
        this.user_birthday = user_birthday;
    }

    public int getUser_phone_number() {
        return user_phone_number;
    }

    public void setUser_phone_number(int user_phone_number) {
        this.user_phone_number = user_phone_number;
    }

    public int getUser_qq_number() {
        return user_qq_number;
    }

    public void setUser_qq_number(int user_qq_number) {
        this.user_qq_number = user_qq_number;
    }

    public int getAccount_status() {
        return account_status;
    }

    public void setAccount_status(int account_status) {
        this.account_status = account_status;
    }

    public int getAchievement_id() {
        return achievement_id;
    }

    public void setAchievement_id(int achievement_id) {
        this.achievement_id = achievement_id;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public int getRegister_date() {
        return register_date;
    }

    public void setRegister_date(int register_date) {
        this.register_date = register_date;
    }
}
