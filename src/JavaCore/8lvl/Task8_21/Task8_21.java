package Tasks;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task8_21 {
    
    private static double countOfWhitespace;
    private static double countOfCharacter;
    
    public static void main(String[] args) throws IOException{
        try(FileReader fileReader = new FileReader(args[0])) {
            while(fileReader.ready()) {
                 if(fileReader.read() == 32) 
                 {
                    countOfWhitespace++;
                    countOfCharacter++;
                 }
                else countOfCharacter++;
            }
            double afterDivision = countOfWhitespace / countOfCharacter * 100;
             BigDecimal result = new BigDecimal(afterDivision);
             result = result.setScale(2, RoundingMode.DOWN);
             System.out.println(result);
        }
    }
}
