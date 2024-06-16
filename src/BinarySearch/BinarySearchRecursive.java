package BinarySearch;
//time complexity=o(logN)
public class BinarySearchRecursive {

    // Recursive binary search method
    public static int binarySearch(int[] arr, int key, int left, int right) {
        // Base case: if the left index is greater than the right index, the key is not present
        if (left > right) {
            return -1;
        }

        // Calculate the middle index
        int mid = left + (right - left) / 2;

        // Check if the key is present at mid
        if (arr[mid] == key) {
            return mid;
        }

        // If key is greater, ignore the left half
        if (arr[mid] < key) {
            return binarySearch(arr, key, mid + 1, right);
        } else {
            // If key is smaller, ignore the right half
            return binarySearch(arr, key, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int key = 10;

        int result = binarySearch(arr, key, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}
