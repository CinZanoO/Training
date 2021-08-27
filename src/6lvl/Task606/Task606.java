package Task606;
import java.util.Scanner;
public class Task606 {
	
		public static int[] array;
		
	    public static void main(String[] args) throws Exception {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        array = new int [n];
	        for (int i = 0;i < array.length;i++)
	        array[i] = scanner.nextInt();
	        scanner.close();
	        int min = array[0];
	        for (int i = 0;i < array.length;i++)
	        if (array[i] < min)
	        min = array[i];
	        System.out.println(min);
	    }
}


