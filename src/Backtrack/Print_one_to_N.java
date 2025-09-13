package Backtrack;

import java.util.Scanner;

public class Print_one_to_N {
    public static void func(int i, int n) {
        if(i < 1){
            return;
        }
        func(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n, n);

    }
}