package sample;
import java.util.*;

public class linkedtoArraylist {

	public static void main(String[] args) {
	    LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("java");
	    linkedlist.add("python");
	    linkedlist.add("CSS");
	    linkedlist.add("C");
	    linkedlist.add("C++");

	    List<String> list = new ArrayList<String>(linkedlist);

	    for (String str : list){
	      System.out.println(str);	
	    }

	}

}
