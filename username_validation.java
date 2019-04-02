import java.util.Scanner;
public class username_validation {
	public static void main (String[] args) {
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
			System.out.print(s+ " is not between 8 to 30 characters");
		}
		else if (!Character.isAlphabetic(startAlpha)) {
			System.out.print("Username fails to start with a letter");
		}
		else {
			System.out.print("valid username");
		}
	}

}
