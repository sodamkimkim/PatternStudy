package com.sodam.study.LiskovSubstitution;

// 클라이언트 코드
public class Client {
	public static void printArea(Shape shape) {
		double area = shape.calculateArea();
		System.out.println("도형의 넓이 : " + area);
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(4, 5);
		printArea(rectangle); // 출력: 도형의 넓이 : 20.0

		Square square = new Square(5);
		printArea(square); // 출력: 도형의 넓이 : 25.0
	}
} // end of class
