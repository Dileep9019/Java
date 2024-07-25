package if_else_statement;

import java.util.Scanner;

public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int num = sc.nextInt();
		System.out.println("Factor of numbers are : ");
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.println(i + " ");
			}
		}

	}

}
