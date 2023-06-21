package exception_handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	//fileInputStream and fileReader are almost similar

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("./sample.txt");
		FileReader file=new FileReader(f);
		int asciicode;
		String text="";
		while((asciicode=file.read()) != -1) {
			text += String.valueOf((char)asciicode);
		}
		System.out.println(text);
		file.close();
		
		

	}

}
