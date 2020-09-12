package PracticWork_3;
import PracticWork_3.Human.*;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();

        System.out.println(human);
        human.throwDamage(3, 30);
        System.out.println("+++++++++\n" + human);

        human.throwDamage(3, 100);
        human.throwDamage(3, 50);
        System.out.println("+++++++++\n" + human);

    }
}
