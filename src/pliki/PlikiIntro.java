package pliki;

import java.io.*;
import java.io.FileReader;

public class PlikiIntro {
    private static final String PATH_TO_FILE = "C:\\Users\\monas\\Documents\\SDA_Java\\SDA_1\\lorem-ipsum.txt";

     public static void main(String[] args){

         BufferedReader reader = null;
         FileReader fileReader = null;

         try {
             fileReader = new FileReader(PATH_TO_FILE);
             reader = new BufferedReader(fileReader);
             String line;

             while((line=reader.readLine())!=null){
                 System.out.println(line);
             }

         } catch (IOException e) {
             e.printStackTrace();
         }finally {
             if (reader!=null){
                 try {
                     reader.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
         }

     }
}
