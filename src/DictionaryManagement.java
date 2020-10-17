import java.io.File;
import java.util.List;
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
            String[] arrOfStr = str.split("\t" );
            dictionary.wordList.add(new Word(arrOfStr[0], arrOfStr[1]));
           // System.out.printf("%-20s%3s%n", arrOfStr[0], arrOfStr[1]); //Use this to directly print the text file.

        }


    }

    public static void dictionaryLookup(Dictionary dictionary) {
        List<Word> wordList = dictionary.getWordList();

        System.out.println("Nhập từ cần tra: ");
        Scanner sc = new Scanner(System.in);
        String wordToFind = sc.nextLine();

        for (int i = 0; i < wordList.size(); i++) {
            if (wordToFind.equals(wordList.get(i).getTarget())) {
                System.out.printf("%-20s%3s%n", wordList.get(i).getTarget(), wordList.get(i).getExplain());
            }
        }

    }


}
