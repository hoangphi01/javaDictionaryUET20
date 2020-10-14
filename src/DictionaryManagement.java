import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.*;
public class DictionaryManagement {
    public static void insertFromCommandline(Dictionary dictionary) {

    }

    public static void insertFromFile(Dictionary dictionary) throws IOException {
        File file = new File("database.txt");
        BufferedReader buffRead = new BufferedReader(new FileReader(file));

        String str;
        while ((str = buffRead.readLine()) != null) {
            System.out.println(str);
        }
    }

}
