class Solution {
    public String getHappyString(int n, int k) {
        List<String> list = new ArrayList<>();
        generateHappy(new StringBuilder(), n,k, list);
        return k <= list.size() ? list.get(k - 1) : "";
    }

    private void generateHappy(StringBuilder sb, int n,int k, List<String> list) {
        if(list.size()==k)return;
        if (sb.length() == n) {
            list.add(sb.toString());
            return;
        }

        for (char c : new char[]{'a', 'b', 'c'}) {
            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != c) {
                sb.append(c);
                generateHappy(sb, n,k, list);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
