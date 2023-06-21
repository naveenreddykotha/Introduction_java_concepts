package exception_handling;

import java.io.File;
//import java.util.Scanner;
import java.io.FileNotFoundException;

public class Scanner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("./sample.txt");
		java.util.Scanner scanner=new java.util.Scanner(f);
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();

	}

}
