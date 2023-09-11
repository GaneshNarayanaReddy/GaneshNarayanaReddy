package Even.java;

public class Democonstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		five f1=new five();
		
		f1.hyderabad();
		
		five f2=new five(30,40);
		

	}

}

class five{
	five()       //default constructor or unargumented constructor
	{
		System.out.println("this is constructor");
	}
	five(int a,int b){
		System.out.println("the addition of "+a+ "and"+b+"is"+(a+b));
	}
	
	public void hyderabad() {
		System.out.println("hyderabad");
		
		
	}
	public String next() {
		// TODO Auto-generated method stub
		return null;
	}
}
//constructer name is same as class name
//it will be called by default when an object is created
//it will not have any written type