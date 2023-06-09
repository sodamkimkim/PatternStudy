package com.sodam.study.AdapterPattern;

public class MyHouse {
	// 가정에서는 220v를 쓴다는 가정 ㄱ
	public static void homeConnect(IElectronic220v electronic220v) {
		electronic220v.connect();
	}

	public static void main(String[] args) {
		homeConnect(new AirConditional()); // 220v electronic은 변환 필요x, 출력) AirConditional 220v on
		homeConnect(new ElectronicAdapter(new HairDryer())); // 110v -> 220v 변환, 출력) HairDryer 110v on
		homeConnect(new ElectronicAdapter(new Cleaner())); // 110v -> 220v 변환, 출력) Cleaner 110v on
	}
} // end of class
