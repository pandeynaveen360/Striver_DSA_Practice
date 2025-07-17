package Basics;

public class While_loop {
    public static void main(String[] args) {

        int count = 0;

        while (count < 5) {
            System.out.println("Current count: " + count);
            count++;
        }

        System.out.println("Loop finished. Final count: " + count);
    }
}
