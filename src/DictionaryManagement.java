import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.io.FileWriter;

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

    public static void dictionaryExportToFile(Dictionary dictionary) throws IOException {
        List<Word> wordList = dictionary.getWordList();

        FileWriter writer = new FileWriter("databaseOutput.txt");
        int size = dictionary.wordList.size();
        for (int i=0;i<size;i++) {
            String str1 = wordList.get(i).getTarget().toString();
            String str2 = wordList.get(i).getExplain().toString();
            writer.write(str1);
            writer.write("\t");
            writer.write(str2);
            if(i < size-1);//This prevent creating a blank like at the end of the file**
            writer.write("\n");
        }
        writer.close();
    }


}
