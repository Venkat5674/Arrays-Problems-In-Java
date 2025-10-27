import java.util.Scanner;

public class Two_digit {

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
            if(arr[i] >= 10 && arr[i] <= 99){
                if(arr[i] % 7 == 0){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    } 
