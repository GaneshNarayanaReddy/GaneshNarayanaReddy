package oops;

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing ts= new Testing();
		ts.Technicalskills();
		ts.Communicationskills();
		
	}
	public void Technicalskills() {
		System.out.println("Automation testing");
		}

	public void Communicationskills() {
		System.out.println("English");

	}

	} 
     class Testing extends Methodoverriding{

	@Override
	public void Technicalskills() {
		System.out.println("API testing");

	}
	@Override
	public void Communicationskills() {
		System.out.println("french");

	}
		
	}
