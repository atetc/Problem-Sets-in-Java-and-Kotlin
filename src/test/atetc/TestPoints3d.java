package atetc;

import atetc.other.points3d.Q1;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestPoints3d {

    @Test
    public void testPlacePointsIn3D_1(){
        // TODO: isCollinearIn3D needed for full test
        assertTrue(!Q1.isCollinearIn2D(Q1.placePointsIn3D(0), 0));
        assertTrue(!Q1.isCollinearIn2D(Q1.placePointsIn3D(1), 1));
        assertTrue(!Q1.isCollinearIn2D(Q1.placePointsIn3D(2), 2));
        assertTrue(!Q1.isCollinearIn2D(Q1.placePointsIn3D(3), 3));
        assertTrue(!Q1.isCollinearIn2D(Q1.placePointsIn3D(4), 4));
        assertTrue(!Q1.isCollinearIn2D(Q1.placePointsIn3D(5), 5));
    }
}