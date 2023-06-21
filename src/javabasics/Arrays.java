package javabasics;

public class Arrays {

	public static void main(String[] args) {
		// Arrays---> arrays can store multipe values in single variable.This is traditional array
		//these are static array here we are starting only initializing the values
		//to overcome this we use ArrayList to add dynamic values into an array
		
		//this is the first method and here we initialize the size to 5
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		//arr[5]=6;
		System.out.println(arr[2]);
		
		//this is another process directly assigning values
		int[] array= {1,2,5,8,10};
		System.out.println(array[4]);
		
		//for loop---check multiples of 2
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			if(array[i] % 2==0) {
				System.out.println(array[i]);
				break;
			}
			else {
				System.out.println(array[i]+" not multiple of 2");
			}
			
		}
		
		String[] names= {"naveen","rahul","selinium"};
		for(String s:names) {
			System.out.println(s);
		}

	}

}
