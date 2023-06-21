package coding_part;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stubn
		Integer[] arr= {-5,8,87,-87,94,100};
		
		List ar= Arrays.asList(arr);
		Collections.sort(ar);
		System.out.println(ar);
		
		
		System.out.println("*******without using user defined methods*****");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
		
		

	}

}
