class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        int i=0;
        while(i<s.length()-1){
            sum+=Math.abs(s.charAt(i)-s.charAt(i+1));
            i++;
        }
        return sum;
    
    }
}