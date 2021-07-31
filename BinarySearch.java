package datatypes;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
	    String[] sortedArray = new String[] { "a", "b", "c", "d","e" };

	    System.out.println(Arrays.toString(sortedArray));
	    int index = Arrays.binarySearch(sortedArray, "c");

	    System.out.println(index);	

	  }	

	}


