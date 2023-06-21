package exception_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("./sample.txt");
		
		if(f.exists()) {
			f.createNewFile();
			FileInputStream fis=new FileInputStream(f);
			int asciicode;
			String text=new String();
			while((asciicode=fis.read()) != -1) {
				text += (char)asciicode;
				System.out.print((char)asciicode);
			}
			System.out.println(text);
			fis.close();
			
		}
		

	}

}
