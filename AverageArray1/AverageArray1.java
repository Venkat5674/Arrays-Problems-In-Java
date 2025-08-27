import java.util.Scanner;

class AverageArray1 {
    public static void average(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        
        double avg = (double) sum / arr.length; // cast to double for decimal result
        System.out.println("Average of array elements: " + avg);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        average(arr);
        
        sc.close();
    }
}
