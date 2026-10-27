class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<>();
        for(String s : strs){
            int[] cnt = new int[26];
            for(int i=0; i< s.length(); i++){
                cnt[s.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(cnt);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(s);

        }

        return new ArrayList<>(result.values());
    }
}
