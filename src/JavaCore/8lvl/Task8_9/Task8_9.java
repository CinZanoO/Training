package Tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Task8_9 {
	public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String soureceFileName = reader.readLine();
        String purposeFileName = reader.readLine();
        
        try(FileInputStream sourceStream = new FileInputStream(soureceFileName);
            FileOutputStream purposeStream = new FileOutputStream(purposeFileName)) 
            {
                ArrayList<Integer> sourseList = new ArrayList<>();
                
                while(sourceStream.available() > 0) 
                    sourseList.add(sourceStream.read());
                    
                Collections.reverse(sourseList);
                
                for (Integer aByte : sourseList) {
                purposeStream.write(aByte);
                } 
            }
    }
}

