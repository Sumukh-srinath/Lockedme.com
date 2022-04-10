package com.lockedme;
import java.util.Scanner;

public class HandleInputs {
	public static void HandleScreenInputs(){
		System.out.println("\n\n**** Please Wait ****\n\n");
		boolean Flag = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MainMenu.SelectChoices();
				int input = sc.nextInt();
				switch (input){
				case 1:FileOperate.DisplayAllFiles();break;
				case 2:HandleInputs.handleFileMenuOptions();MainMenu.FileOperations();break;
				case 3:System.out.println("Program exited successfully.");Flag = false;sc.close();System.exit(0);break;
				default:System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				HandleScreenInputs();
			} 
		}while (Flag == true);
	}
	public static void handleFileMenuOptions() {
		boolean Flag = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MainMenu.FileOperations();
//				FileOperations.createMainFolderIfNotPresent("main");
				int input = sc.nextInt();
				switch (input) {
				case 1:FileOperate.AddFile();break;
				case 2:FileOperate.DeleteFile();break;
				case 3:FileOperate.SearchFile();break;
				case 4:return;
				case 5:System.out.println("Program exited successfully.");Flag = false;sc.close();System.exit(0);
				default:System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOptions();
			}
		} while (Flag == true);
	}

}
