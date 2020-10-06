import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1Test {

    // Example test
    // DO NOT CHANGE
    @Test
    public void testBinarySearch() {
        int inputs[][] = {
                {},
                {3},
                {3},
                {1,3},
                {1,3},
                {4,6,8},
                {4,6,8},
                {4,6,8},
                {3,5,7,9,20},
                {3,5,7,9,20},
        };
        int targets[] = {9, 1, 3, 1, 3, 4, 6, 8, 3, 9};
        int answer[] = {-1, -1, 0, 0, 1, 0, 1, 2, 0, 3};

        assertEquals(inputs.length, targets.length);
        assertEquals(inputs.length, answer.length);

        for (int i=0; i<inputs.length; i++) {
            int actual = Problem1.binarySearch(inputs[i], targets[i]);
            int expected = answer[i];
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testDuplicateNums() {
        int inputs[][] = {
                {3,2,4,5,5,6},
                {0,0,0,0,0}
        };
        int targets[] = {5,0};
        int answer[] = {3,0};

        assertEquals(inputs.length, targets.length);
        assertEquals(inputs.length, answer.length);

        for (int i=0; i<inputs.length; i++) {
            int actual = Problem1.binarySearch(inputs[i], targets[i]);
            int expected = answer[i];
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testGreaterThanMid() {
        int inputs[][] = {
                {3,2,4,4,5,6,7,8,9}
        };
        int targets[] = {8};
        int answer[] = {7};

        assertEquals(inputs.length, targets.length);
        assertEquals(inputs.length, answer.length);

        for (int i=0; i<inputs.length; i++) {
            int actual = Problem1.binarySearch(inputs[i], targets[i]);
            int expected = answer[i];
            assertEquals(expected, actual);
        }
    }

}
