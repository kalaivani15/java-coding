package datatypes;
import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
	    String[] abc = { "a", "b", "c", "d" };
	    String[] xyz = { "A", "b", "c", "s" };
	    
	    System.out.println(Arrays.equals(abc, xyz));
	}

}
