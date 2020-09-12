package PracticWork_3.Human;

class Hand extends BodyItem{
    public Hand(int id) {
        super(id);
    }

    @Override
    public boolean takingDamage(int damage) {
        if (health < 0) {
            System.out.println("Hand already destroyed!");
            return false;
        }
        health -= damage;
        return true;
    }
}
