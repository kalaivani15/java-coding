package myproject;

public class Refvar {
	public static void main(String[] args) {
	
		  String name = "kalaivani";
		  
		//take a particular portion of a string
		System.out.println(name.substring(0,5));
		
		//append the string
		System.out.println(name.concat("viji"));
		
		//replace the existing char. in a string
		System.out.println(name.replace('a', 'A'));
		
		//position of a char. in a string
		System.out.println(name.indexOf('i'));
		
		//convert the given datatype to string
		int n = 15;
		System.out.println(String.valueOf(n));
		 //uppercase
		System.out.println(name.toUpperCase());
		
		
		
		}
		
	}


