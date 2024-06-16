package LinearSearch;
//time complexity=o(n)
public class LinearSearchRecursive {

    // Recursive method to perform linear search
    public static int linearSearch(int[] arr, int key, int index) {
        // Base case: if the index is out of bounds, return -1
        if (index >= arr.length) {
            return -1;
        }
        // If the element at the current index matches the key, return the index
        if (arr[index] == key) {
            return index;
        }
        // Recur for the next index
        return linearSearch(arr, key, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int key = 7;
        int result = linearSearch(arr, key, 0);

        if (result != -1) {
            System.out.println("Element " + key + " is found at index " + result);
        } else {
            System.out.println("Element " + key + " is not found in the array");
        }
    }
}
