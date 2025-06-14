class Solution {
    public int minMaxDifference(int num) {
        int order = 100_000_000;
        while(num/order == 0)
            order /= 10;
        int replaceForMin = num/order, replaceForMax, min, max;
        replaceForMax = replaceForMin;
        min = max = 0;


        while(order > 0) {
            int cur = num / order;
            num %= order;
            order /= 10;


            min *= 10;
            if(cur != replaceForMin)
                min += cur;

            max *= 10;
            if(cur == replaceForMax || replaceForMax == 9) {
                replaceForMax = cur;
                max += 9;
            } else {
                max += cur;
            }
        }

        return max - min;
    }
}