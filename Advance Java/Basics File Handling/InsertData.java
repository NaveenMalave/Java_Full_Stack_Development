package Basics;

import java.io.FileWriter;

import java.io.IOException;

public class InsertData {
	

        public static void main(String[] args) {

            String filename = "G:\\input.txt"; // Specify your desired filename

            String dataToWrite = "public class SumOfNumbers {\\n\" +\r\n"
            		+ "            \"    public static void main(String[] args) {\\n\" +\r\n"
            		+ "            \"        int sum = 0;\\n\" +\r\n"
            		+ "            \"        for (int i = 1; i <= 10; i++) {\\n\" +\r\n"
            		+ "            \"            sum += i;\\n\" +\r\n"
            		+ "            \"        }\\n\" +\r\n"
            		+ "            \"        System.out.println(\\\"The sum of numbers from 1 to 10 is: \\\" + sum);\\n\" +\r\n"
            		+ "            \"    }\\n\" +\r\n"
            		+ "            \"}\n"; // Data you want to add



            try (FileWriter fileWriter = new FileWriter(filename, true)) { // Open file in append mode

                fileWriter.write(dataToWrite); // Write the data

                fileWriter.write("\n"); // Add a newline character if needed

            } catch (IOException e) {

                System.out.println("Error writing to file: " + e.getMessage());

            }

        }

    }

