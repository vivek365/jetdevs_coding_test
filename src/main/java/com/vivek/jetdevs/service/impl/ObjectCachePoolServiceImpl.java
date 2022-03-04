package com.vivek.jetdevs.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.vivek.jetdevs.entity.ObjectCachePool;
import com.vivek.jetdevs.service.ObjectCachePoolService;

@Service
public class ObjectCachePoolServiceImpl implements ObjectCachePoolService {
	Map<String, Integer> cached = new HashMap<>();

	@Override
	public int save(List<ObjectCachePool> cachePools) {
		cachePools.forEach(cachePool -> cached.put(cachePool.getKey(), cachePool.getValue()));
		return cached.size();
	}

	@Override
	public ObjectCachePool get(String key) {
		return cached.get(key) != null ? new ObjectCachePool(key, cached.get(key)) : null;
	}

	@Override
	public boolean delete(String key) {
		return cached.remove(key) != null;
	}

}
