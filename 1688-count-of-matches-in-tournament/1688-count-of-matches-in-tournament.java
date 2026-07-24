class Solution {
    public int numberOfMatches(int n) {
     
        int sum=0;
        while(n>1){
              if(n%2==0){
                 int match=n/2;
        int teamadvance=n/2;
                n=teamadvance;
                 sum+=match;

              }
            else{
                 int match=(n-1)/2;
        int teamadvance=(n-1)/2+1;
        n=teamadvance;
         sum+=match;
            }
           
        }
        return sum;

    }
}