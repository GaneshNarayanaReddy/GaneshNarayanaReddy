package Even.java;

import java.util.Scanner;

public class Vowelorconsonant {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;   //declaration statement
		Scanner sc= new Scanner(System.in);  //
		System.out.println("Enter Any character");
		String str=sc.nextLine();
		
		for(int i=0;i<=str.length();i++) {
		 char ch1= str.charAt(i);
		 if(ch1=='a' || ch1=='e' || ch1== 'i' || ch1== 'o'||ch1=='u')
		{
		System.out.print("character is vowel");
		}
		else
		{
			System.out.println("character is consonant");
		}

		}
	}
}
