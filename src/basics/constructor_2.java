package basics;


class StudentData{
	int studentId;
	String studentName;
	
	StudentData(int id,String name){
		studentId =id;
		studentName= name;
	}
	StudentData(StudentData obj){
		studentId = obj.studentId;
		studentName = obj.studentName;
	}
	public void show() {
		System.out.println(studentId+" "+studentName);
	}
}
public class constructor_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData s1 = new StudentData(101,"dileep");
		s1.show();
		StudentData s2 = new StudentData(102,"harsh");
		s2.show();
		

	}

}
