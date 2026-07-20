class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }

        int[] map = new int[27];

        for(int i = 0; i<sentence.length(); i++){
            char curr = sentence.charAt(i);

            map[curr-'a'+1]++;
        }

        for(int i=1; i<map.length; i++){
            if(map[i]==0){
                return false;
            }
        }
        return true;
    }
}