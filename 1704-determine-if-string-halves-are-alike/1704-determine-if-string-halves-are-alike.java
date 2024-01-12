class Solution {
    public boolean halvesAreAlike(String s) {
        int vowelCount =0;
        for(int i=0;i<s.length()/2; i++) {
            if(isVowel(s.charAt(i)))
                vowelCount++;
            if(isVowel(s.charAt(s.length()-1-i)))
                vowelCount--;
        }
        if(vowelCount==0)
            return true;
        else
            return false;
    }
    public boolean isVowel(char c) {
        if (c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' )
            return true;
        return false;
    }
}