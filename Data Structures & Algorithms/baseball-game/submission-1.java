class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String s : operations){
            switch(s){
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    int c = a+b;
                    stack.push(b);
                    stack.push(a);
                    stack.push(c);
                break;
                case "D":
                    int d = stack.peek();
                    stack.push(2 * d);
                break;
                case "C":
                    stack.pop();
                break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }
        int score = 0;
        while(stack.size() > 0){
            score += stack.pop();
        }
        return score;
    }
}