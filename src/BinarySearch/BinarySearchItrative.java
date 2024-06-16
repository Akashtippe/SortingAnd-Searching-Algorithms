package BinarySearch;
//time complexity=o(logN)
public class BinarySearchItrative {

    // Iterative binary search method
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the key is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If key is greater, ignore the left half
            if (arr[mid] < key) {
                low = mid + 1;
            } else { // If key is smaller, ignore the right half
                high = mid - 1;
            }
        }

        // Key is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int key = 10;

        int result = binarySearch(arr, key);
        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}
