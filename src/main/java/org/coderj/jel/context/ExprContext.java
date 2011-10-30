package org.coderj.jel.context;


import java.util.HashMap;
import java.util.Map;

public class ExprContext {

	private Map<String, Integer> map = new HashMap<String, Integer>();

	public Integer getValue(String key) {
		return map.get(key) != null ? map.get(key) : 0;
	}

	public void put(String key, Integer value) {
		map.put(key, value);
	}

}
