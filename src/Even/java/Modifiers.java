package Even.java;

public class Modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifiers m = new Modifiers();

		m.publicMethod();
		m.privateMethod();
		m.protectedMethod();
		m.defaultMethod();
		
	}

	//public private protected default

	public void publicMethod() {              //it allows the class,method or variable and variables in java program
		System.out.println("public method"); 
		}
	private void privateMethod() {            //it restricts the access to the class,method or variable to be accessed with in same class
		                                            //it can be accessed from from outside the class
		System.out.println("private Method");
		}
	
	protected void protectedMethod(){          //it allows class,method,or variables to be accessed within samepackageor by subclass
		System.out.println("protectedMethod");  //of class,even if they are in different package
	}
		void defaultMethod(){                  //it has no modifiers, it can only be accessed within same package
		System.out.println("defaultMethod");

	}
	}

