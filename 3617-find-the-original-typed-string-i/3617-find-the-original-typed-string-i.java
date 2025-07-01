class Solution {
    public int possibleStringCount(String word) {
        int sum=1;
        for(int i=0;i<word.length()-1;i++)
            if(word.charAt(i)==word.charAt(i+1))sum++;
        return sum;
    }
}