class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int i=0;
        for(int num:target){
            if(num!=arr[i])return false;
            i++;
        }
        return true;
    }
}