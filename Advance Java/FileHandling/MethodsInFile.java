package com.FileHandling;

import java.io.File;

public class MethodsInFile {

	public static void main(String[] args) {
		String path = "G:\\IO\\sourse.txt";
		File file = new File(path);
		System.out.println("Does File Exits: "+file.exists());
		System.out.println("Is It File? "+file.isFile());
		System.out.println("IS Directiory"+file.isDirectory());
		System.out.println("Absolute path"+file.getAbsolutePath());
		System.out.println("get path"+file.getPath());
		System.out.println("file  name is "+file.getName());
		System.out.println("Does file has read permission"+file.canRead());
		System.out.println("Does file has write permission"+file.canWrite());
		System.out.println("Does file has Excecute permission"+file.canExecute());
		System.out.println("Does file parent"+file.getParent());
	}

}
