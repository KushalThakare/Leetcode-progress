class Solution {
    public int strStr(String haystack, String needle) {
        int window = needle.length();

        for(int i = 0; i<=haystack.length()- window; i++){
            if(haystack.substring(i, i+window).equals(needle)){
                return i;
            }
        }

        return -1;
    }
}