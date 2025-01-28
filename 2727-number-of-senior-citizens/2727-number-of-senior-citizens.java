class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            String age = detail.substring(11, 13);
            int age_num = Integer.parseInt(age);
            if (age_num > 60) count++;
        }
        return count;
    }
}
