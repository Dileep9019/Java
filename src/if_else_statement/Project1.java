package if_else_statement;

import java.util.Scanner;

class dbpin{
	static int pin= 1234;
}

class ATM{
	static int min_bal=500;
	public static void Deposit() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		int amount=sc.nextInt();
		min_bal+=amount;
		ATM.balance();
	}
	public static void withdrawl() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the withdral amount");
		int amount =sc.nextInt();
		int total =min_bal-amount;
		if(total <=500) {
			System.out.println("The amount is insufficient.. You cannot withdraw !!!!");
		}else {
			total = min_bal;
			System.out.println("Your amount "+amount+"has been succesfully withdrawn");
		}
		ATM.balance();
		
	}
	public static void balance() {
		System.out.println("the balance amount is");
		System.out.println(min_bal);
	}
}
public class Project1 {
	public static void validation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin"); 
	     int pin=sc.nextInt();
		if(dbpin.pin ==pin) {
			int counter =0;
			while(counter<=3) {
				counter++;
				if(dbpin.pin == pin && counter<3) {
					char ch  = 'y';
					while(ch != 'n') {
						System.out.println("Welcome to ATM Services");
						System.out.println("our services please enter \n 1.Deposit \n 2.withdrawl \n 3.balance"); 
						int option =
						
					}
					
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
