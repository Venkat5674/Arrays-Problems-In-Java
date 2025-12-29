import java.util.Scanner;

public class ArrayCreatePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int num = sc.nextInt();
        
        int[] arr = new int[num];
        
        System.out.println("Enter " + num + " elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array elements are:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
