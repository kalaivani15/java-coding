package datatypes;
import java.util.*;

public class CopyNewArray {

	public static void main(String[] args) {
        int array[] = {42, 55, 21};
        int arrayNew[] = Arrays.copyOf(array, 3);             
        System.out.println(Arrays.toString(arrayNew));	
	 
	    }
	}	

	


