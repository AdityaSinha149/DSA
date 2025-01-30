class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<List<Integer>> oSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            oSet.add(Arrays.asList(obstacle[0], obstacle[1]));
        }
        int dir=0;
        int i=0;
        int j=0;
        int max=0;

        for(int c:commands){
            if(c==-2){
                dir=(dir+1)%4;
            }
            else if(c==-1){
                dir=(dir-1);
                if(dir<0)dir=4+dir;
            }
            else{
                while(c>0){
                    if(dir==0){
                        if(oSet.contains(Arrays.asList(i, j+1)))break;
                        j++;
                    }
                    if(dir==1){
                        if(oSet.contains(Arrays.asList(i-1, j)))break;
                        i--;
                    }
                    if(dir==2){
                        if(oSet.contains(Arrays.asList(i, j-1)))break;
                        j--;
                    }
                    if(dir==3){
                        if(oSet.contains(Arrays.asList(i+1, j)))break;
                        i++;
                    }
                    c--;
                }
                max=Math.max(max,i*i+j*j);
            }
        }
        return max;
    }
}