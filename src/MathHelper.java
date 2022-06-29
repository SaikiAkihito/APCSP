import java.util.Scanner;

public class MathHelper {

	public static void main(String[] args) {
		// Calls to a students created procedure
		int[] numbersOne = fillArrayWithNumbers();
		// Calls to a students created procedure
		int[] numbersTwo = fillArrayWithNumbers();
		// Calls to a students created procedure
		giveTest(numbersOne, numbersTwo, "add");
		// Calls to a students created procedure
		giveTest(numbersOne, numbersTwo, "sub");
	}

	// A student created procedure that takes in 2 integer arrays and a string
	public static void giveTest(int[] numsOne, int[] numsTwo, String type) {
		int answer = 0;
		int playerAnswer = 0;
		int score = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		if (type.equals("add")) {
			for (int x = 0; x < numsOne.length; x++) {
				answer = numsOne[x] + numsTwo[x];
				System.out.println(numsOne[x] + " + " + numsTwo[x] + " = ");
				System.out.print("enter answer");
				playerAnswer = scan.nextInt();
				count = count + 1;
				if (playerAnswer == answer) {
					System.out.println("Correct !!!");
					score = score + 1;
				} else {
					System.out.println("Sorry incorrect !!!");
				}
			}
			// Outputs score in %
			System.out.println("Your score is " + (int) (1.0 * score / count * 100));
		} else if (type.equals("sub")) {
			for (int x = 0; x < numsOne.length; x++) {
				answer = numsOne[x] - numsTwo[x];
				System.out.println(numsOne[x] + " - " + numsTwo[x] + " = ");
				System.out.print("enter answer");
				playerAnswer = scan.nextInt();
				count = count + 1;
				if (playerAnswer == answer) {
					System.out.println("Correct!!!");
					score = score + 1;
				} else {
					System.out.println("Sorry incorrect !!!");
				}
				System.out.println("Your score is " + (int) (1.0 * score / count * 100));
			}
		}
	}

	// user created procedure that fills the array with
	// integers 1, 2 or 3 randomly
	public static int[] fillArrayWithNumbers() {
		int[] nums = new int[3];
		for (int x = 0; x < nums.length; x++) {
			nums[x] = (int) (Math.random() * 100) + 1;
		}
		return nums;
	}
}
