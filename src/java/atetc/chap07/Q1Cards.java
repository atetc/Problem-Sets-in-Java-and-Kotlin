package atetc.chap07;

/**
 * Created by Dev_Android on 25.11.2015.
 */
public class Q1Cards {

    private int card;
    private Suit suit;

    public Q1Cards(int c, Suit s) {
        card = c;
        suit = s;
    }

    public int value() {
        return card;
    }

    public Suit suit() {
        return suit;
    }

    public enum Suit {
        SPADE(1), HEART(2), CLUBS(3), DIAMONDS(4);
        public int value;

        Suit(int v) {
            value = v;
        }
    }
}
