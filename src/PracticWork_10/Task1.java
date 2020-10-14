package PracticWork_10;

import javax.crypto.spec.PSource;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int s = 15, k = 3, res = 0;

        int i = (int) Math.pow(10, k - 1);
        while (i < Math.pow(10, k)){
            int ssum = 0, num = i;

            while (num != 0){
                ssum += num % 10;
                num /= 10;
            }

            if(ssum == s){
                res++;
            }

            i++;
        }

        System.out.println(res);
    }
}
