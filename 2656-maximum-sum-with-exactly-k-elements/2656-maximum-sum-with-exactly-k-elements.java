class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum=0;
        int j=0;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

       while(j<k){
         

            sum+=max;
            max=max+1;
            
            j++;
        }
        return sum;
    }
}