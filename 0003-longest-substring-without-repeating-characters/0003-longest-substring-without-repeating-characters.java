class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> characters = new HashSet<>();
        int max = 0, count =0;
        for(int i=0;i<s.length();i++) {
            count = 0;
            int j=i;
            while(j<s.length() && characters.add(s.charAt(j++))) {
                count++;
            }
            characters.clear();
            max = Math.max(max, count);
            if(max == s.length()-i){
                return max;
            }
        }
        return max;
    }
}