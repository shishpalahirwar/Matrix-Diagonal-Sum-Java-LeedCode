class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0,rigth =1;
        int result=0;
        while(rigth<n){
            //diff left to right check equal 1
            int diff=nums[rigth]-nums[left];
            if(diff==1){
                result=Math.max(result,rigth-left+1);
            }
            if(diff<=1){
                rigth++;
            }else{
                left++;
            }
        }
        return result;
        
    }
}