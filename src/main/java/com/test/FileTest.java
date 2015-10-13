package com.test;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("F:\\nvee");
		if(file.isDirectory()){
			readFile(file);
		}
		
	}
	private static void readFile(File file){
		if(file.isDirectory()){
			File[] list = file.listFiles();
			for (File file2 : list) {
				System.out.println(file.getAbsolutePath()+File.separator+file2.getName());
				readFile(file2);
			}
		}
	}
}
