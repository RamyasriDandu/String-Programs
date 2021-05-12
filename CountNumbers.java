package PatternString;

import java.util.Scanner;

public class CountNumbers {
	static void getCount(int[] inputArray,int givenNumber) {
		int count=0;
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]==givenNumber) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		System.out.println("Enter the size number");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the elements:");
		int searchNumber = sc.nextInt();
		System.out.println("Enter the Search number");
		int array[] =new int[size];
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		getCount(array,searchNumber);
}
}
