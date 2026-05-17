class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n = findSum(n);
            if(n == 1){
                return true;
            }
        }
        return false;
    }
    public int findSum(int n){
        int sum = 0;
        for(int i = 1000; i >= 1; i/=10){
            sum += Math.pow(n/i, 2);
            n %= i;
        }
        return sum;
    }
}
