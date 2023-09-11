package oops;

public class Inheritance {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar= new Car();
		mycar.start();
		mycar.accelarator();
		mycar.gear();
		
	}

	void start() {
		System.out.println(" it starts immediately");
	}	

}
class vehicle extends Inheritance{
	void accelarator() {
		System.out.println("it moves very fast");
	}

	}

	class Car extends vehicle{
	void gear() {
		System.out.println("when it is in fourth gear");
	}

	}
