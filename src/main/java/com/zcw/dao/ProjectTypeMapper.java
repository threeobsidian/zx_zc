package com.zcw.dao;

import com.zcw.entity.ProjectType;

public interface ProjectTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int insert(ProjectType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int insertSelective(ProjectType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    ProjectType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int updateByPrimaryKeySelective(ProjectType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Thu Aug 08 18:56:52 CST 2019
     */
    int updateByPrimaryKey(ProjectType record);
}