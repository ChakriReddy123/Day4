package com.IOAssignments;

import java.io.File;
import java.util.*;
public class FileDetails {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		try {
		File fl=new File("C://JavaTraining/"+s+".txt");
		if(fl.exists()) {
			System.out.println("Yes this file exists");
		}
		else {
			System.out.println("No this file not exists");
		}
		if(fl.canRead()) {
			System.out.println("Yes this file can be readable");
		}
		else {
			System.out.println("No this file cannot be readable");
		}
		if(fl.canWrite()) {
			System.out.println("Yes this file can be writable");
		}
		else {
			System.out.println("No this file cannot be writable");
		}
		System.out.println(fl.getPath().substring(fl.getPath().length()-3));
		System.out.println("The length of the file in bytes :"+fl.length());
		}
		catch(Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
