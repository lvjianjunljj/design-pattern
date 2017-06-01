package com.strategy;

public class Test {
	public static void main(String[] args) {
		ICalculator calculator = new Plus();
		String exp = "8+2";
		System.out.println(exp + "=" + calculator.calculate(exp));
	}
}
