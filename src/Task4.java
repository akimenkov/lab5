import java.lang.*;

public class Task4 {
    public static void countOfNum(int k, int s){
        int count = 0;
        for (int i = (int) Math.pow(10, k-1); i < Math.pow(10, k); i++){
            if (sumSym(i) == s){
                count++;
            }
        }
        System.out.println(count);
    }
    public static int sumSym(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumSym(n/10);
    }

    public static void main(String[] args) {
        countOfNum(3, 10);
    }
}