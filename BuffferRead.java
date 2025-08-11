import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BuffferRead {
     public static void main(String[] args) throws IOException {
    	 
    	 File f = new File("me.txt");
    	 
    	 if(!f.exists())
    		 f.createNewFile();
    	 
    	 FileReader fr = new FileReader(f);
    	 
    	 BufferedReader br = new BufferedReader(fr);
    	 
    	 String line;
    	 while((line = br.readLine()) != null) {
    	      System.out.println(line);
    	 }
    	 
    	 /*
    	 int asciiCode;
         String text = new String();
         
         while((asciiCode = br.read())!= -1) {
      	   text = text + String.valueOf((char)asciiCode);
      	  //System.out.print((char)asciiCode);
         }
         
         System.out.println(text);
         */
    	 
    	 
    	 
         fr.close();
         br.close();
     }
}
