package programs_practice;

public class CountEvenandOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=3301318;
		double value=Math.random();
		System.out.println(value);
		
		int even_count=0;
		int odd_count=0;
		while(num>0) {
			int rem=num%10; //extracts last digit from num
			if(rem%2 == 0) {
				even_count++;
				System.out.println(rem);
			}
			else {
				odd_count++;
			}
			num=num/10; //eleminated last digit
		}
		System.out.println("even count:"+even_count);
		System.out.println("odd count:"+odd_count);
	}

}
