package com.sodam.study.StrategyPattern;

// 매개변수로 받은 text에 Append 특정 text해주는 Strategy
public class AppendStrategy implements EncodingStrategy{

	@Override
	public String encode(String text) {
		return "부트 캠프 : " + text;
	}
	
} // end of class
