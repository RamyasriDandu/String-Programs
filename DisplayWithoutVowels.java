package PatternString;

import java.util.Scanner;

public class DisplayWithoutVowels {

	static void displayVowels(String str) {
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			str=str. replaceAll("[aeiou]","");
		System.out.print(str.charAt(i));
		
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		displayVowels(sc.nextLine());
	}

}
