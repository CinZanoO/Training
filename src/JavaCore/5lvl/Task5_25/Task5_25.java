package Tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Task5_25 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        while(true) {
                
            String data = reader.readLine();
                
            if (data.equals("exit"))
                break;
            
            try 
            {
                if (!Pattern.matches("[a-zA-Z]+", data) && data.contains(".")) 
                    print(Double.parseDouble(data));
                else if(!Pattern.matches("[a-zA-Z]+", data) && Integer.parseInt(data) > 0 && Integer.parseInt(data) < 128)
                    print(Short.parseShort(data));
                else if(!Pattern.matches("[a-zA-Z]+", data) && Integer.parseInt(data) <= 0 || Integer.parseInt(data) >= 128)
                    print(Integer.parseInt(data));
                else    
                    print(data);
            } catch (NumberFormatException e) {
                        print(data);
            }
        }
    
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

