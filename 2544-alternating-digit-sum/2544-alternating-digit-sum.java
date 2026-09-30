class Solution {
    public int alternateDigitSum(int n) {
       
        int sum=0;
         String str = String.valueOf(n);
        
       for(int i=0;i<str.length();i++){
            int num=str.charAt(i)-'0';
         
            if(i%2==0){
                sum+=num;
            }
            else{
                        
            sum-=num;
            }
           
        }
        return sum;
    }
}