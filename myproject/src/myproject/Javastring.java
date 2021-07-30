package myproject;

public class Javastring {

	public static void main(String[] args) {
		String name ="kalai";
		//  return character value for particular index
		System.out.println(name.charAt(1));
		
		//return string length
		System.out.println(name.length());
		
		//check equality 
		System.out.println(name.equals("vani"));
		
		//check equality without case sensitivity
		System.out.println(name.equalsIgnoreCase("KALAI"));
		
		//check,if string is empty
		System.out.println(name.isEmpty());
		
		//value is present or not
		System.out.println(name.contains("i"));
		
	
		
	}

}
