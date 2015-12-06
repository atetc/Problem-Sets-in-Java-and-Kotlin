package atetc.chap05;

/**
 * Explain what the following code does: ((n & (n-1)) == 0).
 */
public class Q4 {

    public static boolean code(int n) {
        return (n & (n-1)) == 0;
    }
}