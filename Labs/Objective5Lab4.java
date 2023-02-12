import java.util.Scanner;
public class Objective5Lab4 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int num = myScanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("The number is even.");
		}

		if (num % 2 != 0) {
			System.out.println("The number is odd.");
		}


	}
}
