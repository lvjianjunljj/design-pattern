package com.facade;

public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		// TODO Auto-generated constructor stub
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk = new Disk();
	}

	public void startup() {
		System.out.println("Computer startup begin...");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("Computer startup end...");
	}

	public void shutdown() {
		System.out.println("Computer shutdown begin...");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("Computer shutdown end...");
	}

}
