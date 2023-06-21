package programs_practice;

public class Factorail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factorail is function multiplies a number by every number below it upto 1
		//Ex:5!=5*4*3*2*1--120
		
		int num=5;
		int total = 1;
		for(int i=1;i<=num;i++) { //int i=num;i>=1;i--
			total *= i;
		}
		System.out.println(total);

	}

}
