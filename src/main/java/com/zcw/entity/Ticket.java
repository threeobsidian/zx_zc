package com.zcw.entity;

public class Ticket {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ticket.id
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ticket.memberid
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    private Integer memberid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ticket.piid
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    private String piid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ticket.status
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ticket.authcode
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    private String authcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ticket.pstep
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    private String pstep;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ticket.id
     *
     * @return the value of t_ticket.id
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ticket.id
     *
     * @param id the value for t_ticket.id
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ticket.memberid
     *
     * @return the value of t_ticket.memberid
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public Integer getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ticket.memberid
     *
     * @param memberid the value for t_ticket.memberid
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ticket.piid
     *
     * @return the value of t_ticket.piid
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public String getPiid() {
        return piid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ticket.piid
     *
     * @param piid the value for t_ticket.piid
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public void setPiid(String piid) {
        this.piid = piid == null ? null : piid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ticket.status
     *
     * @return the value of t_ticket.status
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ticket.status
     *
     * @param status the value for t_ticket.status
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ticket.authcode
     *
     * @return the value of t_ticket.authcode
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public String getAuthcode() {
        return authcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ticket.authcode
     *
     * @param authcode the value for t_ticket.authcode
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public void setAuthcode(String authcode) {
        this.authcode = authcode == null ? null : authcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ticket.pstep
     *
     * @return the value of t_ticket.pstep
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public String getPstep() {
        return pstep;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ticket.pstep
     *
     * @param pstep the value for t_ticket.pstep
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public void setPstep(String pstep) {
        this.pstep = pstep == null ? null : pstep.trim();
    }
}