package longestSubString;

import java.util.ArrayList;

public class SubString {
	static ArrayList<String> produced_subStrings(String str){
		int i=0;
		ArrayList<String> arr=new ArrayList();
		while(i<str.length()) {
			int j=i;
			while(j<str.length()) {
				arr.add(str.substring(i,j+1));
				j++;
			}
			i++;
		}
		return arr;
	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w1="GeeksforGeeks";
		String w2="GeeksQuiz";
		ArrayList<String> a1=produced_subStrings(w1);
		ArrayList<String> a2=produced_subStrings(w2);
		int reddy=0;
        for(String arr:a2) {
        	if(a1.contains(arr)){
        		int len=arr.length();
        		if(len>reddy) {
        			reddy=len;
        		}
        	}
        }
        System.out.println(reddy);

		//		s 0
		//		si 01
		//		sit 012
		//		sita 0123

	}

}
