package com.command;

public class Test {
	public static void main(String[] args) {
		Receiver receiver = new MyReceiver();
		Command command = new MyCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.action();
	}
}
