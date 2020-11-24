import java.util.Scanner;

public class DrawPyramid {

	public static void main(String[] args) {
		int choice;
		Scanner in = new Scanner(System.in);
		System.out.println("Hey friend, Please write 1 if u want half pyramid OR 2 if u want full pyramid");
		choice = in.nextInt();

		if (choice == 1) {
			int row1;
			System.out.println("Please enter number of rows:");
			row1 = in.nextInt();
			for (int j = 0; j < row1; j++) {
				for (int i = 0; i < j + 1; i++) {
					System.out.print("*");
				}
				System.out.println();
			}

		} else if (choice == 2) {
			int row2;
			System.out.println("Please enter number of rows:");
			row2 = in.nextInt();
			int x = row2;
			int y = 1;
			for (int j = 0; j < row2; j++) {
				x--;
				for (int i = 0; i < x; i++) {
					System.out.print(" ");
				}
				for (int i = 0; i < y; i++) {
					System.out.print("*");
				}
				System.out.println();
				y = y + 2;
			}
		} else
			System.out.println("Please enter valid choice");
	}
}
