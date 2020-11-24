import java.util.Scanner;

public class ArraySearchNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arrSize;
		int num;
		int index = -1;
		System.out.println("Hey Friend, Please enter the array size");
		arrSize = in.nextInt();
		int myList[] = new int[arrSize];
		System.out.println("Hey Friend, Pleaes enter the numbers: ");
		for (int i = 0; i < arrSize; i++) {
			myList[i] = in.nextInt();
		}
		System.out.println("Pleaes enter the number you want to search: ");
		num = in.nextInt();
		for (int i = 0; i < arrSize; i++) {
			if (num == myList[i]) {
				index = i;
			}
		}
		if (index != -1) {
			System.out.println("Number Found at index: " + index);
		} else {
			System.out.println("Number not Found");
		}
		in.close();
	}
}
