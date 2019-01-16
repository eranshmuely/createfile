package createfile;

import java.io.FileOutputStream;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a directory: ");
		String directory = scanner.next();
		
		System.out.print("Please enter a file name: ");
		String file = scanner.next();
		
		System.out.println("Please enter some data:");
		String data = scanner.next();
		
		scanner.close();
		
		
		/*
		 * =========================== TODO ===============================
		 * 	
		 *  Make sure that:
		 * 		1. directory is under "C:\UserContent\"
		 * 		2. file is not ".exe" extension
		 * 
		 * 	Positive examples:
		 * 		"C:\UserContent\foo.txt"
		 * 		"C:\UserContent\foo\bar.txt"
		 * 
		 * 	Negative examples:
		 * 		"C:\UserContent\bar.exe"
		 * 		"C:\UserContent\foo\bar.exe"
		 * 		"C:\NotAllowed\foo.txt"
		 * 
		 * ================================================================
		 * */
		
		
		FileOutputStream stream = new FileOutputStream(directory + file);
		stream.write(data.getBytes());
		stream.close();

	}

}
