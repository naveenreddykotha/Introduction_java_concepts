package com.inheritance;

public class Admin extends Developer{
	
	public void manage() {
		super.read();
		write();
		System.out.println("only managed by Admins...");
	}
	public void read() {
		System.out.println("Admin read");
	}

}
