import java.util.Scanner;

public class PrintUserResult {

	public static void main(String[] args) {
		String grade;
		Scanner in = new Scanner(System.in);
		System.out.println("Hey Student, Please enter your Grade: ");
		grade = in.next();
		if (grade.equals("A") || grade.equals("a")) {
			System.out.println("Your range is from 85 till 100");
		} else if (grade.equals("B") || grade.equals("b")) {
			System.out.println("Your range is from 75 till 85");
		} else if (grade.equals("C") || grade.equals("c")) {
			System.out.println("Your range is from 65 till 75");
		} else if (grade.equals("D") || grade.equals("d")) {
			System.out.println("Your range is from 50 till 65");
		} else if (grade.equals("F") || grade.equals("f")) {
			System.out.println("Your range is from 0 till 50");
		} else {
			System.out.println("Please Enter a valid input.");
		}
		in.close();
	}

}
