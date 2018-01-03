package com.dgut.service;

import java.util.List;

import com.dgut.bean.TeacherRequirement;
import com.dgut.bean.TeacherRequirementExample;

public interface TeacherRequirementService extends BaseService<TeacherRequirement,TeacherRequirementExample> {

	public List<TeacherRequirement> selecTeacherRequirementsByExample(String area,String grade,Integer sex,Integer identity,String subject);
	
}
