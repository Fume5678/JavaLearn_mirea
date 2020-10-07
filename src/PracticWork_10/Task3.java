package PracticWork_10;

public class Task3 {

    public static void rec(int n){
        int x = n, count = 0;

        if (n < 10){
            System.out.println(n);
            return;
        }
        while(x >= 10) {
            count++;
            x /= 10;
        }

        System.out.print(x + " ");
        n %= Math.pow(10, count);
        rec(n);
    }

    public static void main(String[] args) {
        rec(123);
    }
}
