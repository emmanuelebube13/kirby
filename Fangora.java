// Fangora class extending Boss
class Fangora extends Boss {
    public Fangora() {
        super("Fangora", 100);
    }

    @Override
    void attack() {
        System.out.println(name + " attacks with its tail!");
    }
}