class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') { 
                stk.push(c); 
            }else if (stk.isEmpty()) { 
                ++count; 
            }else { 
                stk.pop(); 
            }
        }
        return count + stk.size();
    }
}