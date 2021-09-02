import java.util.Scanner;

public class Task903 {

	public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length - 1; i++) {
            int number = Math.min(ints[i], ints[i+1]);
            if (number < minNumber)
            minNumber = number;
        }
        return minNumber;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int [] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++)
        intArray[i] = scanner.nextInt();
        return intArray;
    }
}

