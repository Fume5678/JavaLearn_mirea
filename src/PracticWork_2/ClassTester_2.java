package PracticWork_2;

import PracticWork_1.Dog;
import PracticWork_1.Nursery;
import SwingApp.Simple;

public class ClassTester_2 {
    static public void testPractic(){
        StringBuilder result = new StringBuilder();

        // Испытание класса собаки
        Dog dog = new Dog("alex", 2);

        result.append(dog).append("\n").append("\n");
        dog.setName("sad");
        dog.setAge(4);
        result.append("After changing:\n").append(dog).append("\n");

        result.append("\nPracticWork_1.Dog to human age: ").append(dog.humanAge());

        // Испытание класса питомника
        result.append("\n\n=================\n");
        Dog dog2 = new Dog("alex2", 2);
        Dog dog3 = new Dog("alex3", 3);
        Nursery nursery = new Nursery();

        // Добавление  собак
        nursery.addDog(dog);
        result.append(nursery.nurseryInfo());

        // Добавление еще одной собаки
        nursery.addDog(dog2, dog3);
        result.append("\nAfter adding:\n");
        result.append(nursery.nurseryInfo());

        new Simple(result);
    }
}
