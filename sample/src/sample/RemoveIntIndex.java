package sample;
import java.util.*;
public class RemoveIntIndex {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println("list element "+list);
		for(String var :list)
		System.out.println(var);
		list.remove(0);    // b c d e
		list.remove(2);    //b c e
		list.remove(2);    //b c
		
		System.out.println("list element after removing");
		for(String var1 : list)
			System.out.println(var1);
			
			
	}

}
