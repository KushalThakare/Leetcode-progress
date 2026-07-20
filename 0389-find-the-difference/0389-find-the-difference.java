class Solution {
    public char findTheDifference(String s, String t) {

        int result = 0;
        String ans = s + t;

        for(int i = 0; i<ans.length(); i++){
            result^= ans.charAt(i);
        }

        return (char) result;

    }
}