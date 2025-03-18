// Boss class
class Boss {
    protected String name;
    protected int health;

    public Boss(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void attack() {
        System.out.println(name + " attacks!");
    }

    void defend() {
        System.out.println(name + " defends!");
    }
}
