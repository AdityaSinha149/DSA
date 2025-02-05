class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int idx1=0,idx2=0;
        int i=0;
        while(i<s1.length() && s1.charAt(i)==s2.charAt(i))i++;
        if(i==s1.length())return true;
        idx1=i;
        i++;
        while(i<s1.length() && s1.charAt(i)==s2.charAt(i))i++;
        if(i==s1.length())return false;
        idx2=i;
        i++;
        while(i<s1.length() && s1.charAt(i)==s2.charAt(i))i++;
        if(i!=s1.length())return false;
        return s1.charAt(idx1)==s2.charAt(idx2) && s1.charAt(idx2)==s2.charAt(idx1);
    }
}

