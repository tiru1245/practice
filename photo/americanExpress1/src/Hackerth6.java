

import java.io.File;
import java.io.IOException;

public class Hackerth6 {
public static void main(String[] args) throws IOException {
   File f = File.createTempFile("tmp", ".txt", new File("/home/tirumala"));
   if(f.isDirectory()==true) {
	   
   }
   else {
	   f.delete();
   }

}
}
