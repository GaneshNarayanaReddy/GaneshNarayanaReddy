package Even.java;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";

		String temp="";

		for (int i=str.length()-1;i>=0; i--){ //0

		temp+=str.charAt(i); //olleh

		}

		System.out.println(temp);

	}

}
