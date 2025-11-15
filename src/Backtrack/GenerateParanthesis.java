package Backtrack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public List<String> generateParanthesis(int n){

        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String curr, int open, int close, int n){

        if(curr.length() == 2 * n) {
            result.add(curr);
            return;
        }

        if(open < n){
            backtrack(result, curr + "(",open + 1, close, n);
        }

        if(close < open){
            backtrack(result, curr + ")",open ,close + 1, n);
        }
    }
    public static void main(String[] args) {
        GenerateParanthesis GP = new GenerateParanthesis();
        int n = 3;

        List<String> result = GP.generateParanthesis(n);

        System.out.println("All valid parenthesis for n =" + n + ":");
        for(String s : result){
            System.out.println(s);
        }
    }
}
