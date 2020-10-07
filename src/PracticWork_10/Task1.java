package PracticWork_10;

import javax.crypto.spec.PSource;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int fsum = 15, fcnt = 3, scnt = 0;

        int i = (int) Math.pow(10, fcnt - 1);
        while (i < Math.pow(10, fcnt)){
            int ssum = 0, num = i;

            while (num != 0){
                ssum += num % 10;
                num /= 10;
            }

            if(ssum == fsum){
                scnt++;
            }

            i++;
        }

        System.out.println(scnt);
    }
}
