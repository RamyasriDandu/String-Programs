package PatternString;

import java.util.Scanner;

public class CountNoOfCharacters {
	static int charCounter(String input,char toFind) {
		String str= input.toUpperCase();
		int count=0;
		if(input=="\0") {
			return -1;
		}
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==toFind) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(charCounter("hello world",' '));
	}

}
