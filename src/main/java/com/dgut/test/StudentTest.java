package com.dgut.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dgut.bean.Appointment;
import com.dgut.bean.Student;
import com.dgut.bean.TeacherRequirement;
import com.dgut.service.AppointmentService;
import com.dgut.service.StudentService;
import com.dgut.service.TeacherRequirementService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class StudentTest {
	
	@Autowired
	TeacherRequirementService teacherRequirementService;
	
	

	@Autowired
	StudentService studentService;
	
	@Autowired
	AppointmentService appointmentService;
	
	@Test
	public void test(){
		
		List<Student> list=studentService.selectAll();
		
	/*	Student student=new Student();
		
		student.setName("John1");
		student.setEmail("2357556894@qq.com");

		student.setPassword("111");
		System.out.println(studentService.selectByPrimaryKey(3));
		*/
		//studentService.insert(student);
		//studentService.selectByExample(null);
		/*Student student=new Student();
		student.setId(2);
		student.setName("john2");
		student.setPassword("19000");
		studentService.updateByPrimaryKeySelective(student);*/
		//System.out.println(studentService.login("2357556894@qq.com", "123456"));
		/*TeacherRequirement teacherRequirement=new TeacherRequirement();
		teacherRequirement.setAge("11");
		teacherRequirementService.insertSelective(teacherRequirement);*/
	}
	
	@Test
	public void test2(){
		Appointment appointment=new Appointment();
		appointment.setOrganiser(2);
		appointment.setStatus(1);
		appointment.setStudentId(3);
		appointment.setTeacherId(4);
		appointment.setTeacherName("谢小天");
		appointment.setAppointmentDate(new Date());
		appointmentService.insertSelective(appointment);
		
	}
}
