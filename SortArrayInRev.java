package datatypes;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayInRev {

	public static void main(String[] args) {
	    String[] myArray = new String[] { "k","a","l","a","i"};
	    Arrays.sort (myArray, Collections.reverseOrder());
	    System.out.println(Arrays.toString(myArray));	
	    
	}

}
