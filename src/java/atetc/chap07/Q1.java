package atetc.chap07;

/**
 * Design the data structures for a generic deck of cards. Explain how you would subclass it to implement particular card games.
 */
public class Q1 extends Q1Cards {

    public Q1(int v, Suit s) {
        super(v, s);
    }

    public int value() {
        int v = super.value();

        if (v == 1) {
            return 11;
        }

        if (v < 10) {
            return v;
        }

        return 10;
    }

    boolean isAce() {
        return super.value() == 1;
    }
}