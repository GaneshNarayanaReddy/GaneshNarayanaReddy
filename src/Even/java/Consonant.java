package Even.java;

import java.util.Scanner;

public class Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);

	        if (Character.isLetter(ch)) {
	            ch = Character.toLowerCase(ch);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                System.out.println("The entered character is a vowel.");
	            } else {
	                System.out.println("The entered character is a consonant.");
	            }
	        } else {
	            System.out.println("Invalid input. Please enter a valid character.");

	        }
	}
}
