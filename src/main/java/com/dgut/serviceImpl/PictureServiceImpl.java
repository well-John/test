package com.dgut.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgut.bean.Picture;
import com.dgut.bean.PictureExample;
import com.dgut.dao.PictureMapper;
import com.dgut.service.PictureService;

@Service
public class PictureServiceImpl extends BaseServiceImpl<Picture, PictureExample> implements PictureService{

	@Autowired
	PictureMapper pictureMapper;
	
	@Autowired
	public void setBaseMapper() {
		super.setBaseMapper(pictureMapper);
	}

}
