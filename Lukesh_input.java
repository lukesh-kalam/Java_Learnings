package lukesh;

import java.util.Scanner;

public class Lukesh_input extends lukesh_strings{

	 public static void main(String[] args) {
		
		 //Create a Scanner object
		Scanner input=new Scanner(System.in) ;
		
		// Output the prompt
		System.out.println("Ener any text :- ");
		
		//Wait for the user to enter a line of text 
		String line =input.nextLine();
		
		//Tell them what they entered 
		
		System.out.println("You Entered : - " + line);
		
		String lines=input.nextLine();
		
		System.out.println("You Entered : - " + lines);
		
		
		lukesh_strings h = new lukesh_strings();
		 // h.main();
		 
	}
	
}
