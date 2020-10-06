import java.util.Arrays;

public class Problem1 {

    //Algorithm reminder from: https://www.geeksforgeeks.org/binary-search/
    //Solution by Nicholas Bestauros

    //iterative would probably be faster than this specific recursive solution because I decided to copy the array

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        //we are told the array is sorted
        //not guaranteed to have non null array or array of 0 length
        if(data==null || data.length==0){
            return -1;
        }
        //get length, choose lower index if length is even
        int mid;
        if(data.length%2 ==0){
            mid = (data.length / 2) - 1;
        }
        //if its odd, int division will make it the midpoint
        else{
            mid = data.length / 2;
        }

        //Spec calls for first index of target
        //while loop keeps moving the index we are looking at to the left until we:
        //  find a value of data != target
        //  move to the front of the array
        //returns the index of the first instance of the target
        if(data[mid]==target){
            int leftChecker = mid;
            int newFoundIndex = mid;
            while(leftChecker-1>=0 && data[leftChecker]==target){
                leftChecker = leftChecker-1;
                if(data[leftChecker]==target){
                    newFoundIndex=leftChecker;
                }
            }
            return newFoundIndex;
        }
        //check the right half of the array
        else if (data[mid]<target){
            //recursively search the top half of the array
            //need to add 1 and the value of mid to the return value
            //we are only searching the top half of the array, not the whole array
            //the new index will start at 0
            return 1+mid+binarySearch(Arrays.copyOfRange(data,mid+1,data.length),target);
        }
        else if (data[mid]>target){
            //recursively search the bottom half of the array
            return binarySearch(Arrays.copyOfRange(data,0,mid),target);
        }

        return -1;
    }
}
