package Task605;
import java.util.Scanner;
public class Task605 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner (System.in);
	        int number = scanner.nextInt();
	        int [] array = new int[number];
	        for (int i = 0;i < number;i++)
	        array[i] = scanner.nextInt();
	        if (number % 2 != 0)
	        {   
	            for (int i = 0;i < number;i++)
	            System.out.println(array[i]);
	        }
	        else
	        {
	            for (int i = number - 1;i >=0 ;i--)
	            System.out.println(array[i]);
	        }
	    }
	}


