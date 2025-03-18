// Abstract Player class
abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    abstract void moves(String direction);
}
