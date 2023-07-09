class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length-1;
        boolean incr = true;
        boolean  dec = true;
        for(int i=0 ; i<n; i++){
            if(nums[i]>nums[i+1]){
                incr=false;
            }
            if(nums[i]<nums[i+1]){
                dec=false;
            }
            
        }return incr || dec;
        
    }
}