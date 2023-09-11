package oops;

class A{
	public void name() {
		System.out.println("Print ganesh");
		}

		} class B extends A{
			public void name1()
			{
				super.name();
			}
			
			@Override
			public void name() {
				System.out.println("print reddy");
			}
		}
		public class Overriding extends B {
			public static void main(String[] args)
			{
				Overriding m2 = new Overriding();
				m2.name();
				m2.name1();
				
				
			
		}
}