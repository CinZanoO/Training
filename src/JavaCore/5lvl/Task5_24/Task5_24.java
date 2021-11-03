package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


public class Task5_24 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        
        BigDecimal result = new BigDecimal(1);
        BigDecimal nValue = new BigDecimal(n);
        
        if(n < 0)
            return "0";
        else {
            while(n != 0) {
                result = result.multiply(nValue);
                nValue = new BigDecimal(n-1);
                n--;
            }
        }
        return result.toString();
    }
}
