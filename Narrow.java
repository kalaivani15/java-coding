package datatypes;

public class Narrow {
	
	  public static void main(String[] arg) {
		    int a = 1234;
		    byte b;

		    b = (byte) a;    //narrow casting

		    System.out.println("a is " + a);
		    System.out.println("b is " + b);
		  

	  }
}