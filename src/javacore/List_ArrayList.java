package javacore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("naveen");
		a.add("student");
		System.out.println(a);
		a.add(1,"rahul");
		
		System.out.println(a);
		//a.clear();
		System.out.println(a.isEmpty());
		for(String s:a) {
			System.out.println(s);
		}
		
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
	}

}
