package com.FileHandling;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo1 {

	public static void main(String[] args) {
		try {
    String path1 = "G:\\IO\\input.txt";
    String path2 ="G:\\IO\\output.txt";
    FileReader fr = new FileReader(path1);
    FileWriter fw = new FileWriter(path2);
    int x;
    while((x=fr.read())!=-1) {
    	fw.write(x);
    }
    fw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
    
	}

}
