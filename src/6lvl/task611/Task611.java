import java.util.Scanner;

public class Task611 {
	public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        multiArray = new int[n][];
        for(int i = 0;i < multiArray.length;i++)
        {
            int m = scanner.nextInt();
            multiArray[i] = new int[m];            
        }         
        for (int i = 0;i < multiArray.length;i++)
        {
            for (int j = 0;j < multiArray[i].length;j++)
            System.out.print(multiArray[i][j]);
            System.out.println();
        }        
    }
}




