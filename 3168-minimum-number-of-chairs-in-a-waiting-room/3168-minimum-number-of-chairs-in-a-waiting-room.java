class Solution {
    public int minimumChairs(String s) {
        int count=0;
        int chaircount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                count++;
               
            }
            else{
                count--;
                 
            }
             chaircount = Math.max(chaircount, count);

        }
        return  chaircount;
    }
}