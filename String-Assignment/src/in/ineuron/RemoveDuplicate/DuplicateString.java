package in.ineuron.RemoveDuplicate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set; 

public class DuplicateString 
{  
	public static void main(String[] args)
{  
	System.out .println("Welcome to Java program to remove duplicate characters from String");
	System.out.println("************************************************************");
	String option="yes";
	while(option.equalsIgnoreCase("yes")) {
	Scanner scan= new Scanner(System.in); 
	System.out.println("Please enter a String with duplicate characters");  
	String input = scan.nextLine(); 
	String output = removeDups(input);
	System.out.println("String without duplicate characters is :: " + output); 
	String withchar = removeDupsInPlace(input);
	System.out.println("String with duplicate characters :: " + withchar);
	System.out.println("Enter yes if you want to Check Again");
	System.out.println("************************************************************");
	option=scan.next();
	if(option.equalsIgnoreCase("yes")!=true) {
		System.out.println("Application Terminated");
	}
	
	}
	}   
public static String removeDups(String word)
{ 
	Set<Character> chars = new HashSet<>(); 
StringBuilder output = new StringBuilder(word.length());  
for (int i = 0; i < word.length(); i++) 
{ 
	char ch = word.charAt(i);
	if (chars.add(ch)) 
	{ output.append(ch); }
	}   return output.toString(); }
public static String removeDupsInPlace(String word) 
{ final StringBuilder output = new StringBuilder(); 
for (int i = 0; i < word.length(); i++)
{ String character = word.substring(i, i + 1);
if (output.indexOf(character) < 0) ;
	
}
return word;
}
}