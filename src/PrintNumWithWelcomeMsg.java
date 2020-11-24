import java.util.Scanner;

public class PrintNumWithWelcomeMsg {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String myNames[] = new String[10];
		System.out.println("Hey Friend, Pleaes enter names u want: ");
		for (int i = 0; i < 10; i++) {
			myNames[i] = in.next();
		}
		System.out.println("Welcome Friend, Here are the numbers you entered");
		for (int i = 0; i < 10; i++) {
			System.out.println(myNames[i]);
		}
		in.close();
	}

}
