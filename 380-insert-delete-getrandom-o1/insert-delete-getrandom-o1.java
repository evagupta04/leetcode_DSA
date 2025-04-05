class RandomizedSet {
    List<Integer> list;
    Map<Integer, Integer> map;
    Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        list.add(val);
        //list.size -1 because, index starts from 0, not 1
        map.put(val, list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        //we are just relacing REMOVAL elemnt with last element, 
        //and updating LAST element's index(with REMOVAL element's index)
        //then we are revoing REMOVAL element(VAL) from map and list
        //logic: because elements index doen't matter(not sure about it)
        int indexToRemove = map.get(val);
        int lastElement = list.get(list.size()-1);
        
        list.set(indexToRemove, lastElement);
        map.put(lastElement, indexToRemove);

        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */