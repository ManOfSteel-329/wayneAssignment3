package com.coderscampus.assignment3;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import  java.io.File;
public class UserApplication {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(new File("data.txt")); // read to memory
			// boolean function that tells if there is a line or not
		 while (scanner.hasNextLine()) {
			String line =  scanner.nextLine();
			String[] userData = line.split(",");
			String username = userData[0];
			String password = userData[1];
			String name = userData[2];
			// pojo
			User user = new User(username, password, name);
			userList.add(user);
		 }
		 
		 scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int numAttempts = 5;
		boolean isValidInput = false; 	

		Scanner scan = new Scanner(System.in);
		
		while (!isValidInput && numAttempts > 0){
			System.out.println("Enter your email: "); 
			String usernameInput = scan.nextLine();
			System.out.println("Enter your password: ");
			String passwordInput = scan.nextLine();
			numAttempts = numAttempts - 1;		
						
			for (int i = 0; i < userList.size(); i++) {
				if (usernameInput.equals(userList.get(i).getUsername())&& passwordInput.equals(userList.get(i).getPassword())) {
					isValidInput = true;
					System.out.println("Welcome: "+userList.get(i).getName());
					break;
				} else if (numAttempts == 0) {
					System.out.println("Too many failed loggin attempt, you are now locked out");
					break;
				}				
			}
			if (numAttempts > 0 && !isValidInput)
				System.out.println("Invalid login, please try again");
					 			
		}
		   
		scan.close();
	}// end of main method 

}// end of userApplication class...  
