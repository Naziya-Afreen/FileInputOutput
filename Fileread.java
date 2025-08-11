import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {

	public static void main(String[] args) throws IOException {
           File f = new File("me.txt");
           
           /*if(!f.exists()) 
        	   f.createNewFile(); */
           
           FileReader fr = new FileReader(f);
           
           int asciiCode;
           
           
           while((asciiCode = fr.read())!= -1) {
        	  System.out.print((char)asciiCode);
           }
           
           fr.close();
	}

}
