class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String> >map=new HashMap();
        for(String s:strs)
        {
             int[] frequency=new int[26];
        for(int i=0;i<s.length();i++)
        {
            frequency[s.charAt(i)-'a']++;
        }
        String key=Arrays.toString(frequency);
         map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
         return new ArrayList<>(map.values());
         
        
    }
    
}
