package com.sodam.study.DecoratorPattern;

public class Audi implements ICar{
	int modelPrice;
	
	public Audi(int modelPrice)
	{
		this.modelPrice = modelPrice;
	}
	
	@Override
	public int getPrice() {
		return modelPrice;
	}

	@Override
	public void showPrice() {
		System.out.println("가격은 " + modelPrice + "만원입니다.");
	}

} // end of class
