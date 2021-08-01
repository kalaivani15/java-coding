package sample;
import java.util.*;

public class Pollof {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("mango");
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		list.poll();
		System.out.println("list after poll()" +list);
		list.pollFirst();
		System.out.println("list after pollFirst" +list);
		list.pollLast();
		System.out.println("list after pollLast" +list);
		

	}

}
