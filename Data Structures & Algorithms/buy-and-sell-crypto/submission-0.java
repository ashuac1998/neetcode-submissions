class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            if(stack.size() == 0){
                stack.push(prices[i]);
            }
            // while(stack.size() > 0 && prices[i] <= stack.peek()){
            //     stack.pop();
            // }
            if(stack.peek() < prices[i]){
                max = Math.max(max, prices[i]-stack.peek());
                continue;
            }
            stack.push(prices[i]);
        }
        return max;
    }
}
