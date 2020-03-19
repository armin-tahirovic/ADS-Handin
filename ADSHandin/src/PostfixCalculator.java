import list.List;
import stack.IStack;
import stack.Stack;

public class PostfixCalculator {

    private Stack<Integer> stack;

    public PostfixCalculator(Stack<Integer> stack) {
        this.stack = stack;
    }

    public int calculate(String postfix) {
        for(int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if ('0' <= ch && '9' >= ch) {
                stack.push(ch-'0');
            } else {
                switch (ch) {
                    case '+':
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a+b);
                        break;
                    case '-':
                        b = stack.pop();
                        a = stack.pop();
                        stack.push(a-b);
                        break;
                    case '*':
                        b = stack.pop();
                        a = stack.pop();
                        stack.push(a*b);
                        break;
                    case '/':
                        b = stack.pop();
                        a = stack.pop();
                        stack.push(a/b);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
