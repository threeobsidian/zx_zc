package com.zcw.entity;

public class AccountTypeCert {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_type_cert.id
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_type_cert.accttype
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    private String accttype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_type_cert.certid
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    private Integer certid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_type_cert.id
     *
     * @return the value of t_account_type_cert.id
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_type_cert.id
     *
     * @param id the value for t_account_type_cert.id
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_type_cert.accttype
     *
     * @return the value of t_account_type_cert.accttype
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public String getAccttype() {
        return accttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_type_cert.accttype
     *
     * @param accttype the value for t_account_type_cert.accttype
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public void setAccttype(String accttype) {
        this.accttype = accttype == null ? null : accttype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_type_cert.certid
     *
     * @return the value of t_account_type_cert.certid
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public Integer getCertid() {
        return certid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_type_cert.certid
     *
     * @param certid the value for t_account_type_cert.certid
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public void setCertid(Integer certid) {
        this.certid = certid;
    }
}