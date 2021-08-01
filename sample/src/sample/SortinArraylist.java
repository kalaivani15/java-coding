package sample;
import java.util.*;

public class SortinArraylist {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("skyblue");
		colors.add("green");
		colors.add("red");
		colors.add("white");
		colors.add("black");
		Collections.sort(colors);
		System.out.println(colors);
		
	}

}
