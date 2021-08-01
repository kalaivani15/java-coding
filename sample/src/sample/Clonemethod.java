package sample;
import java.util.*;

public class Clonemethod {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("num1");
		list.add("num2");
		list.add("num3");
		list.add("num4");
		list.add("num5");
		System.out.println("list is" +list);
		LinkedList<String> list2 = new LinkedList<String>();
		list2 = (LinkedList)list.clone();
		System.out.println("the clone of list2" +list2);
		
		
		

	}

}
