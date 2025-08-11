import java.io.FileWriter;
import java.io.IOException;


public class FileWriters {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("newFile.txt");
		
		
		
		fw.write("hi Hello\n bye");
		fw.close();
			
	}
	
}
