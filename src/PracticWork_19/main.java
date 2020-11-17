package PracticWork_19;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String msg = "";
        Scanner in = new Scanner(System.in);
        msg = in.nextLine();

        FileHandler.writeToFile("text.txt", msg);
        String new_msg = FileHandler.readFile("text.txt");
        System.out.println("Из файла считанно: " + new_msg );

        msg = in.nextLine();
        FileHandler.appendToFile("text.txt", msg);
        new_msg = FileHandler.readFile("text.txt");
        System.out.println("\nИз файла считанно: " + new_msg);

    }
}
