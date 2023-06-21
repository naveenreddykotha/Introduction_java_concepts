package streams;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class streamBasic {
	@Test
	public void normaljava() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeeth");
		names.add("Rama");
		names.add("Don");
		names.add("Alekya");
		//count names length greather than 4 
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual=names.get(i);
			if(actual.length()>4) {
				count++;
			}
		}
		System.out.println(count);
	}
	@Test
	public void stream1(){
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeeth");
		names.add("Rama");
		names.add("Don");
		names.add("Naveen");
		names.add("Alekya");
		//count names length greather than 4
		//here we coverting collections into stream
		Long d= names.stream().filter(s->s.length()>4).count();
		System.out.println(d);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
