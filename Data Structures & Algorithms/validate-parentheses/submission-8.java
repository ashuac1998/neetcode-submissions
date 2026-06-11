class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character str : s.toCharArray()){
            switch(str){
                case ')':
                    if(stack.size() > 0 && stack.peek() != '('){
                        return false;
                    }else if(stack.size() > 0){
                        stack.pop();
                    } else {
                        return false;
                    }
                        
                break;
                case '}':
                    if(stack.size() > 0 && stack.peek() != '{'){
                        return false;
                    }else if(stack.size() > 0){
                        stack.pop();
                    } else {
                        return false;
                    }
                break;
                case ']':
                    if(stack.size() > 0 && stack.peek() != '['){
                        return false;
                    }else if(stack.size() > 0){
                        stack.pop();
                    } else {
                        return false;
                    }
                break;
                default:
                    stack.push(str);
                break;
            }
        }
        return stack.size() == 0;
    }

}
