import java.util.Arrays;

public class Task11_12 {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
       String [] array1 = new String [array.length];
       int i = 0, j = 0;
       while (i < array.length) {
           if (array[i] != null) {
               array1[j] = array[i];
               i++;
               j++;
           }
           else i++;
       }
       for (int a = 0; a < array.length; a++)
           array[a] = array1[a];
    }
}

