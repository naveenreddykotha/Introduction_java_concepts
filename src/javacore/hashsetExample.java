package javacore;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<String>();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");
        
        System.out.println(set);
        
        Iterator<String> i=set.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }

	}

}
