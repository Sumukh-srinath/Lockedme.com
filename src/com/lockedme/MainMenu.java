package com.lockedme;

public class MainMenu {
	public static void main(String[] args) {
		System.out.println("Welcome to lockedme.com\n");
		System.out.println("***THIS CODE WAS CREATED BY SUMUKH S***\n");
		System.out.println("Welcome to my console application \n");
		HandleInputs.HandleScreenInputs();
				
	}
	public static void SelectChoices() {
		System.out.println("Select any option from below and press Enter \n");
		System.out.println("1) Retrieve all files inside \"Root\" Directory \n");
		System.out.println("2) Display menu for File operations \n");
		System.out.println("3) Exit program \n");
		
	}
	
	public static void FileOperations() {
		System.out.println("\n\nFile Operations\n");
		System.out.println("1) ADD A FILE TO ROOT DIRECTORY\n");
		System.out.println("2) DELETE A FILE FROM ROOT DIRECTORY\n");
		System.out.println("3) SEARCH FOR A FILE\n");
		System.out.println("4) GO BACK TO MAIN MENU\n");
		System.out.println("EXIT\n\n\n");
		
	}
}
