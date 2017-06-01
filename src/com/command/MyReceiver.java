package com.command;

public class MyReceiver implements Receiver {
	@Override
	public void action() {
		System.out.print("MyReceiver execute ");
	}
}
