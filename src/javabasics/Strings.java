package javabasics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in normal,string is a series of characters...
		//In java terminology,string is an object that represents sequence of characters.
		//there are two ways to create string object
		
		//1)string literal
		//here 1 object in java memory space called s and in that obj space it will store this value
		//you create  another vaiable s1 with same value now it will not create another obj for that
		//first it will if "RahulShetty" is present in memory for any variable,yes now it present for s onj
		//so now what it will do is insted of created new obj memory allocation it will point this s1 to this stored value only.
		
		String s="RahulShetty";
		String s1="RahulShetty";
		String s5="hello"; //now another obj is creted because value is different
		
		//2)new keyword
		//Another way,here two object will created because here you explicitly you are saying new keyword
		
		String s2=new String("Welcome Naveen Reddy");
		String s3=new String("Welcome");
		
		String[] splitedString= s2.split(" ");
		System.out.println(splitedString[2]);
		
		//reverse a string
		System.out.println(s2.length());
		for(int i=s2.length()-1;i>=0;i--) {
			System.out.print(s2.charAt(i));
		}
	}

}
