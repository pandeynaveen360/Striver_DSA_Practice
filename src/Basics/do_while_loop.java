package Basics;

public class do_while_loop {
    public static void main(String[] args) {
                int i = 0;

                do {
                    System.out.println("Value of i (do-while): " + i);
                    i++;
                } while (i < 3);


                System.out.println("\n--- Demonstrating 'at least once' ---");
                int j = 5;
                do {
                    System.out.println("Value of j (do-while, initial condition false): " + j);
                    j++;
                } while (j < 5);

            }
        }
