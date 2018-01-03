package com.dgut.service;

import java.util.List;

import com.dgut.bean.Teacher;
import com.dgut.bean.TeacherExample;

public interface TeacherService extends BaseService<Teacher, TeacherExample> {

	public Teacher login(String email, String password);
	
	public Integer register(Teacher teacher);
	
	public List<Teacher> selecTeachersByExample(String subject,String university,String area,Integer identity,Integer sex);

}
