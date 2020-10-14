import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class DictionaryCommandline {
    public static void showAllWords(Dictionary dictionary) {
        List<Word> wordList = dictionary.getWordList();

        for (int i = 0; i < wordList.size(); i++) {
            System.out.println(i+1 + ": " + wordList.get(i).getTarget() + ": " + wordList.get(i).getExplain());
        }
    }

    public static void QuantityofDictionary(Dictionary dictionary) {
        int numofwords = 0;

        System.out.println("Từ điển Anh-Việt phiên bản 1.0");
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
}
