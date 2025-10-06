package String;

public class RemoveOutermostParentheses {

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0; // keeps track of depth

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) {
                    result.append(c); // keep if not the outermost
                }
                balance++;
            } else {
                balance--;
                if (balance > 0) {
                    result.append(c); // keep if not the outermost
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s)); // Output: ()()()
    }
}
