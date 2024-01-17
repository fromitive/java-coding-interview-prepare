package questions.uniquenumberofoccurrences;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
// https://leetcode.com/problems/unique-number-of-occurrences/description/
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>();

        for(int number : arr){
            count(counter, number);
        }
        
        Set<Integer> uniqueOccurrence = Set.copyOf(counter.values());
        return counter.size() == uniqueOccurrence.size();
    }

    private void count(Map<Integer, Integer> counter, int number) {
        counter.put(number, counter.getOrDefault(number, 0) + 1);
    }
}
