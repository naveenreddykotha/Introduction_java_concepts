package com.interfaces;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop lenovo=new Lenovo();
		lenovo.copy();
		
		
		Hp hp=new Hp();
		hp.copy();
		hp.hpsystem();
		
		Laptop.audio();

	}

}
