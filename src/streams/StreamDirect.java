package streams;

import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamDirect {
	//@Test
	public void stream2() {
		//here we directly created stream
		Stream.of("Abhi","naveen","Rama","Alekya","Amma").filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
	}
	@Test
	public void streamMap() {
		Stream.of("Abhi","naveen","Rama","Alekya","Amma").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		long d=Stream.of("Madhu","Jitu","Raja","Murali","Mamata").filter(s->s.startsWith("M")).count();
		    	
		System.out.println(d);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
