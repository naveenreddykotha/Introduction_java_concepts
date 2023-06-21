package programs_practice;

import java.util.Scanner;

public class Reverse_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		
		int num=sc.nextInt();
		//1 using algorithm
		/*int rev=0;
		while(num !=0) {
			rev=rev*10+num%10; // this will return last digit of number
			num = num/10; //this will eliminates last digit from number
			
		}
		System.out.println("reverse number:"+rev); */
		
		//2 using StringBuffer
		/*StringBuffer st=new StringBuffer(String.valueOf(num));
		StringBuffer rev=st.reverse();
		System.out.println(rev); */
		
		//using StrinBuilder
		StringBuilder sb=new StringBuilder(String.valueOf(num));
		StringBuilder rev=sb.reverse();
		System.out.println(rev);
	}

}
