package com.tech.application.dictionary.service;

import java.util.List;

import com.tech.application.dictionary.entity.RegionQueryParams;
import com.tech.application.dictionary.model.Region;

public interface RegionService {
	
	List<Region> find(RegionQueryParams regionQueryParams);
	
}
