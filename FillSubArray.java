package datatypes;
import java.util.*;

public class FillSubArray {

	public static void main(String[] args) {
	    int startIndex = 0;
	    int endIndex = 4;

	    char[] Array = new char[] {'a','b','c','d','e','f','g'};
	    char Fillvalue = 65;

	    System.out.println(Arrays.toString(Array));
	    Arrays.fill(Array, startIndex, endIndex, Fillvalue);
	    System.out.println(Arrays.toString(Array));
	  
	

	}

}
