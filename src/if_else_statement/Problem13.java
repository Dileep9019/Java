package if_else_statement;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int digit2 = sc.nextInt();
		int t1 = digit2;
		int t2 = digit2;
		int sum = 0;
		int cnt = 0;
		
		while(digit2>0) {
			cnt++;
			digit2 /= 10;
		}
		
		while(t1 > 0 ) {
			int r = t1 % 10;
			sum = (int) ( sum + Math.pow(r,cnt));
			t1 /=10;
		}
		if(t2 == sum) {
			System.out.println("is Armstrong.");
		}else {
			System.out.println("is not Armstrong..."); 
		}

	}

}
