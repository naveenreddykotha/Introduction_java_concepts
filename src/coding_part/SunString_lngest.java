package coding_part;

public class SunString_lngest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="abcdxyz^$&*&( (()123556";
		String y="^$&*&( (()";
		String store="";
       for(char arg:x.toCharArray()) {
    	   //using storing all special chars in one variable and contains method
    	  /*if(!y.contains(arg+"")) {
    		  System.out.println(arg);
    	  }*/
    	   
    	   //using Character class inbuild method
    	   if(!Character.isLetterOrDigit(arg)) {
    		   store+=arg;
    	   }
       }
       System.out.println(store);
       
       
       //using regular Expression
       String s1="$#@%^%(*&*&%%NavennRedddy126371";
       s1=s1.replaceAll("[^a-zA-Z0-9]", "");
       System.out.println(s1);
	}

}
