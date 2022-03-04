package com.vivek.jetdevs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vivek.jetdevs.entity.ObjectCachePool;

@Service
public interface ObjectCachePoolService {

	int save(List<ObjectCachePool> cachePools);
	
	ObjectCachePool get(String key);
	
	boolean delete(String key);
}
