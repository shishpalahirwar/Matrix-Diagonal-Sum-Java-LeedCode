class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        int n=nums.length;
        //trevarse the array
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[c++]=nums[i];
            }
        }
        while(c<n){
            nums[c++]=0;
        }
    }
}