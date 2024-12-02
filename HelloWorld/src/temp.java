import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        // write code that add the first n numbers and prints the result
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
           sum += i;
        }

        System.out.println(sum);
    }
}
