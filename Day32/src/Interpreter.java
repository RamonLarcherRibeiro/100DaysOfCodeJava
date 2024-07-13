import java.util.Stack;
import classes.*;
public class Interpreter {
    public static void main(String[] args) {
        String expression = "7 3 - 2 +";
        System.out.println("Result: " + interpret(expression));
    }

    public static int interpret(String expression) {
        Stack<Expression> stack = new Stack<>();

        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = getOperatorInstance(token, leftExpression, rightExpression);
                int result = operator.interpret();
                stack.push(new NumberExpression(result));
            } else {
                Expression numberExpression = new NumberExpression(Integer.parseInt(token));
                stack.push(numberExpression);
            }
        }

        return stack.pop().interpret();
    }

    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-");
    }

    public static Expression getOperatorInstance(String operator, Expression left, Expression right) {
        switch (operator) {
            case "+":
                return new AddExpression(left, right);
            case "-":
                return new SubtractExpression(left, right);
        }
        return null;
    }
}
