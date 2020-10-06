public class Problem2 {

    // Do not change signature (function name, parameters)
    //sorts given int array in Ascending order
    public static void bubbleSort(int[] data) {
        if(data == null){
            throw new IllegalArgumentException();
        }

        //inner is one "iteration" of bubble sort, it swaps adjacent values that are out of order
        //by running the "outer" loop, we run enough iterations of bubble sort to fully sort the array
        /*
        NOTE: this is the "dumb" version of bubble sort, the smart version stops once no swaps are made
        in an iteration
         */
        for(int outer = 0; outer<data.length-1; outer++){
            for(int inner = 0; inner<data.length-1; inner++){
                if(data[inner]>data[inner+1]){
                    int temp = data[inner];
                    data[inner] = data[inner+1];
                    data[inner+1]=temp;
                }
            }
        }
    }
}
