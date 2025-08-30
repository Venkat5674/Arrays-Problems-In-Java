/**
 * Q2: Array Reversal
 * This program demonstrates how to reverse an array in Java.
 * The logic uses a two-pointer approach to swap elements from the
 * beginning and end of the array, moving towards the center.
 */
public class ArrayReverser {

    public static void main(String[] args) {
        // Initialize an array
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Print the original array
        System.out.print("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Reverse the array
        reverse(originalArray);

        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Reverses the given integer array in place.
     * @param arr The array to be reversed.
     */
    public static void reverse(int[] arr) {
        // Check for null or empty array to avoid errors
        if (arr == null || arr.length <= 1) {
            return;
        }

        // Initialize two pointers
        int start = 0;
        int end = arr.length - 1;

        // Swap elements from the start and end, moving towards the center
        while (start < end) {
            // Temporary variable to hold the start element
            int temp = arr[start];

            // Swap the elements
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers
            start++;
            end--;
        }
    }
}
