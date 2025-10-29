import java.util.Scanner;

public class three_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of array
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int count = 0;
        // Create an array of given size
        int[] arr = new int[size];

        // Take array elements as input
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 100 && arr[i] <=999){
                count++;
            }
        }
        
        System.out.println(count);

        sc.close();
    }
}
