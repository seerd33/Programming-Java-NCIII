import java.util.Scanner;

public class tasksheet_1_1_5 {

	public static void main(String[] args) {
	
		try (Scanner entry1 = new Scanner(System.in)) {
            		System.out.print("Input a word: ");
            		StringBuilder stringBuilder = new StringBuilder(entry1.nextLine());
            
		if(stringBuilder.toString().equals(stringBuilder.reverse().toString()))
                	System.out.println("The input string is a palindrome.");
		else
                	System.out.println("The input string is not a palindrome.");
        	}
	}
}
