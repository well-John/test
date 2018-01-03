package com.dgut.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgut.bean.Favorite;
import com.dgut.bean.FavoriteExample;
import com.dgut.bean.FavoriteExample.Criteria;
import com.dgut.dao.FavoriteMapper;
import com.dgut.service.FavoriteService;

@Service
public class FavoriteServiceImpl extends BaseServiceImpl<Favorite, FavoriteExample> implements FavoriteService{

	@Autowired
	FavoriteMapper favoriteMapper;
	
	@Autowired
	public void setBaseMapper() {
		super.setBaseMapper(favoriteMapper);
	}

	@Override
	public List<Favorite> selectAllFavorite(Integer id) {
		FavoriteExample example=new FavoriteExample();
		Criteria criteria=example.createCriteria();
		criteria.andStudentIdEqualTo(id);
		return favoriteMapper.selectByExample(example);
	}

}
