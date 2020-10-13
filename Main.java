public class Main {
    public static void main(String[] args) {
        Dictionary bigDict = new Dictionary();

        // DictionaryManagement.insertFromCommandline(bigDict);
        DictionaryCommandline.QuantityofDictionary(bigDict);
        DictionaryCommandline.showAllWords(bigDict);
    }
}
