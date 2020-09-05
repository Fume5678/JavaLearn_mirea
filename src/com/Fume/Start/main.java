package com.Fume.Start;

import Tasks.*;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
            System.out.println("\n====== Task 3 ======");
            Task3.doTask();

            System.out.println("\n====== Task 4 ======");
            Task4.doTask(args);

            System.out.println("\n====== Task 5 ======");
            Task5.doTask();

            System.out.println("\n====== Task 6 ======");
            Task6.doTask();

            System.out.println("\n====== Task 7 ======");
            Task7.doTask();

            /*
            System.out.println("\n====== Task Class ======");
            Dog dog = new Dog("alex", 2);
            System.out.println(dog);

            dog.setName("sad");
            dog.setAge(4);
            System.out.println(dog);

            System.out.println("\n====== Task Class Nursery ======");
            Dog dog2 = new Dog("alex2", 2);
            Dog dog3 = new Dog("alex3", 3);
            Nursery nursery = new Nursery();
            nursery.addDog(dog);
            nursery.addDog(dog2);
            nursery.nurseryInfo();

            nursery.addDog(dog3);
            nursery.nurseryInfo();
             */
    }
}
