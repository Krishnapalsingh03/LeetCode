class Solution {
    public int countOperations(int num1, int num2) {
        int count=0;
      
        while(num1!=0&&num2!=0){
             int diffrence=0;
            if(num1>num2){
                diffrence=num1-num2;
                num1=diffrence;
               
                count++;
            }
            else if(num1==num2){
                 diffrence=num1-num2;
                 num1=diffrence;
                 
                count++;
            }
            else{
                  diffrence=num2-num1;
                 num2=diffrence;
                count++;
            }
        }
        return count;
    }
}