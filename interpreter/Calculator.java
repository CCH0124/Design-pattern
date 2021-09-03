package interpreter;

import java.util.*;
public class Calculator {
    private Expression expression;
    
    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<>();
        char[] charArr = expStr.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArr.length; i++) {
            switch(charArr[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArr[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArr[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArr[i])));
                    break;
            }
        }

        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var); 
    }
}
