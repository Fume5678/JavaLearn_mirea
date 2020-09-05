package Tasks;

public class Task3 {
    public static void doTask(){
        int []arr = new int [10];
        int res = 0;

        for (int i = 0; i < 10; i++){
            arr[i] = (int) Math.round(Math.random() * 5);
        }

        System.out.println("Сгенеренный массив:");
        int i = 0;
        do {
            System.out.println(arr[i] + " ");
            res += arr[i];
            i++;
        } while (i < 10);
        System.out.println("Сумма:");
        System.out.println(res);

    }
}