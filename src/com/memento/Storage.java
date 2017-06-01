package com.memento;

public class Storage {
	private Memento memento;
	
	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemnto(Memento memento) {
		this.memento = memento;
	}
	
}
