package com.interpreter;

public class Test {
	public static void main(String[] args) {
		Expression plus = new Plus();
		Context plusContest = new Context(9, 2);
		Expression minus = new Minus();
		int tmp = plus.interpret(plusContest);
		Context minusContest = new Context(tmp, 8);
		int result = minus.interpret(minusContest);
		System.out.println(result);
	}
}
