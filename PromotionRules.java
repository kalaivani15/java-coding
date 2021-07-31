package datatypes;

public class PromotionRules {

	public static void main(String[] args) {
		/*All byte and short values are promoted to int.
		If one operand is a long, the whole expression is promoted to long.
		If one operand is a float, the entire expression is promoted to float.
		If any of the operands is double, the result is double.
         */
	    byte b = 4;
	    float f = 5.5f;
	    float result = (f * b);
	    System.out.println(result);	
		
		
		
		
		
		
	}

}
