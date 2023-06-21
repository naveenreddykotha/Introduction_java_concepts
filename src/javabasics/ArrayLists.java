package javabasics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if there is dynameic changes to add in array in application we use ArrayList
		//arraylist is of the class in java.
		//If you want to access any methods present in class you want to create obj of that class
		ArrayList a= new ArrayList();
		a.add("Rahul");
		a.add(10);
		System.out.println(a.get(1));
		
		//if you want to add particular datatype of values to arraylist
		ArrayList<String> names=new ArrayList<String>();
		names.add("naveen");
		names.add("reddy");
		names.add("QA Engineer");
		//names.remove(1);
		System.out.println(names.get(1));
		System.out.println(names);
		
		//to know the size of an array in normal array we use length()
		//but in arraylist we use size() to know howmany values in arraylist
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		//enhanced for loop
		for(String s:names) {
			System.out.println(s);
		}
		
		//whether check expected item present in array or not there is one method contains()
		names.contains("QA Engineer");
		System.out.println(names.contains("QA Engineer"));
		
		//there is one method to convert normal array into the ArrayList
		int[] array= {1,2,5,8,10};
		//List<int> numlist= Arrays.asList(array);
		

	}

}
