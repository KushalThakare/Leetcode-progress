class Solution {
    public int maxArea(int[] height) {
        int ans =0;
        int i=0, j = height.length-1;

        while(i<j){
            //agar ans se bada area ho to
            if((j-i)*Math.min(height[i],height[j])>ans){
                ans = (j-i)*Math.min(height[i], height[j]);
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }


        return ans;
    }
}