class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i = 0, j = letters.length;

        while(i < j){
            int mid = i + (j-i)/2;

            if(letters[mid] > target){
                j = mid;
            }
            else{
                i = mid+1;
            }
        }

        return letters[i % letters.length];
    }
}