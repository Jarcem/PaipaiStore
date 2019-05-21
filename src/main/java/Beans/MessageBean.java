package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 17:24
  Purpose: 短消息
*/

public class MessageBean {
    private int message_id;
    private String msg_info;
    private int receive_end;
    private int send_end;
    private int msg_status;
    private int msg_time;

    public MessageBean() {
    }

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public String getMsg_info() {
        return msg_info;
    }

    public void setMsg_info(String msg_info) {
        this.msg_info = msg_info;
    }

    public int getReceive_end() {
        return receive_end;
    }

    public void setReceive_end(int receive_end) {
        this.receive_end = receive_end;
    }

    public int getSend_end() {
        return send_end;
    }

    public void setSend_end(int send_end) {
        this.send_end = send_end;
    }

    public int getMsg_status() {
        return msg_status;
    }

    public void setMsg_status(int msg_status) {
        this.msg_status = msg_status;
    }

    public int getMsg_time() {
        return msg_time;
    }

    public void setMsg_time(int msg_time) {
        this.msg_time = msg_time;
    }
}
