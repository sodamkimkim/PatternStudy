package com.sodam.study.LiskovSubstitution;

// 사각형 클래스
public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

} // end of class
