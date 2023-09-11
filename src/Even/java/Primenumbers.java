package Even.java;

public class Primenumbers {      //class name as primenumbers

	public static void main(String[] args) {    //main method
		// TODO Auto-generated method stub
		
		for(int i=2;i<=100;i++) {     //integer value (i=2 is initial value)
			                                 //(i(<=)50 is one of the relational operator)
			                                 //(i++ is to incriment the value) 
			
			boolean isprime =true;  //used to keep the track whether the number is prime or not 
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {  //checks if the remainder of 'i' is divided by 'j'is equal to '0'
					
					isprime =false;  //used to indicate that a number is not prime in prime num algorithm
					
					break;  //it is used to stop theexecution of a loop when a certain condition is met
				}
			}
			if(isprime) {
				System.out.println(i+"is a prime number");  //to print the statement 
				}
			}
		}
		

	}

