package datatypes;
import java.util.*;

public class SearchDuplicate {

	public static void main(String[] args) {
	    Set<String> s = new HashSet<String>();
	    String[] data = new String[] {"cat", "dog", "rabbit", "dog"};
	    
	    for (String a : data)
	      if (!s.add(a))
	        System.out.println("Duplicate detected: " + a);	
	}

}
