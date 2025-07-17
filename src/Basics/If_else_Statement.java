package Basics;

import java.util.Scanner;
public class If_else_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println(("it is even number"));
        }
        else{
            System.out.println("not even number");
        }
    }
}
