package lukesh;

import java.util.Scanner;

public class array1_lukesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter some number :- ");
		int a = obj.nextInt();
		System.out.println(a);
		int[] values;
		values = new int[3];
		System.out.println("Enter some number array input : - ");
		values[0]=obj.nextInt();
		System.out.println(values[0]);
		
		
		for (int i=0;i<3;i=i+1)
		{
			System.out.println(i);
		}
	}

}
