package lukesh;

import java.util.Scanner;

public class array_lukesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values;
		values =new int[3];
		
		values[0]=12;
		values[1]=13;
		values[2]=134;
		
		//System.out.println(values[0]);
		//System.out.println(values[1]);
		//System.out.println(values[2]);
		
		for (int i=0;i<values.length;i=i+1)
		{
			System.out.println(values[i]);
		}
		Scanner obj =new Scanner(System.in);
		System.out.println("enter something :- ");
		double hello = obj.nextDouble();
		System.out.println(hello);
		
		
	}

}
