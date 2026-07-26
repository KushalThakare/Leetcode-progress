class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                //shift every value left;
                int j =arr.length-1;
                while(j>i){
                    arr[j]=arr[j-1];
                    j--;
                }
                if(i+1 <arr.length){arr[i+1]= 0;}
                i++;
            }
        }
    }
}