package com.decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		Source source = new Source();
		Decorator decorator = new Decorator(source);
		decorator.method();
	}
}
