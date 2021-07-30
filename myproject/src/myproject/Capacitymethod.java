package myproject;

public class Capacitymethod {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity());   //by default,capacity is 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now capacity is  16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now capacity is (oldcapacity*2)+2
		                                                  //  (16*2)+2=34 

	}

}
