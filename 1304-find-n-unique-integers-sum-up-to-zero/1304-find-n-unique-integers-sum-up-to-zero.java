class Solution {
    public int[] sumZero(int n) {
        int []arr=new int[n];
        int sum=1;
        int index=0;
        while(index<n-1){
            arr[index]=sum;
            index++;
           arr[index]=-sum;
           index++;
           sum++;
            
        }
        if(n%2!=0){
            arr[index]=0;
        }
        Arrays.sort(arr);

        return arr;
    }
}