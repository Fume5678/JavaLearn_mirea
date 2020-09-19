package PracticWork_1.Tasks;

public class Task5 {
    public static void doTask() {
        System.out.println("Гармоничный ряд:");
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(String.format("%.2f", 1/(float)i));
        }
    }
}
