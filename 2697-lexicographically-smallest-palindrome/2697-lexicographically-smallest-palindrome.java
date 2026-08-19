class Solution {
    public String makeSmallestPalindrome(String s) {
        int last=s.length()-1;
        int start=0;
        char[]arr=s.toCharArray();
        while(start<last){
            if(arr[start]==arr[last]){
                start++;
                last--;
            }
            else if(arr[start]<arr[last]){
              
                arr[last]=arr[start];
                start++;
                last--;
               
            }
            else{
                arr[start]=arr[last];
                  start++;
                last--;

            }
        }

        return new String(arr);
    }
}