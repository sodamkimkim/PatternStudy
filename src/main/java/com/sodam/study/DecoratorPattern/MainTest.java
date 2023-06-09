package com.sodam.study.DecoratorPattern;

public class MainTest {
	public static void main(String[] args)
	{
		ICar audi = new Audi(1_000);
		audi.showPrice();
		
		ICar a3 = new A3(audi, "A3", 2_000);
		a3.showPrice();
	}
} // end of class
