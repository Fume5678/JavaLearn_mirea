package Dog;

public class Dog {
    private String name;
    private int age;

    public Dog() {
        name = "noName";
        age = 0;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int humanAge(){
        return age * 7;
    }

    @Override
    public String toString() {
        String os = "Name: " + name + "\nAge: " + age;
        return os;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
