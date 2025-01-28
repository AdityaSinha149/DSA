class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        ArrayList<String> words=new ArrayList();
        ArrayList<Integer> count=new ArrayList();
        ArrayList<String> ban=new ArrayList<>(Arrays.asList(banned));
        for(String word :paragraph.split("\\W+")){
            word=word.toLowerCase();
            if(!ban.contains(word)){
                if(!words.contains(word)){
                    words.add(word);
                    count.add(1);
                }
                else{
                    count.set(words.indexOf(word),count.get(words.indexOf(word))+1);
                }
            }
        }
        int maxIndex = count.indexOf(Collections.max(count));
        return words.get(maxIndex);
    }
}