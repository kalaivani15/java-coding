package datatypes;
import java.util.*;

public class ArrayFill {

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
	    Arrays.fill(array, 2, 6, -1);
	    System.out.println(Arrays.toString(array));
		

	}

}
