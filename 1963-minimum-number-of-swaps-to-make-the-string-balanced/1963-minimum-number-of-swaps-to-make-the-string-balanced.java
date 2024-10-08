class Solution {
    public int minSwaps(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stk.isEmpty() && c == ']') {
                stk.pop();
            }else if (c == '[') {
                stk.push(c);
            }
        }
        return (stk.size() + 1) / 2;
    }
}