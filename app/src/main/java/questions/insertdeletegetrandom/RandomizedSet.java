package questions.insertdeletegetrandom;
// Problem URL : https://leetcode.com/problems/insert-delete-getrandom-o1/description
// collections timecomplexity : https://gist.github.com/mkdika/d6539d2c33ffea4a69b6e37d88ed4b5c
public interface RandomizedSet {
    boolean insert(int val);
    
    boolean remove(int val);
    
    int getRandom();
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */