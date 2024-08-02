class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String word: strs){
            char a[] = word.toCharArray(); 
            Arrays.sort(a);
            String s = new String(a);
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
