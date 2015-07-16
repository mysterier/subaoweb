package com.subaozuche.comm.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class ViewObjectInforHelper {
	private static Map<String, String> orderTypes;

	public static Map<String, String> getOrderTypes() {
		if (null == orderTypes || orderTypes.size() <= 0) {
			orderTypes = new LinkedHashMap<String, String>();
			orderTypes.put("1", "日租");
			orderTypes.put("2", "长租");
			orderTypes.put("3", "机场接送");
			orderTypes.put("4", "其它");
		}
		return orderTypes;
	}
}
