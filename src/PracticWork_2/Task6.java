package PracticWork_2;


import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void doTask(){
        int []arr = new int [10];
        int res = 0;

        System.out.println("Сгенеренный массив:");
        for (int i = 0; i < 5; i++){
            arr[i] = (int) Math.round(Math.random() * 5);
            System.out.print(arr[i] + " ");
        }
        for (int i = 5; i < 10; i++){
            arr[i] = new Random(12).nextInt(12);
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nОтсортированный массив:");
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
