import java.util.Scanner;

public class NumberMultiplications {

	public static void main(String[] args) {
		int num = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Hey friend, Please Enter a num:");
		num = in.nextInt();
		for (int i = 0; i <= 12; i++) {
			System.out.println(num + "*" + i + "=" + num * i);

		}
		in.close();
	}

}
