package in.ineuron.SecialChar;
import java.util.*;
public class SpeacialChar {

	public static void main(String[] args) {
		System.out.println("Welcome  to java programming language");
		System.out.println("**************************************");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String to count the number of consonants, vowels, special characters.");
		String word = scan.next();
		String str = word.toLowerCase();
		
		int c=0,v=0,special=0;
		char ch;
		
		for(int i=0; i<str.length();i++) 
		{
			ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
				v++;
			else
				c++;
				
			}
			else 
				special++;
		}
		System.out.println("Total Number of vowels are::"+v);
		System.out.println("Total Number of consonants are::"+c);
		System.out.println("Total Number of special characters are::"+special);
		
	}

}
