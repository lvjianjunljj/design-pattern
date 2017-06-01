package com.factory.ordinaryAbstract;

//工厂类
public class SmsFactory implements Factory {
	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}
	
}
