import java.util.Scanner;

class NonDuplicateElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Non-duplicate elements:");
        for (int i = 0; i < size; i++) {
            int count = 0;

            // Count occurrences of a[i]
            for (int j = 0; j < size; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            // If appears only once, print it
            if (count == 1) {
                System.out.println(a[i]);
            }
        }
    }
}
