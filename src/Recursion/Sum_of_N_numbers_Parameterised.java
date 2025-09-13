package Recursion;

import java.util.Scanner;

public class Sum_of_N_numbers_Parameterised {
    public static void func(int i, int sum) {
        if (i < 1) {
            System.out.println(sum); // print final sum when recursion ends
            return;
        }
        func(i - 1, sum + i); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n, 0); // start with sum = 0
    }
}
