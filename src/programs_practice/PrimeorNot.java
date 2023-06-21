package programs_practice;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first check whether number is > 1 that means natural number
		//A number divisible by itself and 1 is prime number
		//Ex:2,3,5,7,11,13,17.....
		
		int number=9;
		int count=0;
		if(number>1) {
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(number+" is a prime number");
			}
			else {
				System.out.println("Not a prime Number");
			}
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}
