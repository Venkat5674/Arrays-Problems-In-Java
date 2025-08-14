import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Removing duplicates
        int newSize = size; // track new length after removing duplicates
        for (int i = 0; i < newSize; i++) {
            for (int j = i + 1; j < newSize; j++) {
                if (arr[i] == arr[j]) {
                    // Shift left to remove duplicate
                    for (int k = j; k < newSize - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    newSize--; // reduce size
                    j--; // check new element at same index
                }
            }
        }

        // Print array without duplicates
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
