package questions.insertdeletegetrandom.randomizedset;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import questions.insertdeletegetrandom.RandomizedSet;

public class UsingSet implements RandomizedSet{
    private Set<Integer> bucket = new LinkedHashSet<>();
    public UsingSet() {
        
    }
    
    public boolean insert(int val) {
        return bucket.add(val);
    }
    
    public boolean remove(int val) {
        return bucket.remove(val);
    }
    
    public int getRandom() {
        Random random = new Random();
        return (int)bucket.toArray()[random.nextInt(bucket.size())];
    }
}
