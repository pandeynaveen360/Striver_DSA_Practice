package Basics;

import java.util.Scanner;
public class Input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int a = sc.nextInt();
        System.out.println("enter your name");
        String str = sc.next();

        System.out.println("the name is:" +str+ " and the age is " +a);
    }
}
