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

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i <  wordList.size(); i++) {
            s = s + String.format("%-20s%3s%n", wordList.get(i).getTarget(), wordList.get(i).getExplain());
        }
        return s;
    }
}
