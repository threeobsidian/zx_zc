package com.zcw.dao;

import com.zcw.entity.MemberAddress;

public interface MemberAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_address
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_address
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int insert(MemberAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_address
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int insertSelective(MemberAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_address
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    MemberAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_address
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int updateByPrimaryKeySelective(MemberAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_address
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int updateByPrimaryKey(MemberAddress record);
}