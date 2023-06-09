package com.sodam.study.FactoryMethodPattern;

// # 슈퍼클래스
// - factory method pattern에 사용되는 슈퍼클래스는
// 인터페이스 / 추상클래스 / 일반 클래스 중 아무거나 OK
public abstract class Computer {
	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getHDD()=" + getHDD() + ", getCPU()=" + getCPU() + "]";
	}
} // end of class
