package com.factory.ordinaryStatic;

public class FactoryTest {
	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.send();
	}
}