class  Main {
    public void moveZeroes(int[] nums) {
        int c=0;
        int n=nums.length;
        //trevarse the array
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[c]=nums[i];
                c++;
            }
        }
        while(c<n){
            nums[c]=0;
            c++;
        }
    }
}