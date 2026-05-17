class Solution {
    public int[] plusOne(int[] digits) {
        int[] nextNum = new int[digits.length + 1];
        int carry = 1;
        for(int i = 0; i < digits.length; i++){
            nextNum[i+1] = digits[i];
        }
        for(int i = nextNum.length - 1; i >= 0; i--){
            if(nextNum[i] == 9 && carry == 1){
                nextNum[i] = 0;
                carry = 1;
            } else {
                nextNum[i] += carry;
                carry = 0;
            }
        }
        if(nextNum[0] == 0){
            return Arrays.copyOfRange(nextNum, 1, nextNum.length);
        } else {
            return nextNum;
        }
    }
}
