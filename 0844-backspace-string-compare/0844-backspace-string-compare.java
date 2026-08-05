class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> a = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!a.empty())
                    a.pop();
            } else {
                a.push(c);
            }
        }

        Stack<Character> b = new Stack<>();
        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!b.empty())
                    b.pop();
            } else {
                b.push(c);
            }
        }

        return a.equals(b);
    }
}