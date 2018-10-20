package pliki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JavaNio {
    private static final String PATH_TO_FILE = "lorem-ipsum.txt";

    public static void main(String[] args) {

        try {
            List<String> strings = Files.readAllLines(Paths.get(PATH_TO_FILE));
            for (String s : strings) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
