package sample;
import java.util.*;

public class AddAllmethod {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("hey");
		l1.add("hello");
		l1.add("hi");
		l1.add("hoii");
		System.out.println("l1 is"+l1);
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("oi");
		l2.add("huh");
				
		l1.addAll(l2);
		System.out.println(l1);
		
		

	}

}
