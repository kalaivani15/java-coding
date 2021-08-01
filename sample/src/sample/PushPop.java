package sample;
import java.util.*;

public class PushPop {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("red");
		list.add("yellow");
		list.add("pink");
		System.out.println("list contain" +list);
		list.push("violet");
		System.out.println("list after push" +list);
		list.pop();
		System.out.println("list after pop" +list);
		

	}

}
