package com.interfaces;

public abstract class SampleAC implements Laptop {

	@Override
	public void copy() {
		System.out.println("Overall copy code");
		
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("Overall paste code");
	}
	public abstract void keyword();
	
	public void restart() {
		System.out.println("system restarted...");
	}
	

	

}
