package questions.groupanagrams;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        var solution = new Solution();
        String [] words = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = solution.groupAnagrams(words);
        System.out.println(result);
    }
}
