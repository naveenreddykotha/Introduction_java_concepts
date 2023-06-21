package programs_practice;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 using + string concatination
		
		String str="naveen";
		String rev="";
		/*
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		} */
		
		//2 using toCharArray() method
		/*char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev += ch[i];
		}*/
		
		//3 using StringBuffer class
		StringBuffer sb=new StringBuffer(str);
		StringBuffer reverse=sb.reverse();
		
		System.out.println(reverse);
	}

}
