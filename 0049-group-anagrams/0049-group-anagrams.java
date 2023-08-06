class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> data = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            data.computeIfAbsent(Arrays.toString(getOccurrence(strs[i])),s-> new ArrayList<>()).add(strs[i]);
        }
        data.forEach((k,v) -> ans.add(v));
        return ans;
     }
     public int[] getOccurrence(String s) {
         int[] arr = new int[26];
         for(int i=0;i<s.length();i++) {
             arr[s.charAt(i) - 'a']++;
         }
         return arr;
     }
}