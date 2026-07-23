class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        int i=0;
        while(i<operations.length){
            if(operations[i].equals("--X")||operations[i].equals("X--")){
                ans-=1;
            }
            else{
                ans+=1;
            }
            i++;
        }
        return ans;
        
    }
}