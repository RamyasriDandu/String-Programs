package PatternString;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static void checkAnagram(String str1,String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length()) {
			System.out.println("Not an anagram");
		}
		char[] s1=str1.toCharArray();
		char[] s2=str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		String ss1=new String(s1);
		String ss2=new String(s2);
		 if(ss1.equals(ss2)) {
			 System.out.println("Anagrams");
		 } 
		 else {
		 System.out.println("Not Anagrams");
		  }
		System.out.println(ss1);
		System.out.println(ss2);
	}
	public static void main(String[] args) {
		System.out.println("Enter the two String");
		Scanner sc=new Scanner(System.in);
		checkAnagram(sc.nextLine(),sc.nextLine());
	}

}
