package Even.java;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =2538;     //input integer= 2538
		int reversednumber =0,rem ; //this allow us to build the reversenumber digit by digit
		while(number > 0) {
			int rem1 =number % 10;
			reversednumber =(reversednumber*10)+ rem1;
			number=number/10;
		}
		System.out.print("reverse of given number:"+ reversednumber);
	

	}

}
