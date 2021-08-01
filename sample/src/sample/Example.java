package sample;
import java.util.*;

public class Example {

	public static void main(String[] args) {
		ArrayList<String> obj =new ArrayList<String>();
		obj.add("rose");
		obj.add("lily");
		obj.add("lotus");
		obj.add("daisy");
		System.out.println("original arraylist ");
		for(String str :obj) 
			System.out.println(str);
			
			obj.add("sunflower");
			obj.add("sandal");
			System.out.println("after add to arraylist");
		
		for(String str :obj) 
			System.out.println(str);
			
			obj.remove(2);
			obj.remove(3);
			System.out.println("arraylist after remove the element");
			for(String str : obj)
				System.out.println(str);
		
		

	}

}
