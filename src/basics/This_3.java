package basics;

class Pen{
	Pen(){
		System.out.println("no-arg constructor called");
	}
	Pen(int a){
		this();//no-arg constructor called
		System.out.println("one-arg constructor called");
	}
}
public class This_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p = new Pen(10);

	}

}
