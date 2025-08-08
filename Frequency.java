import java.util.Scanner;

class Frequency{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Size of Array : ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        
        System.out.println("Enter the elements : ");
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the Number to find the occurences : ");
        int n = sc.nextInt();
        
        int freq = 0;
        
        for(int a : arr){
            if(a == n){
                freq++;
            }
        }
        System.out.print(freq);
    }
    
}
