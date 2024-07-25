package basics;


class CarInfo{
	CarInfo(){
		      System.out.println("Current value of this---->"+this.hashCode());
		
	}
}
public class This_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarInfo obj = new CarInfo();
		System.out.println("Current value of obj---->"+obj.hashCode());

	}

}
