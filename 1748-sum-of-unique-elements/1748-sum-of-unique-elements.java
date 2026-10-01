class Solution {
    public int sumOfUnique(int[] nums) {
     int sum=0;
     HashMap<Integer,Integer>map=new HashMap<>();
    
     for(int i=0;i<nums.length;i++){
        int n=nums[i];
       map.put(n,map.getOrDefault(n,0)+1);
            
            
        }
        for(int j=0;j<nums.length;j++){
            int m=nums[j];
            if(map.get(m)==1){
                sum+=nums[j];
            }
        }
        
     
     return sum;
        
    }
}