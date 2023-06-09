package com.sodam.study.FactoryMethodPattern;

public class MainTest {
	public static void main(String[] args) {
		Computer computer1 = ComputerFactory.getComputer("PC", "32", "1TB", "ARM");
		System.out.println(computer1);
		// 출력) Computer [getRAM()=32, getHDD()=1TB, getCPU()=ARM]

		Computer computer2 = ComputerFactory.getComputer("NoteBook", "16", "500", "Intel");
		System.out.println(computer2);
		// 출력) Computer [getRAM()=16, getHDD()=500, getCPU()=Intel]
	}
} // end of class
