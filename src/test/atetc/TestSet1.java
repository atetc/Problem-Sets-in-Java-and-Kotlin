package atetc;

import atetc.other.arrays.Q4;
import atetc.other.points3d.Q1;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestSet1 {

    @Test
    public void testIsLeftRightArraysSumEqual_1_2(){
        assertTrue(!atetc.other.arrays.Q3.isLeftRightArraysSumEqual(null));

        int[] arr = {4};
        assertTrue(!atetc.other.arrays.Q3.isLeftRightArraysSumEqual(arr));

        arr = new int[]{4, 1};
        assertTrue(!atetc.other.arrays.Q3.isLeftRightArraysSumEqual(arr));

        arr = new int[]{1, 2, 3, 4, 6};
        assertTrue(atetc.other.arrays.Q3.isLeftRightArraysSumEqual(arr));

        arr = new int[]{1, 2, 4, 6};
        assertTrue(!atetc.other.arrays.Q3.isLeftRightArraysSumEqual(arr));
    }

    @Test
    public void testGetCountOfPairsWithDifference_1_3(){
        assertTrue(Q4.getCountOfPairsWithDifference(null, 5) == null);

        int[] arr = new int[]{1};
        assertTrue(Q4.getCountOfPairsWithDifference(arr, 5) == null);

        arr = new int[]{1, 5};
        assertTrue(Q4.getCountOfPairsWithDifference(arr, 4) == 1);

        arr = new int[]{1, 5};
        assertTrue(Q4.getCountOfPairsWithDifference(arr, 5) == 0);

        arr = new int[]{1, 9, 5};
        assertTrue(Q4.getCountOfPairsWithDifference(arr, 4) == 2);

        arr = new int[]{1, 9, 5, 4};
        assertTrue(Q4.getCountOfPairsWithDifference(arr, 5) == 1);
    }

    @Test
    public void testPlacePointsIn3D_1_4(){
        // TODO: isCollinearIn3D needed for test
        assertTrue(!Q1.isCollinearIn2D(Q1.placePointsIn3D(0), 0));
        assertTrue(!Q1.isCollinearIn2D(Q1.placePointsIn3D(1), 1));
        assertTrue(!Q1.isCollinearIn2D(Q1.placePointsIn3D(2), 2));
        assertTrue(!Q1.isCollinearIn2D(Q1.placePointsIn3D(3), 3));
        assertTrue(!Q1.isCollinearIn2D(Q1.placePointsIn3D(4), 4));
        assertTrue(!Q1.isCollinearIn2D(Q1.placePointsIn3D(5), 5));
    }
}