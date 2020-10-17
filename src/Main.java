import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Dictionary bigDict = new Dictionary();

         //DictionaryManagement.insertFromCommandline(bigDict);
        //DictionaryCommandline.QuantityofDictionary(bigDict);

        //DictionaryManagement.insertFromFile(bigDict);

      // DictionaryCommandline.showAllWords(bigDict);

       // System.out.print(bigDict.toString());
       // DictionaryManagement.dictionaryLookup(bigDict);
        DictionaryCommandline.dictionaryAdvanced(bigDict);

    }
}
