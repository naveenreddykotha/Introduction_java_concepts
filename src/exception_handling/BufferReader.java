package exception_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("./sample.txt");
		FileReader file= new FileReader(f);
		BufferedReader br=new BufferedReader(file);
		int asciicode;
		String text="";
		while((asciicode=br.read()) != -1) {
			text += String.valueOf((char)asciicode);
		}
		System.out.println(text);
		file.close();
		br.close();
	}

}
