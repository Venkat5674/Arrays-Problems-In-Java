import java.util.Scanner;

class AverageOfArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        
        int sum = 0;
        System.out.println("Enter the No.of Elements of Array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            sum += arr[i]; 
        }
        
        double average = (double) sum / size;
        
        System.out.println("The average of Array is : " + average);
    }
}
