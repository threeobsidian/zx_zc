package com.zcw.entity;

public class Tag {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.id
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.pid
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.name
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tag.id
     *
     * @return the value of t_tag.id
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tag.id
     *
     * @param id the value for t_tag.id
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tag.pid
     *
     * @return the value of t_tag.pid
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tag.pid
     *
     * @param pid the value for t_tag.pid
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tag.name
     *
     * @return the value of t_tag.name
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tag.name
     *
     * @param name the value for t_tag.name
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}