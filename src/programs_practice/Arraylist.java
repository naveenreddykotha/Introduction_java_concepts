package programs_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar=new ArrayList();
		ArrayList ar1=new ArrayList(ar);
		ar1.add("Naveenn");
		
		ar1.add(1,"iqwddb");
		ar1.addAll(1,List.of("uqqs","iuhwd"));
		ArrayList ar2=new ArrayList();
		ar1.sort(Comparator.naturalOrder());
		System.out.println(ar1);
		ar1.remove(1);
		ar1.set(1,"reddy");
		ar1.add("iyaic");
		List sub=ar1.subList(0, 2);
		System.out.println(sub);
		System.out.println(ar1);
		
		Iterator itr=ar1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		String[] array= {"navwdwd","uis	nj","iudqiwn"};
		ArrayList<String> covert=new ArrayList<String>(Arrays.asList(array));
		System.out.println(Arrays.toString(array));
		System.out.println(covert);
		
		covert.stream().forEach(a->System.out.println(a));
		covert.ensureCapacity(10);
		
		ArrayList copy=(ArrayList) covert.clone();
		System.out.println(copy);
		String[] app="141".split("");
		String rev="";
		for(String str:app) {
			rev=str+rev;
		}
		System.out.println(rev.equals("141"));

	}

}
