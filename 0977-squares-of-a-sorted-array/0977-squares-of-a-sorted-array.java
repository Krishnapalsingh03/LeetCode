class Solution {
    public int[] sortedSquares(int[] nums) {
        int []newarray= new int[nums.length];
        
        for(int i =0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
         newarray[i]=nums[i];
        
            
        }  
         Arrays.sort(newarray);

            
        
         return newarray;

        }
       
    }
