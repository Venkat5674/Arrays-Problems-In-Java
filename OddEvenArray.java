import java.util.Scanner;

class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The Odd Array elements are: ");
        for (int data : arr) {
            if (data % 2 != 0) {
                System.out.print(data + "  ");
            }
        }

        System.out.println(); // <-- line break between outputs

        System.out.print("The Even Array elements are: ");
        for (int data : arr) {
            if (data % 2 == 0) {
                System.out.print(data + "  ");
            }
        }
    }
}
