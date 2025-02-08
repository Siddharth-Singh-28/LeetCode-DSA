class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s: tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                int result = performOperation(a, b, s);
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }
    public int performOperation(int b, int a, String op){
        return switch(op){
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Invalid operator: " + op);
        };
    }
}