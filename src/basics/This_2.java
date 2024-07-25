package basics;
//When instance variable and local variable is having same name, this is used
//to identify instance variable 

class EmployeeData{
	int empId;
	String empName;
	
	EmployeeData(int id, String name){
		empId = id;
		empName = name;
	}
	
	public void show() {
		System.out.println("EmpId :"+this.empId+" EmpName : "+this.empName);
	}
}
public class This_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData obj = new EmployeeData(101,"Dileep");
		obj.show();

	}

}
