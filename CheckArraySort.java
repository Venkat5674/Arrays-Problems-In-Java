import java.util.Scanner;

class ArraySort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt();
        
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        boolean ans = isSorted(arr,n);
        
        if(ans == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
    static boolean isSorted(int arr[], int n){
        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
