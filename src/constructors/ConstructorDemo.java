package constructors;

public class ConstructorDemo {
	static String name;
	static int Roll_no;
	
	public ConstructorDemo() { // explicit constructor
		//when we add constructor by ourself is explicit
		//by java adding is implicit or default constructor
		//no return type in constructors
		//by default java provided default constructor is public
		name="reddy";
		Roll_no=20;
		
	}
	
	public ConstructorDemo(String name,int no) {
		this.Roll_no=no;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo con= new ConstructorDemo();
		ConstructorDemo con1= new ConstructorDemo("Naveen",25);
		System.out.println(name);
		System.out.println(Roll_no);
		

	}

}
