package lukesh;

public class lukesh_strings {
	public lukesh_strings ()
	{
		System.out.println("Printing constructor ");
	}
	public static void main(String[] args) {
		String lukesh="Kalam Lukesh ";
		String h="Kumar";
		char c[] = h.toCharArray();
		System.out.println(lukesh);
		System.out.println(lukesh.length());
		System.out.println(lukesh+h);
		System.out.println(c[3]);
		
		
		
		int a=58;
		String k="Kumar";
		System.out.println(a+k);
		
		lukesh_strings good= new lukesh_strings();
	}
	
}



