

public class Quicksort {

    private static int partition(int array[], int left, int right) {

        int p = array[left]; //This is the pivot of Quicksort
        while (true) {
            // While the left element is higher than the pivot, the index moves
            while (array[left] > p) {
                left++;
            }
            // While the right element is lower than the pivot, the index moves
            while (array[right] < p) {
                right--;
            }

            // If the left element is high or equal to the right element, we don't exchange them
            if (left >= right) {
                // We return right to divide and sort again
                return right;
            }

            // If the statement above is not true, then we exchange their positions
            else {
                int temporal = array[left];
                array[left] = array[right];
                array[right] = temporal;
                left++;
                right--;
            }
        }
    }

    static void quicksort(int array[], int left, int right) {
        if (left < right) {
            int Partition = partition(array, left, right);
            quicksort(array, left, Partition);
            quicksort(array, Partition + 1, right);
        }
    }
}
