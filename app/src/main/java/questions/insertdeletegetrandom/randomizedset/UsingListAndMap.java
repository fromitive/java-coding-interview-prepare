package questions.insertdeletegetrandom.randomizedset;
import questions.insertdeletegetrandom.RandomizedSet;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Random;

public class UsingListAndMap implements RandomizedSet {
    private List<Integer> bucket = new ArrayList<>();
    private Map<Integer,Integer> map = new LinkedHashMap<>();
    
    @Override
    public int getRandom() {
        Random random = new Random();
        return bucket.get(random.nextInt(bucket.size()));
    }

    @Override
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        bucket.add(val);
        map.put(val,bucket.size() -1);

        return true;
    }

    @Override
    public boolean remove(int val) {
        if(map.containsKey(val) == false){
            return false;
        }

        int bucketLatestIndex = bucket.size() - 1;
        int removedItemIndex = map.get(val);
        int latestItem = bucket.get(bucketLatestIndex);
        
        bucket.set(removedItemIndex, latestItem);
        map.replace(latestItem, removedItemIndex);

        bucket.remove(bucketLatestIndex);
        map.remove(val);
        
        return true;
    }
    
}
