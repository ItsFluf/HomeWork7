package Task2;

import java.util.Scanner;

public class Solve {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please give me a numbers that will serve as the amount of numbers you'll have to give me: ");
        int numOfNumbers = reader.nextInt();
        System.out.println("Now, give me " + numOfNumbers + " numbers: ");
        for(int i = 1 ; i <= numOfNumbers ; i++){
            int num = reader.nextInt();
            dashPrinter(num);
            System.out.println();
        }
    }
    public static void dashPrinter(int num){
        int cnt = 0;
        int i = num;
        while(i > 0){
            cnt++;
            i /= 10;
        }
        for(int j  = 1 ; j <= cnt ; j++){
            System.out.print("-");
        }
    }
}
