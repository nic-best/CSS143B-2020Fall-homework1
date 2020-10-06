import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        int inputsWeSort[][] = {
                {4,3,2,1},
                {0},
                {1,0},
                {1,4,3,5,7,9,2,100,40,0},
                {-5,-10,20},
                {-5,-3,-20,-7},
                {-5,-3,5,20,-4,-40,500},
                {-5,-5,3,-5,-5,3},
                {}
        };

        int inputsSorted[][] = new int[inputsWeSort.length][];
        //copy and sort the arrays from inputsWeSort into inputsSorted
        for (int i = 0; i < inputsWeSort.length; i++) {
            inputsSorted[i] = Arrays.copyOf(inputsWeSort[i],inputsWeSort[i].length);
            Arrays.sort(inputsSorted[i]);
        }

        assertEquals(inputsWeSort.length, inputsSorted.length);

        for (int i=0; i<inputsSorted.length; i++) {
            Problem2.bubbleSort(inputsWeSort[i]);
            //https://www.java2novice.com/junit-examples/assert-array-equals/
            assertArrayEquals(inputsWeSort[i], inputsSorted[i]);

        }
    }


    //https://stackoverflow.com/questions/42374416/junit-right-way-of-test-expected-exceptions
    //tests for IllegalArgumentException when null array is passed
    @Test(expected = IllegalArgumentException.class)
    public void testNullBubbleSort(){
        int[] input = null;
        Problem2.bubbleSort(input);
    }
}
