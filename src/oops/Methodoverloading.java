package oops;

public class Methodoverloading {
	
		String name;

		int age; public void displayInfo(String name) {
			System.out.println(name);

		}

		public void displayInfo(int age) {
			System.out.println(name);

		}

		public void displayInfo(String name, int age) {
			System.out.println("Name: "+name+"\n" +"Age"+age);

		}

		public static void main(String[] args) {
			Methodoverloading m1= new Methodoverloading(); m1.displayInfo("ganesh",21);

		}
	}

