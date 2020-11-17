import java.lang.*;

public class Task3 {
    public static void fromAtoB(int A, int B){
        if (B == A){
            System.out.print(A);
            return;
        }
        fromAtoB(A, B-1);
        System.out.print(B);
    }
    public static void fromBtoA(int A, int B){
        System.out.print(A);
        if (A == B){
            return;
        }
        fromBtoA(A-1, B);
    }

    public static void main(String[] args) {
        fromAtoB(6, 15);
        System.out.println();
        fromBtoA(15, 6);
    }
}