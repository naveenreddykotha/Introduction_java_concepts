package coding_part;

import java.util.Collections;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentance="Nittin and hi mom went to park last Friday Nittin's Mom observed that the weather was tool cool if reverse the number 1331 then we also get 1331";
		String[] arr=sentance.split(" ");
		int num=0;
		//System.out.println(arr.length);
		
		for(String word:arr) {
			//char ch;
			String reverse = "";
			for (int i=word.length()-1; i>=0; i--)
		      {
		       // ch= word.charAt(i); //extracts each character
		        //reverse= ch+reverse;
				reverse=reverse+(word.charAt(i)+"");
		      }
			
			if(reverse.equalsIgnoreCase(word)) {
				System.out.println(word);
				num++;
			}
			
			
			
		}
		System.out.println(num);
		
		
	}

}
