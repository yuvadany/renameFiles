package com.test;

import java.io.File;

public class RenameFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directoryName ="C:\\yuvi\\Apps\\files";
		 File directory = new File(directoryName);
	        //get all the files from a directory
	        File[] fList = directory.listFiles();
	        int i=0;
	        for (File file : fList){
	        	i++;
	        	String oldName = file.getName();
	            System.out.println(oldName);
	            String newName = oldName.replaceAll("na_", "heb_");
	            System.out.println(newName);	
	            file.renameTo(new File (newName));
	        }
	        System.out.println(i);
	}

}
