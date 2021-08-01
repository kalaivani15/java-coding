package sample;
import java.util.*;

public class Getlist {

	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		a.add("item1");
		a.add("item2");
		a.add("item3");
		a.add("item4");
		System.out.println("element in a" +a);
		System.out.println(a.get(1));
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		

	}

}
