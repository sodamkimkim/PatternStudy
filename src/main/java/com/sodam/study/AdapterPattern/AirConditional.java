package com.sodam.study.AdapterPattern;

public class AirConditional implements IElectronic220v {

	@Override
	public void connect() {
		System.out.println("AirConditional 220v on");
	}

} // end of class
