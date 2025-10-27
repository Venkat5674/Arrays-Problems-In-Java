import java.util.Scanner;

public class Even_odd {
   public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        } 

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
        
        for(int j = 0; j < arr.length; j++){
            if(arr[j] % 2 != 0){
                System.out.print(arr[j] + " ");
            }
        }
    }

}
