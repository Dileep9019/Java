package basics;

public class Blocks_1 {
	
	static int count = 0;
	{
		count++;
	}

	
	public static void getCount() {
	   System.out.println(count);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blocks_1 b1 = new Blocks_1();
		Blocks_1 b2 = new Blocks_1();
		Blocks_1 b3 = new Blocks_1();
		Blocks_1.getCount();

	}

}
