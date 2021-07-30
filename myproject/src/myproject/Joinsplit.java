package myproject;

public class Joinsplit {

	public static void main(String[] args) {
		
		//return a joined string with delimiter
		System.out.println(String.join("-", "15" ,"6", "98"));
		
		String split = "I,learn,java";
		String [] splittedwords =split.split(",");
		for(String String : splittedwords) {
			System.out.println(String);
		}
		

	}

}
