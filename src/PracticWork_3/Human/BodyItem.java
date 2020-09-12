package PracticWork_3.Human;

abstract class BodyItem implements CanTakingDamage{
    protected int id;
    protected int health;

    public BodyItem(int id) {
        this.health = 100;
        this.id = id;
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

    public boolean isAlive(){
        return health > 0;
    }

    @Override
    public String toString() {
        String str = "";
        if (health <= 0)
            str = "\nIs Destroyed";
        else
            str = "\nHealth = " + Integer.toString(health);
        return "(id " + id + ")" + str;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
