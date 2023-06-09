package com.sodam.study.StrategyPattern;

public class NormalStrategy implements EncodingStrategy {

	@Override
	public String encode(String text) {
		return text;
	}

} // end of class
