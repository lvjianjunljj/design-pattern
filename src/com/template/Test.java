package com.template;

public class Test {
	public static void main(String[] args) {
		String exp = "8+2";
		AbstractCalculator calculator = new Plus();
		int res = calculator.calculate(exp, "\\+");
		System.out.println(exp + "=" + res);
	}
}
