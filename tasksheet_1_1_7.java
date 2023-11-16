import java.util.Scanner;

public class tasksheet_1_1_7 {
	
	public static void main(String[] args) {
	
		int a, b, sum, difference, prod, quotient;

        	Scanner scan = new Scanner(System.in);

        	System.out.print("Input 1st number: ");
        	a = scan.nextInt();

	        System.out.print("Input 2nd number: ");
        	b = scan.nextInt();

	        sum = add(a, b);
	        difference = sub(a, b);
	        prod = mult(a, b);
	        quotient = div(a, b);

		System.out.println("The sum is: " + sum + '\n' + "The difference is: " + difference + '\n' + "The product is: " + prod + '\n' + "The quotient is: " + quotient);

        	scan.close();
	}

	// addition
	public static Integer add(Integer a, Integer b){
	int result = a + b;
	return result;
	}

	// subtraction
	public static Integer sub(Integer a, Integer b){
	int result = a - b;
	return result;
	}

	// multiplication
	public static Integer mult(Integer a, Integer b){
	int result = a * b;
	return result;
	}

	// division
	public static Integer div(Integer a, Integer b){
	int result = a / b;
	return result;
	}
}
