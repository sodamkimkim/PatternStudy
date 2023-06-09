package com.sodam.study.DependencyInversion;

// 클라이언트 코드
public class Client {
	public static void main(String[] args)
	{
		IEmailService emailService = new EmailService();
		EmailSender emailSender = new EmailSender(emailService);
		emailSender.SendEmail("example@example.com", "Hello, World!");
	}
} // end of class
