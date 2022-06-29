import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How many tests?");
		int numTests = scan.nextInt(); // reads input 
		//Calling the fillyArray procedure 
		int[] testScores = fillArray (numTests);
		System.out.println("Drop lowest grade? (y/n) ");
		char dropLowest = scan.next().charAt(0); // reads input 
		//Calling the getAverage procedure 
		double average = getAverage (testScores, dropLowest); 
		System.out.println("The average is: " + average);
	}
	public static int[] fillArray(int num) {
		int[] tempTestScores = new int[num]; 
		Scanner scan = new Scanner (System.in); // Scanner Libary 
		for(int x = 0 ; x < tempTestScores.length; x++) {
			System.out.print ("Enter Test Value: ");
			tempTestScores [x] = scan.nextInt();
		}
		return tempTestScores;
	}

	public static double getAverage (int[] testScores, char dropLowest) {
		int count = 0; 
		int total = 0; 
		for(int x = 0 ; x < testScores.length; x++) {
			total = total + testScores [x] ;
			count = count + 1;
		}
		if (dropLowest == 'y') {
			int min = testScores [0]; 
			for(int x = 0; x < testScores.length; x++) {
				if (testScores[x] < min) 
					min = testScores[x];
			}
			return (total - min) / (count - 1);
		} 
		else {
			return total / count;
		}
	}

}
