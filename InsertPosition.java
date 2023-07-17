class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,mid,ans=1,n=nums.length-1;
        while (low<=n){
            //cal mid index
            mid=low+(n-low)/2;
            //find the  mid equal to target
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target)
            {
                low=mid+1;
                ans=mid+1;          
            }
            else
            {
                ans=mid;
                n=mid-1;
            }
        }
        return ans;
    }
}