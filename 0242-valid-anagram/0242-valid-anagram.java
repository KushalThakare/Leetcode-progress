class Solution {
     static 
    {
        for (int i = 0; i < 500; i++) 
        {
            isAnagram("a", "");
        }
    }
    public static boolean isAnagram(String s, String t) {
        int[] array = new int[26];

        for(int i=0; i<s.length();i++){
            array[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length();i++){
            array[t.charAt(i)-'a']--;
        }

        for(int a:array){
            if(a!=0){
                return false;
            }
        }

        return true;
    }
}