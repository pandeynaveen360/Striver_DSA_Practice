package Recursion;

import java.util.Scanner;

import static Recursion.Basics.func;

public class N_times_Name {
    public static void func(int i, int n){
        if(i > n){
            return;
        }
        System.out.println("Naveen pandey");
        func(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(1, n);
    }
}
