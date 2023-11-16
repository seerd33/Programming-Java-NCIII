public class tasksheet_1_1_4 {

	public static void main(String [] a){
	
	int score = 101;

		if (score >= 90 && score <= 100){
			System.out.println("You have a grade of A");
		}
		else if (score >= 80 && score <= 89){
			System.out.println("You have a grade of B");
		}
		else if (score >= 70 && score <= 79){
			System.out.println("You have a grade of C");
		}
		else if (score >= 60 && score <= 69){
			System.out.println("You have a grade of D");
		}
		else if (score < 69){
			System.out.println("You have a grade of F");
		}
		else{
			System.out.println("Invalid score! Please try again.");
		}

	}
}