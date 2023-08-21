class Solution {
    public int lengthOfLongestSubstring(String s) {
        LinkedHashSet<Character> characters = new LinkedHashSet<>();
        int max = 0, count =0;
        for(int i=0;i<s.length();i++) {
            while(i<s.length() && characters.add(s.charAt(i++))) {
                count++;
            }
            max = Math.max(max, count);
            for (Iterator<Character> it = characters.iterator(); it.hasNext(); ) {
                Character c = it.next();
                it.remove();
                count--;
                if(c==s.charAt(i-1)) {
                    break;
                }
            }
            if (i<s.length()) {
             i-=2;
            }
        }
        return max;
    }
}