package com.lockedme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class FileOperate {
	static ArrayList<String> file = new ArrayList<String>(
            Arrays.asList("main.txt",
                          "abc.py",
                          "NewList.java"));
	
	public static void main(String[] args) {
		
		
	}
	
	public static ArrayList<String> DisplayAllFiles() {
		System.out.println("***Files Present in root Directory are****\n");
		for(String s:file) {
			System.out.println(s);
		}
		System.out.println("\n*******************************************\n");
		return file;
	}
	
	public static ArrayList<String> AddFile() {
		System.out.println("Enter the name of the file to be added to the \"root\" directory");
		Scanner sc= new Scanner(System.in); 
		String fileToAdd=sc.nextLine();
		if(file.contains(fileToAdd)) {
			System.err.println("File Name Already Exists");
			System.err.println("Try with Other File name");
			FileOperate.AddFile();
		}
		else {
			file.add(fileToAdd);
			System.out.println("\n******File ADDDED successfully******\n");
			FileOperate.DisplayAllFiles();
		}
		
		return file;
	}
	
	
	public static ArrayList<String> DeleteFile() {
		System.out.println("\nEnter the name of the file to be deleted from \"root\" directory\n");
		Scanner sc= new Scanner(System.in); 
		String fileToDelete=sc.nextLine();
		if(file.contains(fileToDelete)) {
			file.remove(fileToDelete);
			System.out.println("\n******File Deleted Successfully******\n");
			FileOperate.DisplayAllFiles();
		}
		else {
			System.err.println("File Not Found");
			System.out.println("\n***TRY AGAIN***\n");
			FileOperate.DeleteFile();
		}
		return file;
		
	}
	
	
	public static void SearchFile() {
		System.out.println("Enter the name of the file to be searched from \"root\" directory");
		Scanner sc= new Scanner(System.in); 
		String fileName = sc.nextLine();
		System.out.println("****Performing Linear Search*****");
		for(String s:file) {
			if(s.contentEquals(fileName)) {
				System.out.println("File Found: "+fileName);
				return;
			}
			else {
				System.err.println("\nUnable to Find the file\n Please Try Again\n");
				FileOperate.SearchFile();
				return;
			}
		}
		return;
	}

}
