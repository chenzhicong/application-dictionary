package com.tech.application.dictionary.dao;

import java.util.List;

import com.tech.application.base.dao.mybatis.BaseDao;
import com.tech.application.dictionary.entity.RegionQueryParams;
import com.tech.application.dictionary.model.Region;

public interface RegionMapper extends BaseDao<Region, Region, String> {
	
	List<Region> find(RegionQueryParams regionQueryParams);
}