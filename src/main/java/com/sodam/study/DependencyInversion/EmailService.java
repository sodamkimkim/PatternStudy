package com.sodam.study.DependencyInversion;

// 저수준 모듈: 이메일 서비스 인터페이스를 구현한 클래스
public class EmailService implements IEmailService {

	@Override
	public void sendEmail(String recipient, String message) {
		System.out.println("Sending Email to " + recipient + ":" + message);
	}
} // end of class
