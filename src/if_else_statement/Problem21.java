package if_else_statement;

import java.util.Scanner;
public class Problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sum =0;
		for(int i=1; i<=num/2; i++) {
			if(num % i == 0) {
				sum +=i;

			}		
	}
		if(num == sum) {
			System.out.println("Number is perfect number : ");
		}else {
			System.out.println("Number is not perfect number : ");
		}

	}
}
