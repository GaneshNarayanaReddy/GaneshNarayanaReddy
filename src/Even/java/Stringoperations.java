package Even.java;

public class Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello,world";
		
		//length=used to find the length of string
		String str1 = "hello,world";
		System.out.println(str1.length());
		
		//equals=used to check the given string is equal or not
		boolean e = str1.equals("hello,world");
		System.out.println(e);
		
		//equals ignore case=it checks if it is equal or not but not consider upper and lower case
		boolean e1 = str1.equalsIgnoreCase("hello,world");
		System.out.println(e1);
		
		//to upper case=used for converting string to upper case
		String s2="hello,world";
		String e4=s2.toUpperCase();
		System.out.println(e4);
		
		//to lower case=used to convert string in to lower case
	     String s3="hello,world";
	     String e5=s3.toLowerCase();
		 System.out.println(e5);
		 
		 //starewith=used to check the sequence of thefirst word is present or not
		 String s4="going to play cricket";
		 System.out.println(s4.startsWith("going"));
		 
		 //endwith=used to check the string ends with specific word or not
		 System.out.println(s4.endsWith("cricket"));
		 
		 //indexof=it returns specific character value index
		 System.out.println(s4.indexOf("0"));
		 
		 //
		 
		 
		

	}

}
