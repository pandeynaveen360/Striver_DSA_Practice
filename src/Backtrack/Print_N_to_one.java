package Backtrack;

import java.util.Scanner;

public class Print_N_to_one {
    public static void func(int i, int n){
        if(i > n){
            return;
        }
        func(i+1,n);
        System.out.println(i);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(1,n);
    }
}