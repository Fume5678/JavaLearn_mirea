package PracticWork_3.Human;

class Head extends BodyItem{
    public Head(int id) {
        super(id);
    }

    @Override
    public boolean takingDamage(int damage) {
        if (health < 0) {
            System.out.println("Head already destroyed!");
            return false;
        }
        health -= damage;
        return true;
    }
}
