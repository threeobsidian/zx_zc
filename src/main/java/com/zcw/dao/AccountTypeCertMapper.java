package com.zcw.dao;

import com.zcw.entity.AccountTypeCert;

public interface AccountTypeCertMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int insert(AccountTypeCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int insertSelective(AccountTypeCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    AccountTypeCert selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int updateByPrimaryKeySelective(AccountTypeCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int updateByPrimaryKey(AccountTypeCert record);
}