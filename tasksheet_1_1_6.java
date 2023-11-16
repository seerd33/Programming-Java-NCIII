import java.util.Scanner;

public class tasksheet_1_1_6 {

	public static void main(String[] args) {
	
	int num1, num2, num3, l_num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input 1st number: ");
        num1 = scan.nextInt();

        System.out.print("Input 2nd number: ");
        num2 = scan.nextInt();

        System.out.print("Input 3rd number: ");
        num3 = scan.nextInt();

        l_num = findLargestNumber(num1, num2, num3);

        if (l_num == Integer.MIN_VALUE) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("The largest number is: " + l_num);
        }

        scan.close();
    }

    public static Integer findLargestNumber(Integer num1, Integer num2, Integer num3) {
        // Check if all numbers are equal
        if (num1 == num2 && num2 == num3) {
            return Integer.MIN_VALUE; // Indicate that all numbers are equal
        }

        // Find the largest number
        int largest = Math.max(num1, Math.max(num2, num3));
        return largest;
	}
}
