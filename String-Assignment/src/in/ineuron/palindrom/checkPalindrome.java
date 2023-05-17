package in.ineuron.palindrom;

import java.util.Scanner;

public class checkPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number::");
		 String num = scan.nextLine();
		 String reverse= "";
		 int length = num.length();	
		
		 for(int i = length-1; i>=0; i--)
			 reverse=reverse+num.charAt(i);
		 if(num.equals(reverse))
			 System.out.println("Given Number " +num+" is  palindrome");
		 else
			 System.out.println("Given Number " +num+" is not palindrome");
		 
	}
}
