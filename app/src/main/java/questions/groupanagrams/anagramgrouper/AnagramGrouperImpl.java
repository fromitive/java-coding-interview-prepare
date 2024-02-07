package questions.groupanagrams.anagramgrouper;

import java.util.List;
import java.util.ArrayList;

import questions.groupanagrams.AnagramGrouper;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class AnagramGrouperImpl implements AnagramGrouper{
    private Map<String, List<String>> storage = new HashMap<>();

    private String calculateSortedWord(String word) {
        char [] unsortedCharArray = word.toCharArray();
        Arrays.sort(unsortedCharArray);
        return String.valueOf(unsortedCharArray);
    }

    private boolean isNewGroup(String word) {
        return !storage.containsKey(word);
    }

    @Override
    public void put(String word) {
        String sortedWord = calculateSortedWord(word);
        if(isNewGroup(sortedWord)) {
            storage.put(sortedWord,new ArrayList<String>());
        }
        storage.get(sortedWord).add(word);
    }
    
    @Override
    public List<List<String>> toList() {
        return storage.values().stream().toList();
    }
    
    
}
