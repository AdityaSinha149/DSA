class Solution {
    public String getHappyString(int n, int k) {
        List<String> list = new ArrayList<>();
        generateHappy(new StringBuilder(), n, list);
        return k <= list.size() ? list.get(k - 1) : "";
    }

    private void generateHappy(StringBuilder sb, int n, List<String> list) {
        if (sb.length() == n) {
            list.add(sb.toString());
            return;
        }

        for (char c : new char[]{'a', 'b', 'c'}) {
            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != c) {
                sb.append(c);
                generateHappy(sb, n, list);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
