class Solution {

    public void solve(List<String> ans, List<String> req, StringBuilder out, int ind){
        // base case
        if(ind == req.size()){
            ans.add(out.toString());
            return;
        }

        // current index pr req list me jao
        for(int i = 0; i < req.get(ind).length(); i++){

            // ek character select krke add kro...then move on to next string
            out.append(req.get(ind).charAt(i));

            solve(ans, req, out, ind + 1);

            out.deleteCharAt(out.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if(digits.length() == 0){
            return ans;
        }

        String[] maps = {
            "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> req = new ArrayList<>();

        for(int i = 0; i < digits.length(); i++){
            req.add(maps[digits.charAt(i) - '2']);
        }

        solve(ans, req, new StringBuilder(), 0);

        return ans;
    }
}