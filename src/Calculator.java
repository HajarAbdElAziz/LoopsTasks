import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		String op;
		Scanner in = new Scanner(System.in);
		System.out.println("Hey Friend, Please enter two numbers and the operation u want:");
		num1 = in.nextInt();
		num2 = in.nextInt();
		op = in.next();
		if (op.equals("+")) {
			System.out.println("Num1+Num2= " + (num1 + num2));
		}
		else if (op.equals("-")) {
			System.out.println("Num1-Num2= " + (num1 - num2));
		}
		else if (op.equals("/")) {
			System.out.println("Num1/Num2= " + (num1 / num2));
		}
		else if (op.equals("%")) {
			System.out.println("Num1%Num2= " + (num1 % num2));
		}
		in.close();

	}

}
