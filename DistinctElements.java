import java.util.Scanner;

class DistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Distinct elements are: ");
        for(int i=0; i<n; i++){
            boolean isDistinct = true;
            
            // check if element already appeared before
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    isDistinct = false;
                    break;
                }
            }
            
            if(isDistinct){
                System.out.print(arr[i] + " ");
            }
        }
        
        sc.close();
    }
}
