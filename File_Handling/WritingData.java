package File_Handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class WritingData {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\GOURAV PATRA\\OneDrive\\Desktop\\FileHandlingKolkata\\batman\\DarkKnight\\Demo.txt";
		File file = new File(path);
//		FileOutputStream fos = new FileOutputStream(file); //overrides the previous data
//		FileOutputStream fos = new FileOutputStream(file, true);
		
		String message = " ,bye bye birdie";
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
//		byte[] arr = message.getBytes();
//		fos.write(arr);
//		char[] arr = message.toCharArray();
		for(int i = 0; i <message.length(); i++) {
//			fos.write(message.charAt(i)); //for FileOutputStream
//			fw.write(message.charAt(i)); // for FileWriter
			bw.write(message.charAt(i));
    	}
		bw.flush();
		bw.close();
		fw.close();
		
	}

}
