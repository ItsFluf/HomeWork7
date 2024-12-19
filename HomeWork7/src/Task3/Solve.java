package Task3;

import java.util.Scanner;

public class Solve {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please give me the number of iterations the function will do on 3 numbers: ");
        int numOfIterations = reader.nextInt();
        System.out.println("Now, please give me num a: ");
        int a = reader.nextInt();
        System.out.println("Now, please give me num b: ");
        int b = reader.nextInt();
        System.out.println("Now, please give me num c: ");
        int c = reader.nextInt();
        musicalChairs(numOfIterations, a, b, c);
    }
    public static void musicalChairs(int iterations, int num_a, int num_b, int num_c) {
        for (int i = 1; i <= iterations; i++) {
            int temp = num_a;
            num_a = num_b;
            num_b = num_c;
            num_c = temp;
        }
        System.out.println("a = " + num_a);
        System.out.println("b = " + num_b);
        System.out.println("c = " + num_c);
    }
}
