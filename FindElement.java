import java.util.Scanner;

class FindElement{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        
        int sum = 0;
        System.out.println("Enter the Elements of Array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
           
        }
        
       System.out.println("Enter the value to search : ");
       int value = sc.nextInt();
       
       boolean found = false;
       
       for(int i = 0; i < size; i++){
           if(arr[i] == value){
               System.out.println("Value found at index : " + i);
               found = true;
               break;
           }
       }
        if(!found){
        System.out.println("Value not found in the array");
        }
    }
}
