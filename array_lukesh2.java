package lukesh;

import java.util.Scanner;

public class array_lukesh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int[] values ;
		values = new int[4];
		for (int i =0 ;i<values.length;i=i+1)
		{
			System.out.println("Enter any value :- ");
			values[i]=obj.nextInt();
		}
		for (int i=0;i<values.length;i=i+1)
		{
			System.out.println("entered value for a["+i+"]  is :- " +values[i]);
		}
		
		String[] fruits= {"apple","Mango","Banana"};
		for (int i=0;i<fruits.length;i=i+1)
		{
			System.out.println("entered value for fruits["+i+"]  is :- " +fruits[i]);
		}
		String[] newFruits ;
		newFruits = new String[fruits.length+1];
		for (int i =0;i<fruits.length;i=i+1)
		{
			newFruits[i]=fruits[i];
		}
		newFruits[newFruits.length-1]="lukesh";
		
		for (int i=0;i<=newFruits.length;i=i+1)
		{
			System.out.println(newFruits[i]);
		}
		
	}

}
