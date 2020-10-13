import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Word {
    String target;
    String explain;

    Word() {
        target = "";
        explain = "";
    }

    Word(String target, String explain) {
        this.target = target;
        this.explain = explain;
    }

    public String getTarget() {
        return target;
    }

    public String getExplain() {
        return explain;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
}
