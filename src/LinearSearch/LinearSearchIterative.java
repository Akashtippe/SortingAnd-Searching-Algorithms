package LinearSearch;
//time complexity=o(n)
public class LinearSearchIterative {

    // Iterative linear search method
    public static int linearSearch(int[] arr, int key) {
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element matches the key, return the index
            if (arr[i] == key) {
                return i;
            }
        }
        // If the key is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int key = 7;

        int result = linearSearch(arr, key);
        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}
