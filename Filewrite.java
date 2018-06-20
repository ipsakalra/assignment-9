import java.io.*;
import java.util.*;
class Filewrite{
	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\file2\\abc2.txt");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\file2\\xyz.txt");

		int c;

		while((c=fis.read())!=-1){
			fos.write(c);
			System.out.print((char)c);
		}
		fos.flush();

	}
}