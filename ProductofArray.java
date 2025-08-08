import java.util.Scanner;

class ProductofArray{
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        
        System.out.print("Enter the Array elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int product = 1;
        for(int data : arr){
            product *= data;
        }
        System.out.print("The product of array elements is " + product);
    }
}
