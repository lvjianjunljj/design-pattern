package com.chain;

public class MyHandler extends AbstractHandler implements Handler {
	private String name;
	public MyHandler(String name) {
		this.name = name;
	}
	@Override
	public void operator() {
		System.out.println(name + " operate...");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}
}
