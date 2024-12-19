package Task1;

public class Solve {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 100 ; i++) {
            Elaborate(i);
        }
    }
    public static void Elaborate(int num){
            int sum_dividers = 0;
            for(int j = 1 ; j < num ; j++){
                if (num % j == 0) {
                    sum_dividers += j;
                }
            }
            if(sum_dividers == num){
                System.out.println(num);
            }
        }
    }
