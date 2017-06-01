package com.adapter.object;

public class Adapter implements Targetable {
	private Source source;
	
	public Adapter(Source source) {
		this.source = source;
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}
	
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method!");
	}
}
