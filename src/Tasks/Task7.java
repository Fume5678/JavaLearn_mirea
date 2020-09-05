package Tasks;

import java.io.*;

public class Task7 {
    public static void doTask() throws IOException {
        System.out.println("Введите число для фактoриала:");
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String str = obj.readLine().toString();
        int n = Integer.parseInt(str);

        System.out.println(n + "! = " + Task7.getFactorioal(n));
    }

    static int getFactorioal(int n){
        int res =1 ;
        for (int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }
}
