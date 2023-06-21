package javacore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(7,"india");
		hm.put(8,"pakisthan");
		hm.put(28,"sri lanka");
		System.out.println(hm.get(28));
		System.out.println(hm.get(30));
		
		Set ss=hm.entrySet();
		Iterator it=ss.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
			
		}
	}

}
