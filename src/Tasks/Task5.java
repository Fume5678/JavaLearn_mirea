package Tasks;

public class Task5 {
    public static void doTask() {
        int n = 10;
        for (int i = 0; i < n; i++){
            System.out.print("1 ");
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            System.out.print("— ");
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            System.out.print((i + 1) + " ");
        }
    }
}
