class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int l =0;
        int r = arr.length-1;

        while(l<r){
            if(arr[l]!=arr[r]){
                char mini = (char) Math.min(arr[l], arr[r]);

                arr[l] = mini;
                arr[r] = mini;
            }

         l++;
         r--;
        }

        return new String(arr);
    }
}