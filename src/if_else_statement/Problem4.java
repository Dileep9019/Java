package if_else_statement;

import java.util.Scanner;

public class Problem4 {
  
	public static void Number(int a,int b) {
		if(a>b) {
			System.out.println(" a is greater than b ");
		}else {
			System.out.println("b is greater than a");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Number(4, 6);


	}

}
