package exception_handling;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Execution started");
		int a=4;
		int b=0;
		int result=0;
		try {
			result=a/b;
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());
			throw e;
			
		}
		finally {
			System.out.println("final block executed..");
		}
		
		System.out.println("output is: " + result);
		System.out.println("execution ended");
		

	}

}
