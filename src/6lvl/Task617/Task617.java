package Task617;

import java.util.Arrays;

public class Task617 {
	
	public static int[][] result = new int[2][];
	public static int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
	
	public static void main(String[] args) {
		int[] array2;
		int[] array3;
		if (array.length % 2 == 0)
		{
			array2 = Arrays.copyOfRange(array, 0, array.length / 2);
			array3 = Arrays.copyOfRange(array, array.length / 2, array.length);
		}
		else
		{
			array2 = Arrays.copyOfRange(array, 0, array.length / 2 + 1);
			array3 = Arrays.copyOfRange(array, array.length / 2 + 1, array.length);
		}
		result[0] = array2;
		result[1] = array3;
		
		System.out.println(Arrays.deepToString(result));
	}
}
