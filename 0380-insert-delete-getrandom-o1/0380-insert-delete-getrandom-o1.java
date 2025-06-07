class RandomizedSet {
    Set<Integer> set;
    List<Integer> list;

    public RandomizedSet() {
        set = new HashSet<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (set.add(val)){
            list.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if (set.contains(val)){
            list.remove(Integer.valueOf(val));
            set.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int r=(int) (Math.random()*set.size());      
        return list.get(r);  
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */