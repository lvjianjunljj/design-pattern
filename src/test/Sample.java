package test;

import java.util.ArrayList;
import java.util.List;

public abstract class Sample {
	public String v = "000";
	public Sample() {
		// TODO Auto-generated constructor stub
	}
	public Sample(String v) {
		// TODO Auto-generated constructor stub
		this.v = v;
	}
	
	public void print() {
		System.out.println(v);
	}
}
