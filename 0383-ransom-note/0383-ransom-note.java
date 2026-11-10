class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> rans = new HashMap<>();
        for(char ch: ransomNote.toCharArray()){
            if(rans.containsKey(ch)){
                rans.put(ch, rans.get(ch)+1);
            }
            else{
                rans.put(ch, 1);
            }
        }

        for(char ch: magazine.toCharArray()){
            if(rans.containsKey(ch)){
                rans.put(ch, rans.get(ch)-1);
            }
        }

        for(int i: rans.values()){
            if(i>0){
                return false;
            }
        }

        return true;
    }
}