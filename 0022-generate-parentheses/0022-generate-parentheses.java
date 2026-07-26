class Solution {
    public void solve(List<String> ans, StringBuilder str, int score, int n, int par){
        //base case
        if(str.length()==n*2){
            ans.add(new String(str.toString()));
            return;
        }

        //go left (incr the score by 1)
        if(par<=n){
        str.append('(');
        score++;
        par++;
        solve(ans, str, score, n, par);
        score--;
        par--;
        str.deleteCharAt(str.length()-1);}

        if(score>0){
            str.append(')');
            score--;
            solve(ans, str, score, n, par);
            score++;
        str.deleteCharAt(str.length()-1);
        }
        //go right (only if the score is greater than 0) then dec the score by 1
        return;
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        int score =0;
        solve(ans, str, score, n, 1);
        return ans;
    }
}