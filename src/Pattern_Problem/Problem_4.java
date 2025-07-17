package Pattern_Problem;

// 1
// 22
// 333
// 4444
// 55555

public class Problem_4 {
    public static void main(String[] args) {
        int row = 5;
        for(int i = 1; i <= row; i++) {
            for(int j = 1 ;j<= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

