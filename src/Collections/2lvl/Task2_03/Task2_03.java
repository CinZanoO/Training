package Tasks;


import java.io.*;

public class Task2_03 {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
            StringWriter stringWriter = new StringWriter();
            if(is != null) {
                try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) 
                {
                    String text = "";
                    while((text = bufferedReader.readLine()) != null) 
                        stringWriter.write(text);
                }
            }
            return stringWriter;
    }
}

