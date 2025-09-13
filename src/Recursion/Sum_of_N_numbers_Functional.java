package Recursion;

import java.util.Scanner;

public class Sum_of_N_numbers_Functional {
    public static int func(int n){
        if(n == 0){
            return 0;
        }
        return n + func(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
        System.out.println(func(n));
    }
}
