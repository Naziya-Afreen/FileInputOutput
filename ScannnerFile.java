import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ScannnerFile {

	public static void main(String[] args) throws IOException {
		
        File f = new File("me.txt");
        
        if(!f.exists())
        	f.createNewFile();
        
		//Scanner sc = new Scanner(f);
        
        //FileInputStream fis = new FileInputStream(f);
        
        Scanner sc = new Scanner(new FileInputStream(f));
        
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		//fis.close();
		sc.close();

	}

}
