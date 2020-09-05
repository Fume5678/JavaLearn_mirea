package Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task6 {
    public static void doTask(){
        int []arr = new int [10];
        int res = 0;

        for (int i = 0; i < 10; i++){
            arr[i] = (int) Math.round(Math.random() * 5);
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
