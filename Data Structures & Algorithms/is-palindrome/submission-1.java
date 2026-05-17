class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().strip().replaceAll("[^a-zA-Z0-9]", "");
        int start = 0;
        int end = s.length()-1;
        while(start <= end){
            // if(s.charAt(start) > 122 || s.charAt(start) < 65){
            //     start++;
            // }
            // if(s.charAt(end) > 122 || s.charAt(end) < 65){
            //     end--;
            // }
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
