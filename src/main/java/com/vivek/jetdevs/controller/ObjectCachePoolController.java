package com.vivek.jetdevs.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.jetdevs.entity.ObjectCachePool;
import com.vivek.jetdevs.service.ObjectCachePoolService;

@RestController
@RequestMapping("/pool")
public class ObjectCachePoolController {
	@Autowired
	private ObjectCachePoolService cachePoolService;

	@PostMapping("")
	public ResponseEntity<Map<String, Integer>> save(@RequestBody final List<ObjectCachePool> cachePools) {

		Map<String, Integer> returnMap = new HashMap<>();
		returnMap.put("total_objects", cachePoolService.save(cachePools));

		return ResponseEntity.ok(returnMap);
	}

	@GetMapping("/{key}")
	public ResponseEntity<Map<String, Integer>> get(@PathVariable String key) {
		ObjectCachePool objectCachePool = cachePoolService.get(key);
		
		if (objectCachePool != null) {
			Map<String, Integer> returnMap = new HashMap<>();
			returnMap.put("value", objectCachePool.getValue());
			return ResponseEntity.ok(returnMap);
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@DeleteMapping("/{key}")
	public ResponseEntity<Object> delete(@PathVariable String key) {
		return cachePoolService.delete(key) ? ResponseEntity.ok().build() : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
}
