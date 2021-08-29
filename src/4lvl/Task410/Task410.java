import java.util.Scanner;

public class Task410 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = scanner.nextInt();
		int sMin = scanner.nextInt();
		if (min > sMin)
		{
			int tmp = min; 
			min = sMin;
			sMin = tmp;
		}
		while (scanner.hasNextInt())
		{
			int x = scanner.nextInt();
			if (x > min && x < sMin)
			{
				sMin = x;
			}
			else if (x < min)
			{
				int tmp = min;
				min = x;
				sMin = tmp;
			}
			else if (x > sMin && sMin == min)
			{
				sMin = x;
			}
		}
		System.out.println(sMin);
	}
}