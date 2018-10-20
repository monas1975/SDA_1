package pliki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {
    private static final String PATH_TO_FILE = "C:\\Users\\monas\\Documents\\SDA_Java\\SDA_1\\lorem-ipsum.txt";

    public static void main(String[] args){

        try(BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_FILE))){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
