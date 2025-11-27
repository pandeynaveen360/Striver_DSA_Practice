package Stack;

import java.util.Stack;

public class EvaluateInfix {

    public static void main(String[] args) {

        System.out.println(infixExpression("2*(5*(3+6))/5-2"));
    }

    private static int infixExpression(String exp){

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i = 0; i < exp.length(); i++){

            char c = exp.charAt(i);

            if(Character.isDigit(c)){

                operands.push(c - '0');
            }else if(c == '('){
                operators.push(c);
            }else if(c == ')'){
                while(!operators.isEmpty() && operators.peek() != '('){
                    int op1 = operands.pop();
                    int op2 = operands.pop();

                    char operator = operators.pop();
                    int result = performOperation(op1, op2, operator);
                    operands.push(result);
                }
                operators.pop();

            }else if(isOperator(c)){
                while(!operators.isEmpty() && precedence(c) <= precedence(operators.peek())){
                    int op1 = operands.pop();
                    int op2 = operands.pop();

                    char operator = operators.pop();
                    int result = performOperation(op1, op2, operator);
                    operands.push(result);

                }
                operators.push(c);

            }
        }
        while(!operators.isEmpty()){
            int op1 = operands.pop();
            int op2 = operands.pop();

            char operator = operators.pop();
            int result = performOperation(op1, op2, operator);
            operands.push(result);

        }
        return operands.pop();
    }

    public static int performOperation(int op1, int op2, char operator){

            switch (operator) {

                case '+':
                    return op1 + op2;
                case '-':
                    return op1 - op2;
                case '*':
                    return op1 * op2;
                case '/':
                    return op1 / op2;
            }
            return 0;
    }

    public static boolean isOperator(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
            return true;
        }
        return false;
    }

    public static int precedence(char c){

        if(c == '^'){
            return 3;
        }else if(c == '/' || c == '*'){
            return 2;
        }
        else if(c == '+' || c == '-'){
            return 1;
        }
        else{
            return 0;
        }
    }
}
