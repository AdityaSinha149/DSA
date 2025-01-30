class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans=new ArrayList<>();
        if(s.length()<=10)return ans;
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(i=0;i<10;i++)
            sb.append(s.charAt(i));
        Map<String,Integer> map=new HashMap<>();
        while(i<s.length()){
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
            sb.append(s.charAt(i));
            sb.delete(0, 1);
            i++;
        }
        map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
        for(String curr:map.keySet())
            if(map.get(curr)>1)
                ans.add(curr);

        return ans;
    }
}