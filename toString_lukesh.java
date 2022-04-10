package lukesh;

class Frog 
{
	private int value;
	private String name ;
	
	public Frog(int value,String name)
	{
		this.name=name;
		this.value=value;
	}
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append(value).append(":").append(name);
		return String.format("Name is %S and value is %d", name,value);
		//return sb.toString();
//		return value+":"+name;
	}
}

public class toString_lukesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog fg1 =new Frog(78,"Lukesh");
		Frog fg2 =new Frog(87,"Lukesh Kumar");
		// If toString method is present in the class once print class it will autoamtically
		// print content in toString method 
		System.out.println(fg1);
		System.out.println(fg2);
		
	}

}
