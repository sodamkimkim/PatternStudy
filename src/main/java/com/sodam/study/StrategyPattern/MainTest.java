package com.sodam.study.StrategyPattern;

public class MainTest {
	public static void main(String[] args)
	{
		String text = "http://localhost:9090/user?username=abc";
		Encoder encoder = new Encoder();
		
		AppendStrategy appendStrategy = new AppendStrategy();
		Base64Strategy base64Strategy = new Base64Strategy();
		HttpStrategy httpStrategy = new HttpStrategy();
		NormalStrategy normalStrategy = new NormalStrategy();
		
		//encoder.setEncodingStrategy(appendStrategy);
		encoder.setEncodingStrategy(base64Strategy);
		//encoder.setEncodingStrategy(normalStrategy);
		
		System.out.println(encoder.getMessage(text));
		encoder.setEncodingStrategy(httpStrategy);
		System.out.println(encoder.getMessage(text));
	}
	
} // end of class
