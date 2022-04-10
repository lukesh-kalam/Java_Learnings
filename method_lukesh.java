package lukesh;

class student 
{
	int roll_no;
	String student_name;
	
	// method 
	void stud1()
	{
		System.out.println("Good mornig man") ;
		System.out.println(roll_no);
		System.out.println(student_name);
	}
	
	void hello () 
	{
		System.out.println("Hello buddy how is the life ") ;
	}
	
	int get_age() 
	{
		return roll_no ;
	}
	
}

public class method_lukesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student student_details=new student();
		student_details.roll_no=52;
		student_details.student_name="Lukesh Kumar";
		
		
		
		student_details.stud1();
		student_details.hello();
		System.out.println(student_details.get_age()) ;
	}

}
