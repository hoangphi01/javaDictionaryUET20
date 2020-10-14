import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    public int numofwords = 0;
    List<Word> wordList = new ArrayList<Word>();

    Dictionary() {
    }

    public void insert(Word word) {
        wordList.add(word);
    }

    List<Word> getWordList() {
        return wordList;
    }
}
