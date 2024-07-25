package basics;

class Emp{
	int empId;
	String empName;
	
	Emp(int id, String name){
		empId=id;
		empName=name;
	}
	
	public void showInfo() {
		System.out.println("EmpId:"+empId+"EmpName:"+empName);
	}
}
public class Employee {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         Emp e1 = new Emp(101,"Dileep");
         Emp e2 = new Emp(102,"Harsh");
         e1.showInfo();
         e2.showInfo();
	}

}
