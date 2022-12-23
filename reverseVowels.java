class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = s.length() - 1;
        if (s.length() == 0) {
            return "";
        }
        while (i < j) {
            if(isVowel(sb.charAt(i)) && isVowel(sb.charAt(j))){
                sb.setCharAt(i,s.charAt(j));
                sb.setCharAt(j,s.charAt(i));
                i++;
                j--;
            } else if(!isVowel(sb.charAt(i))){
                i++;
            } if(!isVowel(sb.charAt(j))){
                j--;
            }
        }
        return sb.toString();
    }
    public boolean isVowel(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a== 'A' || a== 'E' || a == 'I' || a == 'O' || a == 'U') {
            return true;
        }
        return false;
    }
}
