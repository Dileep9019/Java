package if_else_statement;

import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:: ");
		int num1 = sc.nextInt();
        System.out.println("Enter the secenod number:: ");
        int num2 = sc.nextInt();
        
        for(int i=num1; i<=num2; i++) {
        	int check;
        	int sum = 0;
        	check =i;
        	while(check != 0) {
        		int rem = check %10;
        		sum = sum+(rem * rem* rem);
        		check = check/10;
        	}
        if(check == sum) {
        	System.out.println(" is an Armstrong "+i);
        }
        }
	}

}
