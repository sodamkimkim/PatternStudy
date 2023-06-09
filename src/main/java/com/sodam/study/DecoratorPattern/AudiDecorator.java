package com.sodam.study.DecoratorPattern;

// Decorator 클래스
// 기본 뼈대클래스를 유지하되, 이후 필요한 기능을 꾸밀 때 사용한다.
public class AudiDecorator implements ICar {
	protected ICar audi;
	protected String modelName;
	protected int modelPrice;

	public AudiDecorator(ICar audi, String modelName, int modelPrice) {
		this.audi = audi;
		this.modelName = modelName;
		this.modelPrice = modelPrice;
	}

	@Override
	public int getPrice() {
		return audi.getPrice() + modelPrice;
	}

	@Override
	public void showPrice() {
		System.out.println("Audi의 " + modelName + "가격은 " + getPrice() + "만원 입니다.");
	}

} // end of class
