package if_else_statement;

import java.util.Scanner;

public class Problem24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sum =0;
		for(int i=1; i<num; i++) {
			if(num % i == 0) {
				sum +=i;

			}		
	}
		if(sum > num) {
			System.out.println("Number is abundant number : ");
		}else {
			System.out.println("Number is not abundant number : ");
		}

	}

	}


