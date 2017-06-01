package com.singleton;

public class ThreadTest extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println(Singleton7.getInstance().hashCode());
	}
}
