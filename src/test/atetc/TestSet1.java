package atetc;

import atetc.other.set1.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestSet1 {

    @Test
    public void testFindUnpaired_1_1(){
        assertTrue(Q1.findUnpaired(null) == null);

        int[] arr = new int[]{1};
        assertTrue(Q1.findUnpaired(arr) == 1);

        arr = new int[]{1, 1, 2, 2, 3, 3, 5, 66, 66};
        assertTrue(Q1.findUnpaired(arr) == 5);
    }

    @Test
    public void testIsLeftRightArraysSumEqual_1_2(){
        assertTrue(!Q2.isLeftRightArraysSumEqual(null));

        int[] arr = {4};
        assertTrue(!Q2.isLeftRightArraysSumEqual(arr));

        arr = new int[]{4, 1};
        assertTrue(!Q2.isLeftRightArraysSumEqual(arr));

        arr = new int[]{1, 2, 3, 4, 6};
        assertTrue(Q2.isLeftRightArraysSumEqual(arr));

        arr = new int[]{1, 2, 4, 6};
        assertTrue(!Q2.isLeftRightArraysSumEqual(arr));
    }

    @Test
    public void testGetCountOfPairsWithDifference_1_3(){
        assertTrue(Q3.getCountOfPairsWithDifference(null, 5) == null);

        int[] arr = new int[]{1};
        assertTrue(Q3.getCountOfPairsWithDifference(arr, 5) == null);

        arr = new int[]{1, 5};
        assertTrue(Q3.getCountOfPairsWithDifference(arr, 4) == 1);

        arr = new int[]{1, 5};
        assertTrue(Q3.getCountOfPairsWithDifference(arr, 5) == 0);

        arr = new int[]{1, 9, 5};
        assertTrue(Q3.getCountOfPairsWithDifference(arr, 4) == 2);

        arr = new int[]{1, 9, 5, 4};
        assertTrue(Q3.getCountOfPairsWithDifference(arr, 5) == 1);
    }

    @Test
    public void testPlacePointsIn3D_1_4(){
        // TODO: isCollinearIn3D needed for test
        assertTrue(!Q4.isCollinearIn2D(Q4.placePointsIn3D(0), 0));
        assertTrue(!Q4.isCollinearIn2D(Q4.placePointsIn3D(1), 1));
        assertTrue(!Q4.isCollinearIn2D(Q4.placePointsIn3D(2), 2));
        assertTrue(!Q4.isCollinearIn2D(Q4.placePointsIn3D(3), 3));
        assertTrue(!Q4.isCollinearIn2D(Q4.placePointsIn3D(4), 4));
        assertTrue(!Q4.isCollinearIn2D(Q4.placePointsIn3D(5), 5));
    }
}