package if_else_statement;

import java.util.Scanner;

public class divisior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number:");
		int num = sc.nextInt();
		for(int i=1;i<num;i++) {
			if(num % i == 0) {
				System.out.println(num + " is divide by " + i);
			}
		}
		

	}

}
