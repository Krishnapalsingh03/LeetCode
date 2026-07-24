class Solution {
    public int findPermutationDifference(String s, String t) {
        int finalans=0;
       
        for(int i=0;i<s.length();i++){
             int diffrence=0;
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    diffrence+= Math.abs(i-j);
                    break;
                }
            }
                finalans+=diffrence;
               

            
        }
        return finalans;
    }
}