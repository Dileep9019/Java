package if_else_statement;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit");
		int digit = sc.nextInt();
		int sum =0;
		while(digit > 0) {
			int rem = digit % 10;
			sum += rem;
			digit /=10;
			
		}
		System.out.println("The digit sum is:"+sum);
	}

}
