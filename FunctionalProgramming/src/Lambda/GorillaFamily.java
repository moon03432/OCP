package Lambda;

/**
 * Created by moon on 25/11/2016.
 *
 */
public class GorillaFamily {

    private interface Gorilla {
        String move();
    };

    String walk = "walk";

    void everyonePlay(boolean baby) {
        final String approach = "amble";
//        approach = "run";
        walk = "sss";

        // lambda as inner class, the string need to be final or effectively final
        // TODO: why "walk" can compile?
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
