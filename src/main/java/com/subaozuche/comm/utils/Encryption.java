package com.subaozuche.comm.utils;

import java.security.MessageDigest;

public class Encryption {
	public static String md5(String txt) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(txt.getBytes("utf-8"));
			StringBuffer buf = new StringBuffer();
			for (byte b : md.digest()) {
				buf.append(String.format("%02x", b & 0xff));
			}
			return buf.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
