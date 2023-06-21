package coding_part;

public class question2 {
	
	public int add_digits(int num) {
		String digits=Integer.toString(num);
		//System.out.println(digits.length());
		int result = 0;
		if(num>1) {
			for(int i=0;i<digits.length();i++) {
				char digit=digits.charAt(i);
				result += Character.getNumericValue(digit);
				
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		question2 obj=new question2();
		//System.out.println(obj.add_digits(66));
		int i=obj.add_digits(999);
		int length=(i+"").length();
		if(length != 1) {
			int y=0;
			while(y<length) {
				int k=obj.add_digits(i);
				i=k;
				y++;
			}
		}
		System.out.println(i);
		
		
	}

}
