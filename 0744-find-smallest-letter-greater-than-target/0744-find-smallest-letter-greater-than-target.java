class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return (char) Arrays.toString(letters).chars().filter(c-> c > target).findFirst().orElse(letters[0]);
    }
}