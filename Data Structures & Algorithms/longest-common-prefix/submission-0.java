class Solution {
    public String longestCommonPrefix(String[] strs) {
        String smallestString = "";
        int smallestStringLength = Integer.MAX_VALUE;
        for(String s : strs){
            if(s.length() < smallestStringLength){
                smallestStringLength = s.length();
                smallestString = s;
            }
        }
        int i = 0;
        String result = "";
        boolean check = true;
        while(check && smallestStringLength > i){
            
            for(String s : strs){
                if(smallestString.charAt(i) != s.charAt(i)){
                    check = false;
                    break;
                }
            }
            if(check)result += smallestString.charAt(i);
            i++;
        }
        return result;
    }
}