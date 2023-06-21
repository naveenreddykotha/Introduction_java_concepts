package exception_handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("./outputfile.txt");
		if(f.exists()) {
			f.delete();
			f.createNewFile();
			String text="Hello";
			
			FileOutputStream fos=new FileOutputStream(f);
			for(char ch:text.toCharArray()) {
				fos.write((int)ch);
			}
			fos.flush();
			fos.close();
		}
		
//similarly filewriter is also same...here it takes string directly this is positive one
		//bufferedwriter also same as above steps
	}

}
