package PatternString;

import java.util.Scanner;

public class DisplayVowels {
	static void displayVowels(String str) {
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			System.out.println(str.charAt(i));
		}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter  the String:");
		Scanner sc=new Scanner(System.in);
		displayVowels(sc.nextLine());
	}

}
