package Basics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("G:\\hello.txt");
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			System.out.println(file);

		sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found" +e.getMessage());
		}

	}

}
