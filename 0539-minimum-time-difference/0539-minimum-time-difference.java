class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[]mins=new int[timePoints.size()];
        int j=0;
        for(String s:timePoints){
            int h=Integer.parseInt(s.substring(0,s.indexOf(':')));
            int m=Integer.parseInt(s.substring(s.indexOf(':')+1));
            mins[j++]=h*60+m;
        }
        Arrays.sort(mins);
        int minTimeDiff=mins[1]-mins[0];
        for(int i=2;i<mins.length;i++){
            minTimeDiff=Math.min(minTimeDiff,mins[i]-mins[i-1]);
        }
        return Math.min(minTimeDiff,1440-mins[mins.length-1]+mins[0]);
    }
}