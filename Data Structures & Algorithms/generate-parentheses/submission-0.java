class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateString(n, "(", result);
        return result;
    }
    public void generateString(int n, String s, List<String> result){
        if(s.length() == 2*n){
            if(validateString(s)){
                result.add(s);
            }
            return;
        }
        generateString(n, s+"(", result);
        generateString(n, s+")", result);
    }
    public boolean validateString(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            } else if(stack.size() > 0 && c == ')') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
