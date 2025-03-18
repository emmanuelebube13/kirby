
// HotWings class extending Boss
class HotWings extends Boss {
    public HotWings() {
        super("Hot Wings", 120);
    }

    @Override
    void attack() {
        System.out.println(name + " unleashes a fiery blast!");
    }

    void fly() {
        System.out.println(name + " soars through the air!");
    }
}
