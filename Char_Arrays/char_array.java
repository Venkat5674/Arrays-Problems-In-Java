import java.util.Scanner;

public class char_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of array
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        
        // Create an array of given size
        char[] arr = new char[size];

        // Take array elements as input
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(i+1 + " " + arr[i] + " " + (int) arr[i]);
        }
        

        sc.close();
    }
}
