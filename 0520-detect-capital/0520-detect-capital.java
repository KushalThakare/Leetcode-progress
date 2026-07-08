class Solution {
    public boolean detectCapitalUse(String word) {
        int capc =0;
        for(int i=0; i<word.length();i++){
            char a = word.charAt(i);
            if(a>='A' && a<='Z'){
                capc++;
            }
        }

        if(word.length()==capc||capc==0||(capc==1&&(word.charAt(0)>='A'&&word.charAt(0)<='Z'))){
            return true;
        }

        return false;
    }
}