package lukesh;

public class IF_condition1 {
	public static void main (String[] args) {
		
		int a =4 ;
		if (a==4)
		{
			System.out.println("Hey buddy it is 4");
		}
		for (int b=1;b<6;b=b+1)
		{
			
			if(b==5)
			{
				System.out.println("The Number is :- " + b);
			}
			else if(b==6)
			{
				System.out.print("The value is 6");
			}
			else 
			{
				System.out.println("The values are not 5 or 6 ");
			}
		}
	}
}
