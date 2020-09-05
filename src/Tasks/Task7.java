package Tasks;

import java.io.*;

public class Task7 {
    public static void doTask() throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String str = obj.readLine().toString();
        int n = Integer.parseInt(str), res = 1;

        for (int i = 1; i <= n; i++){
            res *= i;
        }

        System.out.println(n + "! = " + res);
    }
}
