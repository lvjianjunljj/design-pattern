package com.iterator;

public interface Iterator {
	/*前移*/
	public Object previous();
	
	/*后移*/
	public Object next();
	
	public boolean hasNext();
	
	/*第一个*/
	public Object first();
}
