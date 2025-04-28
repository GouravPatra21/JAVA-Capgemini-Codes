package File_Handling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class CopyImage {
	public static void main(String[] args) throws Exception {
		//creating new jpg file
		
		String destinationpath = "C:\\Users\\GOURAV PATRA\\OneDrive\\Desktop\\FileHandlingKolkata\\image.jpg";
		File destinationfile = new File(destinationpath);
		destinationfile.createNewFile();
		
		//creating file object of source image
		String sourcePath = "C:\\Users\\GOURAV PATRA\\OneDrive\\Pictures\\Saved Pictures\\grouppic.jpg";
		File sourceFile = new File(sourcePath);
		
		//reading data from source image
		FileInputStream fis = new FileInputStream(sourcePath);
 		byte[] arr = new byte[(int)sourceFile.length()]; //getting the size of source file and creating a byte array of that
//  size to store image data int he form of byte
		fis.read(arr);  //read data from the source file and stores in byte array
		
		//writing data
		FileOutputStream  fos = new FileOutputStream(destinationfile);
		fos.write(arr);
		
		fos.close();
		fis.close();
		
		
	}

}
