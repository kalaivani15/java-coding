package datatypes;
import java.util.Arrays;

public class SortShortArray {
	public static void main(String[] args) {
		
	
    short[] s1 = new short[] { 5, 2, 3, 1, 4 };
    Arrays.sort(s1);
    for (short s :s1) {
      System.out.print(" " + s);
    }
  }	
}


