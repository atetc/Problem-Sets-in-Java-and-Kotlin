package atetc;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestMain {

    @Test
    public void testMain(){
        int sum = Main.getSumOfTwoRectanglesArea(4, -6, 6, -4, -4, -4, -1, -1);
        assertTrue(sum == 13);

        sum = Main.getSumOfTwoRectanglesArea(-4, 1, 2, 6, 0, -1, 4, 3);
        assertTrue(sum == 42);

        sum = Main.getSumOfTwoRectanglesArea(0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(sum == 0);

        sum = Main.getSumOfTwoRectanglesArea(-4, 1, 2, 6, -5, -1, 4, 3);
        assertTrue(sum == 54);
    }
}