package com.sodam.study.DependencyInversion;

// 추상화된 인터페이스
public interface IEmailService {
	void sendEmail(String recipient, String message);
} // end of interface
