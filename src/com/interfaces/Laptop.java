package com.interfaces;

public interface Laptop {
	public void copy();
	
	public void paste();
	
	public void keyboard();
	
	default void security() {
		commomCode();
		System.out.println("Laptop security code");
	}
	
	static void audio() {
		commomCode();
		System.out.println("LAptop audio code");
	}
	
	private static void commomCode() {
		System.out.println("reuse commoncode");
	}

}
