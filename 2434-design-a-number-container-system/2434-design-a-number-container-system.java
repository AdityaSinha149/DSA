class NumberContainers {
    Map<Integer,TreeSet<Integer>> numberMap;
    Map<Integer,Integer> indexMap;

    public NumberContainers() {
        numberMap=new HashMap<>();
        indexMap=new HashMap<>();
    }
    
    public void change(int idx, int number) {
        if(indexMap.containsKey(idx)){
            int oldNum=indexMap.get(idx);
            numberMap.get(oldNum).remove(idx);
            if (numberMap.get(oldNum).isEmpty()) {
                numberMap.remove(oldNum);
            }
        }
        numberMap.putIfAbsent(number, new TreeSet<>());
        numberMap.get(number).add(idx);
        indexMap.put(idx, number);
    }
    
    public int find(int number) {
        if (numberMap.containsKey(number))
            return numberMap.get(number).first();
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */