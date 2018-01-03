package com.dgut.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgut.bean.Forder;
import com.dgut.bean.ForderExample;
import com.dgut.bean.ForderExample.Criteria;
import com.dgut.bean.ForderExample.Criterion;
import com.dgut.bean.TeacherRequirementExample;
import com.dgut.dao.ForderMapper;
import com.dgut.dao.TeacherRequirementMapper;
import com.dgut.service.ForderService;

@Service
public class ForderServiceImpl extends BaseServiceImpl<Forder, ForderExample> implements ForderService{

	@Autowired
	ForderMapper forderMapper;
	
	@Autowired
	TeacherRequirementMapper teacherRequirementMapper;
	
	@Autowired
	public void setBaseMapper() {
		super.setBaseMapper(forderMapper);
	}

	@Override
	public List<Forder> selectMyForder(Integer id) {
		ForderExample example=new ForderExample();
		Criteria criteria=example.createCriteria();
		criteria.andStudentIdEqualTo(id);
		return forderMapper.selectByExample(example);
	}

	
	

}
