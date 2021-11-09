package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Task7_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a roman number to be converted to decimal: ");
        String romanString = bufferedReader.readLine();
        System.out.println("Conversion result equals " + romanToInteger(romanString));
    }
    // MMDDCCLLXXVVII
    public static int romanToInteger(String s) {
        
        Integer result = 0;
        HashMap<Integer, Integer> valueOfRomanNumbers = new HashMap<>();
        valueOfRomanNumbers.put(77, 1000); //Value of "M"
        valueOfRomanNumbers.put(68, 500);  //Value of "D"
        valueOfRomanNumbers.put(67, 100);  //Value of "C"
        valueOfRomanNumbers.put(76, 50);   //Value of "L"
        valueOfRomanNumbers.put(88, 10);   //Value of "X"
        valueOfRomanNumbers.put(86, 5);    //Value of "V"
        valueOfRomanNumbers.put(73, 1);    //Value of "I"
        
        byte[] byteSequanceOfGivenString = s.getBytes();
        
        // Comparing nearby numbers value
        
        for (int i = 0; i < byteSequanceOfGivenString.length; i++) {
            if (i == byteSequanceOfGivenString.length - 1) {
                int lastByte = byteSequanceOfGivenString[i];
                
                int lastNumber = valueOfRomanNumbers.get(lastByte);
                
                result += lastNumber;
            }
            else {
                int firstByte = byteSequanceOfGivenString[i];
                int secondByte = byteSequanceOfGivenString[i + 1];
                
                int number = valueOfRomanNumbers.get(firstByte);
                int nextNumber = valueOfRomanNumbers.get(secondByte);
                
                if (number >= nextNumber)
                    result += number;
                else 
                    result -= number;
            }
        }
        return result;
    }
}

