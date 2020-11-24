

import java.util.Scanner;

public class ArraySearchStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arrSize;
		String stringX;
		int index = -1;
		System.out.println("Hey Friend, Please enter the array size");
		arrSize = in.nextInt();
		String myString[] = new String[arrSize];
		System.out.println("Hey Friend, Pleaes enter the strings: ");
		for (int i = 0; i < arrSize; i++) {
			myString[i] = in.next();
		}
		System.out.println("Pleaes enter the text you want to search: ");
		stringX = in.next();
		for (int i = 0; i < arrSize; i++) {
			if (stringX.equals(myString[i])) {
				index = i;
			}
		}
		if (index != -1) {
			System.out.println("Text Found at index: " + index);
		} else {
			System.out.println("Text not Found");
		}
		in.close();
	}
}