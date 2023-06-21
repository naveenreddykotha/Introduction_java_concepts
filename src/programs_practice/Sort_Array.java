package programs_practice;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {10,20,50,60,90};
		System.out.println(arr);
		
		//Appproach 1--parallelSort
		Arrays.parallelSort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		//Approach 2--sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
