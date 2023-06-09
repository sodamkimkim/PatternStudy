package com.sodam.study.AdapterPattern;

public class Cleaner implements IElectronic110v {

	@Override
	public void connect() {
		System.out.println("Cleaner 110v on");
	}
} // end of class
