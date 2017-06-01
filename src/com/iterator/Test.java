package com.iterator;

public class Test {
	public static void main(String[] args) {
		Collection collection = new MyCollection(new String[] { "A", "B", "C",
				"D", "E" });
		Iterator it = collection.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
