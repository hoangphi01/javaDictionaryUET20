import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DictionaryCommandline {
    public static void showAllWords(Dictionary dictionary) {
        List<Word> wordList = dictionary.getWordList();

        for (int i = 0; i < wordList.size(); i++) {
            //System.out.println(i+1 + ": " + wordList.get(i).getTarget() + ": " + wordList.get(i).getExplain());
            System.out.printf("%-20s%3s%n", wordList.get(i).getTarget(), wordList.get(i).getExplain());
        }
    }

    public static void QuantityofDictionary(Dictionary dictionary) {
        int numofwords = 0;

        System.out.println("Nhập số lượng từ cần thêm: ");

        Scanner inputqty = new Scanner(System.in);
        numofwords = inputqty.nextInt();
        Word newWord;
        String insertWrd;
        String insertDef;

        inputqty.nextLine();
        for (int i = 0; i < numofwords; i++) {
            System.out.println("Hãy nhập từ: ");
            insertWrd = inputqty.nextLine();
            System.out.println("Hãy nhập giải nghĩa: ");
            insertDef  = inputqty.nextLine();
            newWord = new Word(insertWrd, insertDef);
            dictionary.insert(newWord);
        }
    }

    public static void dictionaryAdvanced(Dictionary dictionary) throws IOException {
        System.out.println("Từ điển Anh-Việt phiên bản 1.2");
        System.out.println("Nhập 1 để thêm nội dung, hiển thị toàn bộ từ điển, viết file databaseOutput.txt và tra từ: ");
        System.out.println("Nhập 2 để tra cứu từ file database.txt: ");
        System.out.println("Nhập 0 dể kết thúc: ");

        Scanner sc = new Scanner(System.in);
        int userSelection = sc.nextInt();

        if (userSelection == 1) {
            QuantityofDictionary(dictionary);
            DictionaryManagement.insertFromFile(dictionary);
            System.out.print(dictionary.toString());
            DictionaryManagement.dictionaryExportToFile(dictionary);
            DictionaryManagement.dictionaryLookup(dictionary);
        }

        else if (userSelection == 2) {
            DictionaryManagement.insertFromFile(dictionary);
            DictionaryManagement.dictionaryLookup(dictionary);
        }

        else if (userSelection == 0) {
            System.exit(0);
        }


    }

    
}
