package PracticWork_1;

public class Nursery {
    private Dog [] dogs = new Dog[0];

    public String nurseryInfo()
    {
        StringBuilder info = new StringBuilder();
        info.append("Dogs in nursery:\n");

        // Добавление в строку инфы о собаке
        for(int i = 0; i < dogs.length; i++){
            info.append(dogs[i].toString()).append("\n----\n");
        }

        return info.toString();
    }

    public void addDog(Dog ... j){
        // Добавление собак в массив питомника методом копирования во временный массив
        Dog[] tmpDog = new Dog[dogs.length + j.length];
        System.arraycopy(dogs, 0, tmpDog, 0, dogs.length);
        System.arraycopy(j, 0, tmpDog, dogs.length, j.length);
        dogs = tmpDog;
    }
}
