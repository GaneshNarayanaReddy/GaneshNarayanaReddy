package Java;

public class Sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] array = {2, 4, 6, 8, 10};
	        int sum = 0;

	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }
	        System.out.println("The sum of the array values is: " + sum);
	}
}
