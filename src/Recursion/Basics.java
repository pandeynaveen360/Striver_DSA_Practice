package Recursion;

public class Basics {
    public static void func(int count){
        if(count == 5){
            return; // base case
        }
        System.out.println(count);
        func(count + 1); // recursive call with updated value
    }

    public static void main(String[] args) {
        func(0); // start recursion with count = 0
    }
}
