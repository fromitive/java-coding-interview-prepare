package questions.groupanagrams;

import java.util.List;

public interface AnagramGrouper {
    void put(String word);
    List<List<String>> toList();
}
