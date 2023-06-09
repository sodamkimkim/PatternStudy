package com.sodam.study.AdapterPattern;

public class HairDryer implements IElectronic110v{

	@Override
	public void connect() {
		System.out.println("HairDryer 110v on");
	}

} // end of class
