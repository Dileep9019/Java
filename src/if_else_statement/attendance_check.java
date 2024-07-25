package if_else_statement;

import java.util.Scanner;

public class attendance_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Held");
		double held = sc.nextDouble();
		System.out.println("attended");
		double attended = sc.nextDouble();
		double res = (attended /held);
		if(res >= 0.75) {
			System.out.println("exam eligible...");
		}
		else {
			System.out.println("exam not eligible..");
		}

	}

}
