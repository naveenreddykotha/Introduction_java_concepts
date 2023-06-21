package programs_practice;

public class Swapping2nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; int b=20;
		System.out.println("Before swapping:"+a+" "+b);
		//1 using third variable
		/* int t=a;
		a=b;
		b=t;
		System.out.println("After swapping:"+a+" "+b);
		*/
		//2 using + & - operators
		/*a=a+b;
		b=a-b;
		a=a-b;  */
		
		//3 using * and / operators
		//this will not if any variable value is 0
		a=a*b; //a=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20
		
		
		System.out.println("After swapping:"+a+" "+b);
	}

}
