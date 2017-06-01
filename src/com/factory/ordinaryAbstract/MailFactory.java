package com.factory.ordinaryAbstract;

//工厂类
public class MailFactory implements Factory {
	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}
	
}
