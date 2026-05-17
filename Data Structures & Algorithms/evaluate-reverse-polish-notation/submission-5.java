class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> operators = Set.of("+","-","*", "/");
        for(String s: tokens){
            if(!operators.contains(s)){
                stack.push(Integer.parseInt(s));
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                if(s.equals("+")){
                    stack.push(num1+num2);
                } else if(s.equals("-")){
                    stack.push(num1-num2);
                } else if(s.equals("*")){
                    stack.push(num1*num2);
                } else {
                    stack.push(num1/num2);
                }
            }
        }
        return stack.peek();
    }
}
