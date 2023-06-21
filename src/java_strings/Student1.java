package java_strings;

public class Student1 {
	
	public static void main(String args[]) {
		String s="Sachin"; //String Literal
		s=s.concat(" Tendulkar");
		System.out.println(s);
		String s1="Sachin";
		String s2="sachin";
		String s3=new String("Sachin");
		
		System.out.println(s1.equals(s1));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
	}

}
