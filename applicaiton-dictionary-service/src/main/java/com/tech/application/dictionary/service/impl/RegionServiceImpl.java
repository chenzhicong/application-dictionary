package com.tech.application.dictionary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tech.application.dictionary.dao.RegionMapper;
import com.tech.application.dictionary.entity.RegionQueryParams;
import com.tech.application.dictionary.model.Region;
import com.tech.application.dictionary.service.RegionService;

public class RegionServiceImpl implements RegionService {
	
	@Autowired
	private RegionMapper regionMapper;

	public List<Region> find(RegionQueryParams regionQueryParams) {
		return regionMapper.find(regionQueryParams);
	}

}
