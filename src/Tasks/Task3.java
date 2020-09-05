package Tasks;

public class Task3 {
    public static void doTask(){
        int []arr = new int [10];
        int res = 0;

        for (int i = 0; i < 10; i++){
            arr[i] = (int) Math.round(Math.random() * 5);
        }

        for (int i = 0; i < 10; i++){
            System.out.println(arr[i] + " ");
            res += arr[i];
        }

        System.out.println("\n" + res);

    }
}