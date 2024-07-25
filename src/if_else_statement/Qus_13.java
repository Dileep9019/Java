package if_else_statement;

public class Qus_13 {
	
	public static int totalAmt(int x, int y) {
		int money =0;
		for(int i=0; i<=y; i++) {
			if(i>x) {
				money++;
			}
			money++;
		}
		return money;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Qus_13.totalAmt(64,38));  
	}

}
