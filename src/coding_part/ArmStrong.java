package coding_part;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArmStrong {
	public static int armstrong(int a) {
		int length=String.valueOf(a).length();
		int value=0;
		String num=String.valueOf(a);
		for(char ch:num.toCharArray()) {
			int digit=Integer.parseInt(ch+"");
			value += Math.pow(digit, length);
		}
		return value;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=153;
		System.out.println(armstrong(x));
		if(x == armstrong(x)) {
			System.out.println("The given Number "+x+" is a  armstrong number");
		}
		else {
			System.out.println("Not a armstrong number");
		}
		
		
		
		System.out.println("===========================patern========");
		int f=6;
		for(int i=1;i<=f;i++) {
			int spaces=(f-i);
			System.out.println("  ".repeat(spaces)+"* ".repeat(i));
		}

	}

}
