package sample;
import java.util.*;

public class Sublist {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("sri");
		a.add("vj");
		a.add("bhuvi");
		a.add("kavi");
		a.add("raj");
		System.out.println("element in a"+a);
		ArrayList<String> b = new ArrayList<String>(a.subList(1,4));   
		System.out.println("element in b"+b);
		
		
	

	}

}
