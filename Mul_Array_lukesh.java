package lukesh;

public class Mul_Array_lukesh {
	public static void main (String[] args)
	{
		int[][] grid = {
				{3,5,6,7},
				{6,8,99,1},
				{1,2,3,4}
		};
		// System.out.println(grid[2][3]);
		
		for (int row=0;row<grid.length;row++)
		{
			for (int col=0;col<grid[row].length;col=col+1)
			{
				System.out.print(grid[row][col]+"\t");
			}
			System.out.println();
		}
	}
}
