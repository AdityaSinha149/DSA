class Solution {
    private boolean check(Map<Character,Integer> map){
        for (Map.Entry<Character, Integer> E : map.entrySet()) {
            if(E.getValue()>1)return false;
        }
        return true;

    }
    public int numKLenSubstrNoRepeats(String s, int k) {
        if(k>s.length())return 0;
        Map<Character,Integer> charToNum=new HashMap<>();
        int count=0;
        for(int i=0;i<k;i++){
            charToNum.putIfAbsent(s.charAt(i), 0);
            charToNum.put(s.charAt(i), charToNum.get(s.charAt(i))+1);
        }
        for(int i=k;i<s.length();i++){
            if(check(charToNum)==true)count++;
            charToNum.putIfAbsent(s.charAt(i), 0);
            charToNum.put(s.charAt(i), charToNum.get(s.charAt(i))+1);
            charToNum.put(s.charAt(i-k), charToNum.get(s.charAt(i-k))-1);
        }
        
        if(check(charToNum)==true)count++;
        return count;
    }
}