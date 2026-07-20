class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }

        String ans ="";

        for(int i=0; i<sentence.length(); i++){
            if(ans.indexOf(sentence.charAt(i))==-1){
                ans = ans+sentence.charAt(i);
            }
        }

        return ans.length()==26;

        
    }
}