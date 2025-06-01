package com.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    String path1 = "G:\\IO\\input.txt";
		    String path2 ="G:\\IO\\output.txt";
		    FileReader fr = new FileReader(path1);
		    FileWriter fw = new FileWriter(path2);
		    BufferedReader br = new BufferedReader(fr);
		    BufferedWriter bw = new BufferedWriter(fw);
		    String x;
		    while((x=br.readLine())!=null) {
		    	bw.write(x);
		    	bw.newLine();
		    	
		    }
		    bw.flush();
				}catch(Exception e) {
					e.printStackTrace();
				}
		    

	}

	}


