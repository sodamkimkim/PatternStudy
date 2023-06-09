package com.sodam.study.StrategyPattern;

import java.net.URLEncoder;

public class HttpStrategy implements EncodingStrategy{

	@Override
	public String encode(String text) {
		String url = null;
		try {
			url = URLEncoder.encode(text, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return url;
	}
} // end of class
