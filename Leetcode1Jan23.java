class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> patternWords = new HashMap(pattern.length());
        String[] words = s.split(" ");
        int i = 0;
        if(words.length != pattern.length())
            return false;
        for (String word : words) {
            if (!patternWords.containsKey(pattern.charAt(i)) && !patternWords.containsValue(word))
                patternWords.put(pattern.charAt(i), word);
            i++;
        }
        for (i = 0; i < pattern.length(); i++) {
            if (!words[i].equals(patternWords.get(pattern.charAt(i))))
                return false;
        }
        return true;
    }
}
