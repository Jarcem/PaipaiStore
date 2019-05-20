package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:14
  Purpose: 建议
*/

public class ProposalBean {
    private int proposal_id;
    private int user_id;
    private String proposal_content;
    private int proposal_time;
    private int proposal_status;

    public int getProposal_id() {
        return proposal_id;
    }

    public void setProposal_id(int proposal_id) {
        this.proposal_id = proposal_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getProposal_content() {
        return proposal_content;
    }

    public void setProposal_content(String proposal_content) {
        this.proposal_content = proposal_content;
    }

    public int getProposal_time() {
        return proposal_time;
    }

    public void setProposal_time(int proposal_time) {
        this.proposal_time = proposal_time;
    }

    public int getProposal_status() {
        return proposal_status;
    }

    public void setProposal_status(int proposal_status) {
        this.proposal_status = proposal_status;
    }
}
