package if_else_statement;

import java.util.Scanner;

public class Problem6 {

	public static int CheckGreatestNumber(int a, int b, int c) {
		if(a==b && a==c) {
			return a;
		}
		if(a>b && a>c) {
			return a;
		}
		if(b>c && b>a) {
			return b;
		}
		else {
			return c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 int a=sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 
		 int d = CheckGreatestNumber(a,b,c);
		 System.out.println("The number greater is : "+d);
	}

} 
