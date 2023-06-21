package java_strings;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "NaveenReddy";
		StringBuffer s=new StringBuffer(word);
		s.append("Kotha");
//		StringBuffer reverse=s.reverse();
		StringBuffer s2=s.delete(0, 7);
//		System.out.println(reverse);
		System.out.println(s2);
		
	}

}
