package datatypes;
import java.util.*;

public class CopyInArray {

	public static void main(String[] args) {
	    String[] letters = { "A", "E", "I", "O", "U" };
	    String[] results = new String[3];
	    System.arraycopy(letters, 2, results, 0, 3);
	    System.out.println(Arrays.toString(results));
	    
		

	}

}
