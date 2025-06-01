package Basics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class inputProgram {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				File file = new File("G:\\hello.txt");
				Scanner sc = new Scanner(file);
				int sum =0;
				while(sc.hasNextInt()) {
					int line = sc.nextInt();
					sum=sum+line;
					System.out.println(line);
				}
				System.out.println(sum);
			
			}
			catch(FileNotFoundException e) {
				System.out.println("File not found" +e.getMessage());
			}

		}

	}


