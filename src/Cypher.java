import java.util.Scanner;

public class Cypher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // creates Scanner object
		System.out.println("Enter word to be encrypted");
		String word = scan.nextLine(); // scanner method
		System.out.println("Enter key length");
		int keyLength = scan.nextInt(); // scanner method
		// ************ calls student developed method
		char[] chacterArray = fillArray(word);
		// ************ calls student developed method **
		int[] key = getKey(keyLength);
		// ************ calls student developed method ************
		char[] scramble = changeWord(chacterArray, key, true);
		// ************ calls student developed method ***********
		char[] deScramble = changeWord(scramble, key, false);
	}

	// ************ student developed method ************/
	public static char[] changeWord(char[] cArray, int[] key, boolean en) {
		char[] temp = new char[cArray.length];
		if (en == false) {
			System.out.print("Actual word: ");
			for (int x = 0; x < cArray.length; x++) {
				temp[x] = (char) (cArray[x] - key[x % key.length]);
				System.out.print(temp[x] + "");
			}
			System.out.println();
			return temp;
		} else {
			System.out.print("Scrambled word: ");
			for (int x = 0; x < cArray.length; x++) {
				temp[x] = (char) (cArray[x] + key[x % key.length]);
				System.out.print((char) (temp[x]) + "");
			}
			System.out.println();
			return temp;
		}
	}

//************ student developed method *********

	public static char[] fillArray(String temp) {
		char[] t = new char[temp.length()];
		for (int x = 0; x < t.length; x++) {
			t[x] = temp.charAt(x);
		}
		return t;
	}

// ************ student developed method ********
	public static int[] getKey(int keyLength) {
		Scanner scan = new Scanner(System.in);
		int[] key = new int[keyLength];
		for (int x = 0; x < key.length; x++) {
			key[x] = scan.nextInt();
		}
		return key;
	}

}
