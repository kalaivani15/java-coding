package datatypes;
import java.util.Arrays;

public class SortSubRange {

	public static void main(String[] args) {
	    int[] i1 = new int[] { 51, 21, 31, 11, 41 };

	    Arrays.sort(i1, 1, 4); //subrange between 1 to 4
	    for (int i:i1){
	      System.out.print(" " + i);
	    }
	}
}


	  
		

	


