import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Dictionary bigDict = new Dictionary();

        // DictionaryManagement.insertFromCommandline(bigDict);
        //DictionaryCommandline.QuantityofDictionary(bigDict);
        //DictionaryCommandline.showAllWords(bigDict);
        DictionaryManagement.insertFromFile(bigDict);
    }
}
