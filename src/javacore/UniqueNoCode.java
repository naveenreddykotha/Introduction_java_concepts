package javacore;

import java.util.ArrayList;

public class UniqueNoCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print unique number in array
		int[] a= {2,3,2,2,4,5,4,3,5,7};
		
		//create one arraylist
		ArrayList<Integer> ab=new ArrayList<Integer>();
		
		
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++) {
					if(a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i]+" has "+k+" values in array");
				if(k==1) {
					System.out.println(a[i]+" is unique number");
				}
			}
			
		}
		
	}

}
