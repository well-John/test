package com.dgut.dao;

import com.dgut.bean.Teacher;
import com.dgut.bean.TeacherRequirement;
import com.dgut.bean.TeacherRequirementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherRequirementMapper extends BaseMapper<TeacherRequirement, TeacherRequirementExample>{
    long countByExample(TeacherRequirementExample example);

    int deleteByExample(TeacherRequirementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeacherRequirement record);

    int insertSelective(TeacherRequirement record);

    List<TeacherRequirement> selectByExample(TeacherRequirementExample example);

    TeacherRequirement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeacherRequirement record, @Param("example") TeacherRequirementExample example);

    int updateByExample(@Param("record") TeacherRequirement record, @Param("example") TeacherRequirementExample example);

    int updateByPrimaryKeySelective(TeacherRequirement record);

    int updateByPrimaryKey(TeacherRequirement record);
}