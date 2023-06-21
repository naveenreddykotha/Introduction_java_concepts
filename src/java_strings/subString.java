package java_strings;

import java.util.Arrays;

public class subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Sachin Tendulakar";
		String s1=s.substring(7);
		System.out.println(s1);
		String s2=s.substring(0, 6);
		System.out.println(s2);
		CharSequence s3=s.subSequence(0, 6);
		System.out.println(s3);
		
		String text= new String("Hello, My name is Sachin");  
        /* Splits the sentence by the delimeter passed as an argument */  
        String[] sentences = text.split(" ");  
        System.out.println(Arrays.toString(sentences));  
		
	}

}
