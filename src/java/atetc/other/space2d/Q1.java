package atetc.other.space2d;

public class Q1 {

    // direct approach
    public static int getMaximumArea(int[] arr) {
        int result = 0;

        if (arr == null) {
            return result;
        }

        int size = arr.length;
        for (int start = 0; start < size; start++) {
            for (int count = 1; count <= size - start; count++) {
                int area = getMaxRectangleHeight(start, start + count, arr) * count;
                if (area > result) {
                    result = area;
                }
            }
        }

        return result;
    }

    private static int getMaxRectangleHeight(int start, int end, int[] arr) {
        int result = arr[start];
        for (int i = start + 1; i < end; i++) {
            int height = arr[i];
            if (height < result) {
                result = height;
            }
        }
        return result;
    }
}