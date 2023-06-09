package com.sodam.study.DependencyInversion;

// 고수준 모듈: 이메일 발송 기능을 사용하는 클래스
public class EmailSender {
	private IEmailService emailService;
	public EmailSender(IEmailService emailService)
	{
		this.emailService = emailService;
	}
	public void SendEmail(String recipient, String message)
	{
		emailService.sendEmail(recipient, message);
	}
} // end of class