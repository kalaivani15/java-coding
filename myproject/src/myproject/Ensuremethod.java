package myproject;

public class Ensuremethod {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity());     //default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());     //now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());         //now (16*2)+2=34   
		sb.ensureCapacity(10);      
		 //now no change ,because capacity is no greater than current capacity
		
		System.out.println(sb.capacity());    //now 34  
		sb.ensureCapacity(50);
		//now (34*2)+2 ,because capacity is greater than current capacity
		System.out.println(sb.capacity());


	}

}
