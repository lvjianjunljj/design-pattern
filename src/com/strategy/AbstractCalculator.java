package com.strategy;

public abstract class AbstractCalculator {
	public int[] split(String exp, String opt) {
		String[] array = exp.split(opt);
		return new int[]{Integer.parseInt(array[0]), Integer.parseInt(array[1])};
	}
}
