package Even.java;

public class Classoops {
	// Parent class
	class Animal {
	    void eat() {
	        System.out.println("The animal is eating.");
	    }
	}

	// First child class inheriting from the parent class
	class Dog extends Animal {
	    void bark() {
	        System.out.println("The dog is barking.");
	    }
	}
	// Second child class inheriting from the parent class
	class Cat extends Animal {
	    void meow() {
	        System.out.println("The cat is meowing.");
	    }
	}
}

