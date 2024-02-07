package questions.groupanagrams;

import java.util.List;
import java.util.Arrays;
import questions.groupanagrams.anagramgrouper.AnagramGrouperImpl;

public class Solution {
    public List<List<String>> groupAnagrams(String [] words) {
        AnagramGrouper result = new AnagramGrouperImpl();
        Arrays.stream(words).forEach(word -> result.put(word));
        return result.toList();
    }

}
