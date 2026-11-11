class Solution {
    public int minTimeToType(String word) {
        int sec =0;

        int curr=0;
        for(char ch : word.toCharArray()){
            int dist = Math.abs(curr - (ch-'a') );
            curr = ch-'a';
            sec += Math.min(dist, 26-dist);
            sec++;
        }

        return sec;
    }
}