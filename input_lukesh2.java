package lukesh;

import java.util.Scanner;

public class input_lukesh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For number input 
		Scanner number_input = new Scanner(System.in);
		
		System.out.println("Eneter some number input :- ");
		
		int num = number_input.nextInt();
		
		System.out.println("Entered input is :- " + num);
		
		
		// For Text input
		// Creating scanner object
		Scanner text_input =new Scanner(System.in);
		
		// Prompting some text 
		System.out.println("Enter some text input in the next line :- ") ;
		
		// Consuming some input  from user
		String lukesh = text_input.nextLine() ;
		
		System.out.println("Entered text input is :- " + lukesh) ;
			
	}
}
