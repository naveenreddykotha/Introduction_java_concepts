package coding_part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList employees=new ArrayList(List.of("siya","priya","jiya"));
		ArrayList heights=new ArrayList(List.of(170,120,130));
		ArrayList copy=(ArrayList) heights.clone();
		Collections.sort(heights);
		ArrayList result =new ArrayList();
		for(Object value:heights){
			//List result=new List();
			int i=(int)value;
			
			result.add(employees.get(copy.indexOf(i)));
			
			
		}
		System.out.println(result);
		
		
	}

}
