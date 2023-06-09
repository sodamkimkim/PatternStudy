package com.sodam.study.AdapterPattern;

// 110v -> 220v로 변환해주는 클래스
public class ElectronicAdapter implements IElectronic220v {

	IElectronic110v electronic110v;

	public ElectronicAdapter(IElectronic110v iElectronic110v) {
		this.electronic110v = iElectronic110v;
	}

	@Override
	public void connect() {
		electronic110v.connect();
	}

} // end of class
