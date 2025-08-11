import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Filereading {
    public static void main(String[] args) throws IOException {
    	File f = new File("me.txt");
    	
    	/*
    	if(!f.exists())
    		f.createNewFile();
    	*/
    	
    	FileInputStream fis = new FileInputStream(f);
    	
    	int asciiCode;
    	
    	while((asciiCode = fis.read()) != -1) {
    		System.out.print((char)asciiCode);
    	}
    	
    	fis.close();
    }
}



