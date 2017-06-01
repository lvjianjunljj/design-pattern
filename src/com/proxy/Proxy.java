package com.proxy;

public class Proxy implements Sourceable {
	private Source source;

	public Proxy() {
		// TODO Auto-generated constructor stub
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();
		after();
	}

	private void before() {
		System.out.println("before the original method!");
	}

	private void after() {
		System.out.println("after the original method!");
	}
}
