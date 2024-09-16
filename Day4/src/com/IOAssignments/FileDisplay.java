package com.IOAssignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class FileDisplay {

	public static void main(String[] args) {
		try {
		FileReader fr=new FileReader("C://JavaTraining/test.txt"); 
		BufferedReader br=new BufferedReader(fr);
		int lineNumber=0;
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(++lineNumber + " "+line);  
		}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
