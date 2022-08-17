package BasicElseIfOnly;

import java.util.Scanner;

public class Even_Or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		if (a % 2 == 0) {
			System.out.println("Even");
		} else
			System.out.println("Odd");
	}
}
