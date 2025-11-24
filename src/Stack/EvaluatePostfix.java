package Stack;

import java.util.Stack;

public class EvaluatePostfix {

    public static void main(String[] args) {

        System.out.println(evaluateExpresson("34+2*"));
    }

    private static int evaluateExpresson(String exp){

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < exp.length(); i++){

            char c = exp.charAt(i);

            if(Character.isDigit(c)){
                stack.push(c - '0');
            }
            else{

                int op2 = stack.pop();
                int op1 = stack.pop();

                switch (c){

                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op1 / op2);
                        break;
                }
            }
        }
        return stack.pop();
    }

}
