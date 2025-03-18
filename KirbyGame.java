
// Main class to test the implementation
public class KirbyGame {
    public static void main(String[] args) {
        // Creating Player instances
        Player kirby = new Kirby();
        Player princeFluff = new PrinceFluff();

        kirby.moves("left");
        princeFluff.moves("right");

        // Creating Boss instances
        Boss fangora = new Fangora();
        Boss hotWings = new HotWings();
        Boss squashini = new Squashini();

        fangora.attack();
        hotWings.attack();
        ((HotWings) hotWings).fly();
        squashini.attack();
        ((Squashini) squashini).performMagic();
    }
}
