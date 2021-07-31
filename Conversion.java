package datatypes;

public class Conversion {

	public static void main(String[] args) {
		   byte b;
		    int i = 1;
		    double d = 1.123;

		    i = (int) d; //conversion f double into int
		    System.out.println("d: " + d + " i: " + i);

		    b = (byte) d; //conversion of byte into double
		    System.out.println("d: " + d + " b: " + b);

		  
		

	}

}
