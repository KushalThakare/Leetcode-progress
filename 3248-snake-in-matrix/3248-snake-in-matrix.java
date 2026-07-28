class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans =0;
        for(String s: commands){
            //down
            if(s.charAt(0)=='D'){
                ans+=n;
            }
            //up
            else if(s.charAt(0)=='U'){
                ans-=n;
            }
            //left
            else if(s.charAt(0)=='L'){
                ans-=1;
            }
            //right
            else{
                ans+=1;
            }
        }
        return ans;
    }
}