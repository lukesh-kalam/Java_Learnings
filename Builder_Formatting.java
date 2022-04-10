package lukesh;

public class Builder_Formatting {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info = "";
		
		
		//  Inefficient way will slow down your machine 
		info += "I am lukesh";
		info += " " ;
		info += " I am an engineer ";
		System.out.println(info);
		
		// Effient way 
		
		StringBuilder sb = new StringBuilder ();
		sb.append(" ");
		sb.append("I am Lukesh Kumar") ;
		sb.append("I am an engineer ");
		System.out.println(sb.toString());
		
		System.out.println("Hey boys ") ;
		System.out.print("fast and furious \t hooorey \n good to go  \n ");
		
		// self containing formatting character 
		System.out.printf("The quantity of rice is %d ;Total consumption is %d \n ",25 , 100);
		System.out.printf("I am %s","fine");
		
		// Formatting integers 
		for (int i=9;i<14;i++)
		{
			System.out.printf("%2d : is the number \n",i);
		}
		
		
	}

}
