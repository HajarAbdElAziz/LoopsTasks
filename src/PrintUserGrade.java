import java.util.Scanner;

public class PrintUserGrade {

	public static void main(String[] args) {
		double res = 0.0;
		Scanner in = new Scanner(System.in);
		System.out.println("Hey Student, Please enter your Result: ");
		res = in.nextDouble();
		if (res > 0 && res <= 50) {
			System.out.println("Your grade is D");
		}
		else if (res > 50 && res <= 65) {
			System.out.println("Your grade is C");
		}
		else if (res > 75 && res < 85) {
			System.out.println("Your grade is B");
		}
		else if (res >= 85 && res <= 100) {
			System.out.println("Your grade is A");
		}
		in.close();
	}

}
