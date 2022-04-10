package lukesh;

import java.util.Scanner;

public class switch_lukesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner (System.in) ;
		System.out.println("Enter some text :- ");
		String text =obj.nextLine();
		System.out.println(text);
		
		
		switch (text)
		{
			case "start" :
			
				System.out.println(" You entered start ");
				break ;
			
			case "stop"  :
			
				System.out.println("You entered stop ");
				break ;
			case "hello" :
				System.out.println("You entered hello");
				break ;
			default :
				System.out.println("Text input not found ");
				break ;
		}
	}

}
