package programs_practice;

import java.util.Random;

public class GenerateRandomNum_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 we have random class in java
		Random random=new Random();
		int num=random.nextInt(10); //this will generate numbers btw 0-9 //if you give 1000 it generates 0-999
		System.out.println(num);
		System.out.println(random.nextDouble(100)); //ranges from 0.0 < 1.0
		
		//2 using Math
		//in this it generates decimal values
		System.out.println(Math.random());
		
		//3 Apache commmons - langs API
		//you need to download jar file from website and add it in java build path
		//String ranNum=RandomStringUtils.randomNumeric(10); //this will generates 10 digits number
		//System.out.println(ranNum);
		
		//String ranString=RandomStringUtils.randomAlphabetic(5); //this will give 5 digit word takings alphabets a-z
		//System.out.println(ranstring);
	}

}
