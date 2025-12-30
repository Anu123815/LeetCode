class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        String result = "";
        int resultLength = 0;
        for(int i=0; i<s.length(); i++){
            int left = i;
            int right =i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1>resultLength){
                    result = s.substring(left, right+1);
                    resultLength=right-left+1;
                }
                left--;
                right++;
            }
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1>resultLength){
                    result = s.substring(left, right+1);
                    resultLength=right-left+1;
                }
                left--;
                right++;
            }
        }
        return result;
    }
}