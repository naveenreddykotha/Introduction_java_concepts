package patterns;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stars=1;
		int height=5;
		int spaces=height-1;
		for(int i=0;i<height;i++) {
			for(int j=spaces;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<stars;k++) {
				System.out.print("*");
			}
			stars += 2;
			System.out.println();
		}

	}

}
