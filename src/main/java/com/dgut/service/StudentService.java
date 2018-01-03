package com.dgut.service;

import com.dgut.bean.Student;
import com.dgut.bean.StudentExample;

public interface StudentService extends BaseService<Student, StudentExample> {

	//登录
	public Student login(String email,String password);
	//注册
	public Integer register(Student student);
	//检查邮箱是否可用
	public boolean checkEmail(String email);
}
