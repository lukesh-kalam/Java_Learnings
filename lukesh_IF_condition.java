package lukesh;

public class lukesh_IF_condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =17 ;
		if (a==15) 
		{
			System.out.println("A is equal to 15");
		}
		else if(a==16)
		{
			System.out.println("A is equal to 16");
		}
		else
		{
			System.out.println("They are not equal");
		}
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
	}

}
