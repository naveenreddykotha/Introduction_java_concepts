package coding_part;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Print_fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,count=10,n3=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

		System.out.println("============duplicates findout in array====");
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3,2};  
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}


		System.out.println("===========");
		int[] i= {1,2,3};
		@SuppressWarnings("unchecked")
		List ar=Arrays.asList(i);

		//System.out.println(Arrays.toString(ar));

		System.out.println("=======");
		String word="NaveenReddy";
		String noDuplicates="";
		for(int p=0;p<word.length();p++) {
			char ch=word.charAt(p);
			if(noDuplicates.indexOf(ch+"")==-1) {
				noDuplicates+=ch;
			}


		}
		System.out.println(noDuplicates);




	}
}
