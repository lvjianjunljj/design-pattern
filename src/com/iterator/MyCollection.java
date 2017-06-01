package com.iterator;

public class MyCollection implements Collection {
	private String[] strs;
	
	public MyCollection(String[] strs) {
		this.strs = strs;
	}
	
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}
	
	@Override
	public Object get(int index) {
		return strs[index];
	}
	
	@Override
	public int size() {
		return strs.length;
	}
}
