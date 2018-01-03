package com.dgut.service;

import java.util.List;

import com.dgut.bean.Forder;
import com.dgut.bean.ForderExample;

public interface ForderService extends BaseService<Forder, ForderExample> {

	List<Forder> selectMyForder(Integer id);
	

}
