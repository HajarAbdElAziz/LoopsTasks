import java.util.Scanner;

public class SumAndAverageOfArray {

	public static void main(String[] args) {
		int sum = 0;
		Scanner in = new Scanner(System.in);
		int myList[] = new int[10];
		System.out.println("Hey Friend, Pleaes enter ten integers: ");
		for (int i = 0; i < 10; i++) {
			myList[i] = in.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			sum += myList[i];
		}
		System.out.println("Sum of the Numbers= " + sum);
		System.out.println("Average of the Numbers= " + sum/10);
		in.close();

	}

}
