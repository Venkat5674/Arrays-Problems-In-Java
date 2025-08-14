import java.util.Scanner;

class SplitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and array
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Find mid point
        int mid = size / 2;

        // Create two arrays
        int[] firstHalf = new int[mid];
        int[] secondHalf = new int[size - mid];

        // Copy first half
        for (int i = 0; i < mid; i++) {
            firstHalf[i] = arr[i];
        }

        // Copy second half
        for (int i = mid; i < size; i++) {
            secondHalf[i - mid] = arr[i];
        }

        // Print first half
        System.out.print("First Array: ");
        for (int num : firstHalf) {
            System.out.print(num + " ");
        }

        // Print second half
        System.out.print("\nSecond Array: ");
        for (int num : secondHalf) {
            System.out.print(num + " ");
        }
    }
}
