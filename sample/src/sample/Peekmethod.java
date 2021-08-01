package sample;
import java.util.*;

public class Peekmethod {

	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		a.add("item1");
		a.add("item2");
		a.add("item3");
		a.add("item4");
		a.add("item5");
		a.add("item6");
		System.out.println("element in a" +a);
		System.out.println(a.peek());
		System.out.println(a.peekFirst());
		System.out.println(a.peekLast());
		System.out.println("after peek,the list element" +a);
		
		

	}

}
