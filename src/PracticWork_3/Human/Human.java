package PracticWork_3.Human;

public class Human {
    private Leg leg1, leg2;
    private Hand hand1, hand2;
    private Head head;

    public Human(){
        leg1 = new Leg(1);
        leg2 = new Leg(2);
        hand1 = new Hand(3);
        hand2 = new Hand(4);
        head = new Head(5);
    }

    public boolean isAlive(){
        return leg1.isAlive() && leg2.isAlive() &&
                hand1.isAlive() && hand2.isAlive() &&
                head.isAlive();
    }

    public void throwDamage(int id, int dmg){
        if (leg1.getId() == id)
            leg1.takingDamage(dmg);
        if (leg2.getId() == id)
            leg2.takingDamage(dmg);
        if (hand1.getId() == id)
            hand1.takingDamage(dmg);
        if (hand2.getId() == id)
            hand2.takingDamage(dmg);
        if (head.getId() == id)
            head.takingDamage(dmg);
    }

    @Override
    public String toString() {
        return  "leg1 >> " + leg1 +
                "\nleg2 >> " + leg2 +
                "\nhand1 >> " + hand1 +
                "\nhand2 >> " + hand2 +
                "\nhead >> " + head;
    }
}
