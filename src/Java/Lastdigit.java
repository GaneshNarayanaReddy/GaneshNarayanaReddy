package Java;

import java.util.Scanner;

public class Lastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        int lastDigit = num%10;
        
        System.out.println("The last Digit of the Number is "+lastDigit);

	}

}
