package com.visitor;

public class Test {
	public static void main(String[] args) {
		Subject subject = new MySubject();
		Visitor visitor = new MyVisitor();
		subject.accept(visitor);
	}
}
