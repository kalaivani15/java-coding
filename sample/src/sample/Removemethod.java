package sample;

import java.util.ArrayList;

public class Removemethod {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("bmw");
		alist.add("suzuki");
		alist.add("benz");
		alist.add("toyato");
		System.out.println(alist);
		alist.remove(3);
		System.out.println(alist);
		System.out.println(alist.indexOf("bmw"));

	}

}
