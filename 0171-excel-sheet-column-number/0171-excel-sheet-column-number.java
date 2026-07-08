class Solution {
    public int titleToNumber(String columnTitle) {

        int ans=0;

        for(int i=0; i<columnTitle.length();i++){
            char c = columnTitle.charAt(i);
            int temp = (int)(c-64);
            ans = ans*26 +temp;
        }
        return ans;
    }
}