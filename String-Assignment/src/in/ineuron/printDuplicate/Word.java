package in.ineuron.printDuplicate;

import java.util.Scanner;

public class Word {

	public static void main(String[] args)
	{
		
		System.out.println("Welcome to Java Programming to Print Duplicates From String");
		System.out.println("*********************************************************");
		String option="yes";
		while(option.equalsIgnoreCase("yes")) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the data to print Duplicates:: ");
		String word = scan.nextLine();
		int count=0;
		int length = word.length();
		char[] ch = word.toCharArray();
		System.out.println("Entered String is:: "+word);
	
		for(int i=0; i<length;i++) {
			for(int j=i+1; j<length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate Charecter in String are:: "+ch[j]);
					count++;
				}
			}
			
		}
		System.out.println("Number of duplicate charecters are:: "+count);
		System.out.println("***********************************************************");
		System.out.println("Enter yes if you want to use the application again");
	  	option=scan.next();
			if(option.equalsIgnoreCase("yes")!=true) {
				System.out.println("application terminated...");
			}
		}
	}

}
