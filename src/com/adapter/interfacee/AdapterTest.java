package com.adapter.interfacee;

public class AdapterTest {
	public static void main(String[] args) {
		Source source1 = new SourceSub1();
		Source source2 = new SourceSub2();

		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();
	}
}
