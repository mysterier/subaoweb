package com.subaozuche.comm.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class ViewObjectInforHelper {
	private static Map<String, String> orderTypes;
	private static Map<String, String> newsTypes;

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

	public static Map<String, String> getNewsTypes() {
		if (null == newsTypes || newsTypes.size() <= 0) {
			newsTypes = new LinkedHashMap<String, String>();
			newsTypes.put("0", "行业新闻");
			newsTypes.put("1", "公司新闻");
		}
		return newsTypes;
	}
}
