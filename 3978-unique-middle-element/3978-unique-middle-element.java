class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer,Integer>map =new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            map.put(n, map.getOrDefault(n,0)+1);
        }
        for(int j=0;j<nums.length;j++){
            int m=nums[j];
            int mid=nums.length/2;
            if(map.get(nums[mid])==1){
                return true;
            }
        }
        return false;
    }
}