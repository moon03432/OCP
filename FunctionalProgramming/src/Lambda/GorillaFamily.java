package Lambda;

/**
 * Created by moon on 25/11/2016.
 */
public class GorillaFamily {

    String walk = "walk";

    void everyonePlay(boolean baby) {
        String approach = "amble";
//        approach = "run";

        // lambda as inner class, the string need to be final or effectively final
        play(()-> walk);
        play(()-> baby ? "hitch a ride": "run");
        play(()-> approach);
    }

    void play(Gorilla g) {
        System.out.println(g.move());
    }

    public static void main(String[] args) {
        GorillaFamily family = new GorillaFamily();

        family.everyonePlay(true);
    }
}
