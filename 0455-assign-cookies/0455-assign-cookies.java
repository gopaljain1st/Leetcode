class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int satisfiedChildren = 0;
        int cookieIndex = 0;
        while (cookieIndex < s.length && satisfiedChildren < g.length) {
            if (s[cookieIndex] >= g[satisfiedChildren]) {
                satisfiedChildren++;
            }
            cookieIndex++;
        }
        return satisfiedChildren;
    }
}