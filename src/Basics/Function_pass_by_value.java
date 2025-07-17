package Basics;

public class Function_pass_by_value {
        public static void main(String[] args) {
            int x = 10;
            System.out.println("Before method call: x = " + x); // Output: Before method call: x = 10

            changePrimitive(x); // Pass the value of x
            System.out.println("After method call: x = " + x);  // Output: After method call: x = 10 (x remains unchanged)
        }

        public static void changePrimitive(int num) {
            System.out.println("Inside method (before change): num = " + num); // Output: Inside method (before change): num = 10
            num = 20; // Modifying the COPY of x (which is 'num')
            System.out.println("Inside method (after change): num = " + num);  // Output: Inside method (after change): num = 20
        }
    }

