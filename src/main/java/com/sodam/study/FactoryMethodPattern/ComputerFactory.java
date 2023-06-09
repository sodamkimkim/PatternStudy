package com.sodam.study.FactoryMethodPattern;

// # Factory class
public class ComputerFactory {
	// 1. static 메서드를 활용한다.
	// 2. 매개변수 type값에 따라 객체를 생성할 수 있게 설계한다.
	public static Computer getComputer(String type, String ram, String hdd, String cpu)
	{
		if(type.equalsIgnoreCase("PC"))
		{
			return new PC(ram, hdd, cpu);
		}
		else if(type.equalsIgnoreCase("NoteBook"))
		{
			return new NoteBook(ram, hdd, cpu);
		}
		return null;
	}
} // end of class
