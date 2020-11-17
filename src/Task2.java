import java.lang.*;

public class Task2 {
    public static void outPut(int n){
        if (n == 1){
            System.out.print(1);
            return;
        }
        outPut(n-1);
        System.out.print(n);
    }

    public static void main(String[] args) {
        outPut(24);
    }
}