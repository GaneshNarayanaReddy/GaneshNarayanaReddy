package Even.java;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initializing the constants

		int n=100, t1=0, t2 = 1;

		System.out.print("Upto==>"+n+": "+"\n"); // while loop to calculate fibonacci series upto n numbers

		while (t1 < n) {

		System.out.println(t1 +"+");

		int sum = t1 + t2;

		t1 =t2;

		t2 =sum;
		}
	}
}


	
