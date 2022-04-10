package lukesh;

import java.util.Scanner;

class method_params
{
	void hello(String text) 
	{
		System.out.println("here is the text :- "+text);
	}
	void addTwoNumber(int roll_no,String Name) 
	{
		System.out.println(roll_no) ;
		System.out.println(Name);
	}
	
}
public class metod_parameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_params mp = new method_params();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Something :- ");
		String lukesh=obj.nextLine();
		// System.out.println(lukesh);
		mp.hello(lukesh);
		mp.addTwoNumber(788,lukesh);
	}

}
