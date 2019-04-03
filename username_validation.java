package username_implement;

import java.util.Scanner;

public class username_validation {

	public static void main(String[] args) {
		System.out.println("Enter a username with following crititer.\n"
				+ "-between 8 to 30 characters\n-starts with an aplhabet\n"
				+ "-does not contain special characters exception" +"_");
		while(true) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a username.");
		String input=sc.next();
		
		verifyUser(input);
		
		}
		
	}
	
	public static void verifyUser(String s) {
		
		char[] userToArray=s.toCharArray();
		char startAlpha=userToArray[0];
		
		if(s.length()<8 || s.length()>31) {
			if(s.length()<8){
			   System.out.print(s+ " is less than 8 characters\n");
			} else {
			   System.out.print(s+ " is greater than 30 characters\n");
			}
		}
		else if (!Character.isAlphabetic(startAlpha)) {
			System.out.print("Username fails to start with a letter\n");
		}
		else if (hasSpecial(s)) {
			System.out.print("Username cannot contain special characters\n");
		}
		else {
			System.out.print("valid username\n");
		}
		
	}
	
	public static boolean hasSpecial(String input) {
		int specials=0;
		
		for(int i=0; i<input.length();i++) {
			char ch=input.charAt(i);
			if(!Character.isDigit(ch) && !Character.isLetter(ch)) {
				specials++;
			}
		}
		
		return specials>0;
	}

	}
