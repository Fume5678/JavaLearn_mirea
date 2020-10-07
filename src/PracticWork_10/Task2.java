package PracticWork_10;

public class Task2 {
    public static int check(int a, int b){
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return check(a, b - 1) + check(a - 1, b - 1);

    }

    public static void main(String[] args) {
        int a = 10, b = 10;
        System.out.println(check(a, b));
    }
}
