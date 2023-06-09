package com.sodam.study.DecoratorPattern;

public class A3 extends AudiDecorator{

	public A3(ICar audi, String modelName, int modelPrice) {
		super(audi, modelName, 2_000);
	}
	
} // end of class
