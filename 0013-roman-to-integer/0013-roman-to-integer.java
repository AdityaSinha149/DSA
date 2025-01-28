class Solution {
    static Map<Character, int[]> romanMap = new HashMap<>();
    static{

        romanMap.put('I', new int[]{1, 1});
        romanMap.put('V', new int[]{2, 5});
        romanMap.put('X', new int[]{3, 10});
        romanMap.put('L', new int[]{4, 50});
        romanMap.put('C', new int[]{5, 100});
        romanMap.put('D', new int[]{6, 500});
        romanMap.put('M', new int[]{7, 1000});
    }
    public int romanToInt(String s) {
        int[] first=romanMap.get(s.charAt(s.length()-1));
        int val=first[1];
        int prevPrior=first[0];
        for(int i=s.length()-2;i>=0;i--){
            int[] curr=romanMap.get(s.charAt(i));
            if(curr[0]>=prevPrior)val+=curr[1];
            else val-=curr[1];
            prevPrior=curr[0];
        }
        return val;
    }
}