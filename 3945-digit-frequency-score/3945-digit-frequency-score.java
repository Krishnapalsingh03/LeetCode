class Solution {
    public int digitFrequencyScore(int n) {
        int count[]=new int[10];
        int sum=0;
        while(n!=0){
            int rem=n%10;
            count[rem]++;
           n=n/10;
        }
        for(int i=0;i<count.length;i++){
            int countnumber=count[i]*i;
            sum+=countnumber;
        }
        return sum;
    }
}