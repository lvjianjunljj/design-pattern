package com.decorator;

public class Decorator implements Sourceable {
	private Source source;

	public Decorator(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before the original method!");
		source.method();
		System.out.println("after the original method!");
	}
}
