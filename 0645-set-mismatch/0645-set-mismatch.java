class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        int []ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
         for(int index=0;index<nums.length;index++){
           if(nums[index]!=index+1){
            ans[0]=nums[index];
            ans[1]=index+1;
               return ans;
                
           }

    }
    return ans;
    }
}