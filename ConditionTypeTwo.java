//ConditionTypeTwo.java

public class ConditionTypeTwo {
	public static void main(String[] args) {
		int TbzToTeh = 559;
		// The distance between Tabriz and Tehran.
		int TehToMshd = 647;
		// The distance between Tehran and Mashhad.
		
		System.out.println(TbzToTeh + TehToMshd);
		/* First we calculate the distance between Tabriz and Mashhad by summing the 
		two variables */
		
		boolean IMT700 = TbzToTeh + TehToMshd > 700;
				// "IGT700" stands for "Is More than 700"; is true if the sum is more than 700.
		boolean IET700 = TbzToTeh + TehToMshd == 700;
				// "IET700" stands for "Is equal to 700"; is true if the sum equals 700.
		
		if (IMT700)
			System.out.println("The distance between Tabriz and Mashhad is more than 700Km.");
		/* 
		 * If the boolean "IMT700" is true, then the distance between Tabriz and Mashhad is 
		 * more than 700km and there "The distance between Tabriz and Mashhad is more than 
		 * 700Km." is printed.
		 */
		
		else if (IET700)
			System.out.println("The distance between Tabriz and Mashhad equals 700Km.");
		/* 
		 * If the boolean "IET700" is true, then the distance between Tabriz and Mashhad is 
		 * equal to 700km and there "The distance between Tabriz and Mashhad equals
		 * 700Km." is printed.
		 */
		
		else
			System.out.println("The distance between Tabriz and Mashhad is less than 700Km.");
		/* 
		 * If none of the options above is true, then the distance between Tabriz and Mashhad is
		 * less than 700km and there "The distance between Tabriz and Mashhad is less than 
		 * 700Km." is printed.
		 */
	}
}
