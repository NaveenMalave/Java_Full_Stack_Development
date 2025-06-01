package com.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo {

	public static void main(String[] args) {
    try {
    	String path1 ="G:\\IO\\input.txt";
    	String path2 = "G:\\IO\\output.txt";
    	FileInputStream fis = new FileInputStream(path1);
    	FileOutputStream fos = new FileOutputStream(path2);
    	int x ;
    while((x=fis.read())!=-1) {
    	fos.write(x);
    }
    }catch(Exception e) {
    	e.printStackTrace();
    }
	}

}
