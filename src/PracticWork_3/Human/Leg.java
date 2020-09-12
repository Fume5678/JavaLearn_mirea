package PracticWork_3.Human;

class Leg extends BodyItem {
    public Leg(int id) {
        super(id);
    }

    @Override
    public boolean takingDamage(int damage) {
        if (health < 0) {
            System.out.println("Leg already destroyed!");
            return false;
        }
        health -= damage;
        return true;
    }
}
