// Squashini class extending Boss
class Squashini extends Boss {
    public Squashini() {
        super("Squashini", 90);
    }

    @Override
    void attack() {
        System.out.println(name + " throws magic cards!");
    }

    void performMagic() {
        System.out.println(name + " conjures rabbits out of hats!");
    }
}