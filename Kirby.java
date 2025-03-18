// Kirby class extending Player
class Kirby extends Player {
    public Kirby() {
        super("Kirby");
    }

    @Override
    void moves(String direction) {
        System.out.println(name + " moves " + direction);
    }
}