class Solution {
    public int smallestNumber(int n, int t) {
     
         int realnumber=n;
       
       while(true){
        int temp=realnumber;
          int product=1;
         while(temp>0){
             int rem=temp%10;
            product=product*rem;
            temp/=10;
         }
            if(product%t==0){
                return realnumber;
            }
            else{
                realnumber++;
            }
 
        }
        
         
        
    }
     
       
    
}