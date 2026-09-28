class Solution {
    public int maxDepth(String s) {
        int i=0;
        int count=0;
        int maxdepth=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                count++;
                if(count>maxdepth){
                    maxdepth=count;
                }
            }
            else if(s.charAt(i)==')') {
            count--;
            }

            i++;

        }
        return maxdepth;
    }
}