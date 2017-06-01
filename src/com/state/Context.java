package com.state;

public class Context {
	private State state;
	
	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void method() {
		if (state.getValue().equals("method1")) {
			state.method1();
		} else if (state.getValue().equals("method2")) {
			state.method2();
		}
	}

}
