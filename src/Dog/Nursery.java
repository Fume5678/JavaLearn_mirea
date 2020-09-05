package Dog;

public class Nursery {
    private Dog [] dogs = new Dog[0];

    public void nurseryInfo()
    {
        System.out.println("Dogs in nursery:");
        for(int i = 0; i < dogs.length; i++){
            System.out.println(dogs[i] + "\n----");
        }
    }

    public void addDog(Dog newDog){
        Dog []tmpDog = new Dog[dogs.length + 1];
        for (int i = 0; i < dogs.length; i++){
            tmpDog[i] = dogs[i];
        }
        tmpDog[dogs.length] = newDog;

        dogs = tmpDog;
    }
}
