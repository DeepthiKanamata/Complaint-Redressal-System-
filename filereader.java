import java.io.*;

public class filereader {

	public static void main(String[] args) {
		
		try {
				
			File f=new File("C:\\My Files\\my file 3.txt");
			FileReader fr=new FileReader(f);
			
			int n=fr.read();
			 
			while(n!=-1) {
				
				System.out.println((char)n);
				n=fr.read();
			}
			fr.close();
			
		}	
		catch(Exception e) {}
	}
	
	
	
}
