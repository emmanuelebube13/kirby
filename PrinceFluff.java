// PrinceFluff class extending Player
class PrinceFluff extends Player {
    public PrinceFluff() {
        super("Prince Fluff");
    }

    @Override
    void moves(String direction) {
        System.out.println(name + " moves " + direction);
    }
}