package if_else_statement;

import java.util.Scanner;
class DB{
	 static int storeusername = 123;
	 static int storepassword = 247;
}
class loginSystem{
	public static void validation(int username) {
		Scanner sc = new Scanner(System.in);
		int storeusername = DB.storeusername;
	    if(storeusername== username) {
	    	System.out.println("hey"+username+"please enter the password");
	    	int password = sc.nextInt();
	    	if(DB.storepassword==password) {
	    		System.out.println("you are successfully logged in");
	    	}else {
	    		System.out.println("password is wrong");
	    	}
	    }
	}
}


public class Test5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the number");
		int username = input.nextInt();
		loginSystem.validation(username);

	}

}
