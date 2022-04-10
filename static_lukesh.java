package lukesh;
// Static variable can be accessed by the class  or even with object
// Static method can access static data because they both belonged to same type
// Static method cannot access non  
class lukesh 
{
	String Name ;
	public final static int lucky_Number = 7;
	public static String description ;
	public static int count = 0;
	
	public lukesh()
	{
		count++;
	}
	
	public static void method ()
	{
		System.out.println(description);
		
	}
}
public class static_lukesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lukesh lu1 = new lukesh();
		lukesh lu2 = new lukesh();
		
		lu1.Name="lukesh kumar";
		lu2.Name="Kalam " ;
		
		System.out.println(lu1.Name);
		System.out.println(lu2.Name);
		lukesh.description="Hey buddy";
		lukesh.method();
		
		System.out.println(Math.PI);
		
		lu1.description="hey";
		System.out.println(lu1.description);
		// lukesh.lucky_Number=8;
		
		System.out.println(lukesh.lucky_Number);
		
		System.out.println(lukesh.count);
		
	}

}
