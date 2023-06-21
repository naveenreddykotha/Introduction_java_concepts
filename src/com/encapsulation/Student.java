package com.encapsulation;

public class Student {
	private int rollNumber;
	private String name;
	private boolean isAttended;
	
	public Student(int rollnumber,String name) {
		this.rollNumber=rollnumber;
		this.name=name;
	}
	
	public void setAttendance(boolean value) {
		isAttended=value;
		System.out.println("teacher assigned"+value);
	}
	public boolean getAttendance() {
		return isAttended;
	}

}
