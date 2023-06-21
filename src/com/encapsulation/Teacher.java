package com.encapsulation;

public class Teacher {
	
	public static void main(String[] args) {
		Student std1=new Student(101, "naveen");
		//std1.isAttended=true;
		std1.setAttendance(true);
		System.out.println(std1.getAttendance());
	}
	
}
