import java.util.Scanner;

class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] copy = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            copy[i] = arr[i];
        }

        System.out.println("Copied array:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
