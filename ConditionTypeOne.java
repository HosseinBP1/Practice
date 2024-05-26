//ConditionTypeOne.java

public class ConditionTypeOne {
	public static void main(String[] args) {
		int A = 88;
		int B = 89;
		// The input is consist of two variables namely "A" & "B".
		
		if (A>B)
			System.out.println("88 is grater than 89");
			// If the variable A is grater than B, then the out put is "88 is grater than 89".
		
		else if (A<B)
			System.out.println("89 is greater than 88");
			// If the vice versa is true, "89 is greater than 88" will be printed.
		
		else
			System.out.println("88 is equal to 89");
			/* If none of the variables is grater and there is an equivalence, then there will be
			"88 is equal to 89" printed. */
	}
}
