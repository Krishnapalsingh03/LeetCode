class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if((i<nums.length-1 && nums[i]==nums[i+1])||(i>0 && nums[i]==nums[i-1])){
              
            }
            else{
                return nums[i];
            }
         
        }
        return -1;
    }
}