package Task619;

import java.util.Arrays;
public class Task619 {


	    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
	    public static int element = 0;

	    public static void main(String[] args) {
	       boolean search;
	       int[] array2 = Arrays.copyOf(array,array.length);
	       Arrays.sort(array2);
	       if (Arrays.binarySearch(array2, element) >= 0)
	       search = true;
	       else search = false;
	       System.out.println(search);
	    }
	}
