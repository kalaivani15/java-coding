package datatypes;

public class Array2dimension {
	public static void main(String[] args) {
	    int twoD[][] = new int[3][3];
	    for (int i = 0; i < 3; i++) {
	      for (int j = 0; j < 3; j++) {
	        twoD[i][j] = i*j;
	      }
	    }
	    for (int i = 0; i <3; i++) {
	      for (int j = 0; j < 3; j++) {
	        System.out.print(twoD[i][j] + " ");
	      }
	      System.out.println();
	    }
	  }
}