package com.dgut.service;

import java.util.List;

import com.dgut.bean.Favorite;
import com.dgut.bean.FavoriteExample;

public interface FavoriteService extends BaseService<Favorite, FavoriteExample>{

	List<Favorite> selectAllFavorite(Integer id);

}
