package com.vivek.jetdevs.entity;

import java.io.Serializable;

public class ObjectCachePool implements Serializable {
	private static final long serialVersionUID = -8251720055421576443L;

	private String key;
	private int value;

	public ObjectCachePool() {

	}

	public ObjectCachePool(String key, int value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
