package lukesh;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int num=6 ;
		do 
		{
			System.out.println("Enter any number :- "+num);
			
			System.out.println(num) ;
		}
		while (num == 6 ) ;
		{
			System.out.print(num);
			num=num+1;
		}
		
	}

}
